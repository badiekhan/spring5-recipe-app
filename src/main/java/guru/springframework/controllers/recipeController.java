package guru.springframework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class recipeController {

    @RequestMapping({"/recipe/show", "/recipe/show.html"})
    public String getRecipePage() {
        return "recipe/show";
    }
}
