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
        model.addAttribute("allInstitution", allInstitution);
        return "index";
    }

    @GetMapping("/form1")
    public String addDonationForm(Model model) {
        DonationSaveDto donation = new DonationSaveDto();
        model.addAttribute("donation", donation);
        return "form1";
    }

    @PostMapping("/form1")
    public String addDonation(DonationSaveDto donation, RedirectAttributes redirectAttributes) {
        donationService.addDonation(donation);

        return "form2";


    }

    @GetMapping("/form2")
    public String addDonationForm2(Model model) {
        DonationSaveDto donation = new DonationSaveDto();
        model.addAttribute("donation", donation);
        return "form2";
    }

    @PostMapping("/form2")
    public String addDonation1(DonationSaveDto donation, RedirectAttributes redirectAttributes) {
        donationService.addDonation(donation);
        return "form3";
    }

    @GetMapping("/form3")
    public String addDonationForm3(Model model) {
        DonationSaveDto donation = new DonationSaveDto();
        model.addAttribute("donation", donation);
        return "form3";
    }

    @PostMapping("/form3")
    public String addDonation2(DonationSaveDto donation, RedirectAttributes redirectAttributes) {
        donationService.addDonation(donation);
        return "form4";
    }

    @GetMapping("/form4")
    public String addDonationForm4(Model model) {
        DonationSaveDto donation = new DonationSaveDto();
        model.addAttribute("donation", donation);
        return "form4";
    }

    @PostMapping("/form4")
    public String addDonation3(DonationSaveDto donation, RedirectAttributes redirectAttributes) {
        donationService.addDonation(donation);
        return "form5";
    }

    @GetMapping("/form5")
    public String addDonationForm5(Model model) {
        DonationSaveDto donation = new DonationSaveDto();
        model.addAttribute("donation", donation);
        return "form5";
    }

    @PostMapping("/form5")
    public String addDonation4(DonationSaveDto donation, RedirectAttributes redirectAttributes) {
        donationService.addDonation(donation);
        redirectAttributes.addFlashAttribute(
                "Dar został dodany");
//                "Dar %s został zapisany".formatted(donation.getId()));

        return "/";
    }
}