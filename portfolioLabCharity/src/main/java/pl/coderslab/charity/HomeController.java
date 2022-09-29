package pl.coderslab.charity;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import pl.coderslab.charity.category.CategoryDto;
import pl.coderslab.charity.category.CategoryService;
import pl.coderslab.charity.donation.DonationDto;
import pl.coderslab.charity.donation.DonationRepository;
import pl.coderslab.charity.donation.DonationSaveDto;
import pl.coderslab.charity.donation.DonationService;
import pl.coderslab.charity.institution.Institution;
import pl.coderslab.charity.institution.InstitutionRepository;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;


@Controller
public class HomeController {
    private final CategoryService categoryService;
    private final DonationRepository donationRepository;
    private final InstitutionRepository institutionRepository;
    private final DonationService donationService;


    public HomeController(CategoryService categoryService, DonationRepository donationRepository, InstitutionRepository institutionRepository, DonationService donationService) {
        this.categoryService = categoryService;
        this.donationRepository = donationRepository;
        this.institutionRepository = institutionRepository;
        this.donationService = donationService;
    }


    @RequestMapping("/")
    public String homeAction(Model model) {
        AtomicInteger iloscWorkow = new AtomicInteger();
        AtomicInteger iloscDarow = new AtomicInteger(0);
        List<Institution> allInstitution = institutionRepository.findAll();
        donationRepository.findAll().forEach(donation -> {
            iloscDarow.set((int) (iloscDarow.get() + 1));
        });
        donationRepository.findAll().forEach(donation -> {
            iloscWorkow.set(iloscWorkow.get() + donation.getQuantity());
        });
//        institutionRepository.findAll().forEach(institution -> {
//            nazwaInstytucji.set(Integer.parseInt(nazwaInstytucji.get() + institution.getName()));
//        });
//        institutionRepository.findAll().forEach(institution -> {
//            opisInstytucji.set(Integer.parseInt(opisInstytucji.get() + institution.getDescription()));
//        });
//        List<CategoryDto> allCategory = categoryService.findAllCategory();
        model.addAttribute("iloscWorkow", "" + iloscWorkow.get());
        model.addAttribute("iloscDarow", "" + iloscDarow.get());
        model.addAttribute("allInstitution",  allInstitution);
        return "index";
    }

    @GetMapping("/dodaj-dar")
    public String addDonationForm(Model model) {
        DonationSaveDto donation = new DonationSaveDto();
        model.addAttribute("donation", donation);
        return "donation-form";
    }
//@PostMapping("/dodaj-dar")
//    public String addDonation(DonationSaveDto donation, RedirectAttributes redirectAttributes) {
//        donationService.addDonation(donation);
//
//}
}
