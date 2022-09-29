package pl.coderslab.charity.donation;


import org.springframework.stereotype.Service;
import pl.coderslab.charity.category.CategoryRepository;
import pl.coderslab.charity.institution.Institution;
import pl.coderslab.charity.institution.InstitutionRepository;

@Service
public class DonationService {
    private final DonationRepository donationRepository;
    private final InstitutionRepository institutionRepository;
    private final CategoryRepository categoryRepository;

    public DonationService(DonationRepository donationRepository, InstitutionRepository institutionRepository, CategoryRepository categoryRepository) {
        this.donationRepository = donationRepository;
        this.institutionRepository = institutionRepository;
        this.categoryRepository = categoryRepository;
    }

    public void addDonation(DonationSaveDto donationToSave) {
        Donation donation = new Donation();
        donation.setQuantity(donationToSave.getQuantity());
        donation.setCategories(donationToSave.getCategories());
        donation.setCity(donationToSave.getCity());
        donation.setInstitution(donationToSave.getInstitution());
        donation.setStreet(donationToSave.getStreet());
        donation.setZipCode(donationToSave.getZipCode());
        donation.setPickUpComment(donationToSave.getPickUpComment());
        donation.setPickUpDate(donationToSave.getPickUpDate());
        donation.setPickUpTime(donationToSave.getPickUpTime());
//        Institution institution = institutionRepository.findAllById(donationToSave.getInstitution());
        donationRepository.save(donation);
    }
}
