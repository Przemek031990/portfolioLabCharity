package pl.coderslab.charity;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.category.CategoryDto;
import pl.coderslab.charity.category.CategoryService;

import java.util.List;


@Controller
public class HomeController {
    private final CategoryService categoryService;

    public HomeController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }


    @RequestMapping("/")
    public String homeAction(Model model){
        List<CategoryDto> allCategory = categoryService.findAllCategory();
        return "index";
    }
}