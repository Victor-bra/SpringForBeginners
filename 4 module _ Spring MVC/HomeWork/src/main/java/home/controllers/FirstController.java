package home.controllers;

import home.Person;
import home.PersonSpecification;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class FirstController {

    @RequestMapping("/")
    public String showFirstPage(){
        return "first_page";
    }

    @RequestMapping("/person_view")
    public String showPersonPage(Model model){
        model.addAttribute("personSpecification", new PersonSpecification());
        return "person_page";
    }

    @RequestMapping("/show")
    public String showDetails(@Valid @ModelAttribute("personSpecification") PersonSpecification personSpecification, BindingResult bindingResult){
        if(bindingResult.hasErrors())
            return "person_page";
        else
            return "show_page";
    }
}
