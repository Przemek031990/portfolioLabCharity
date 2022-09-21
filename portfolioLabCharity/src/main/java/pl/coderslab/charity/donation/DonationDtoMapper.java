package pl.coderslab.charity.donation;

public class DonationDtoMapper {
    static DonationDto map(Donation donation) {
        return new DonationDto(
                donation.getId(),
                donation.getQuantity(),
                donation.getCategories(),
                donation.getInstitution().getName(),
                donation.getStreet(),
                donation.getCity(),
                donation.getZipCode(),
                donation.getPickUpDate(),
                donation.getPickUpTime(),
                donation.getPickUpComment()
        );
    }
}
