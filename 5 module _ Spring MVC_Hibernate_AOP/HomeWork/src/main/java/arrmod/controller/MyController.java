package arrmod.controller;

import arrmod.entity.Company;
import arrmod.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

@Controller
public class MyController {

    private final CompanyService companyService;

    @Autowired
    public MyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @RequestMapping("/")
    public String showAllCompanies(Model model){
        List<Company> companyList = companyService.getAllCompaniesList();
        model.addAttribute("allCompaniesList", companyList);
        return "all_companies";
    }

    @RequestMapping("/add_update")
    public String addNewCompany(Model model){
        Company company = new Company();
        model.addAttribute("company", company);
        return "add_update_companies";
    }

    @RequestMapping("/saveCompanyInfo")
    public String saveNewCompany(@Valid @ModelAttribute("company") Company company, BindingResult bindingResult){
        if(bindingResult.hasErrors())
            return "add_update_companies";
        else {
            companyService.saveNewCompany(company);
            return "redirect:/";
        }
    }

    @RequestMapping("/updateComp")
    public String updateCompany(@RequestParam("compId") int id, Model model){
        Company company = companyService.getCompany(id);
        model.addAttribute("company",company);
        return "add_update_companies";
    }

    @RequestMapping("/deleteComp")
    public String deleteCompany(@RequestParam("compId") int id){
        companyService.deleteCompany(id);
        return "redirect:/";
    }

}
