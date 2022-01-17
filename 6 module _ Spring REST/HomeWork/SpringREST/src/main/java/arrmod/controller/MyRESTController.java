package arrmod.controller;

import arrmod.entity.Company;
import arrmod.exceptionHanding.NoSuchCompanyException;
import arrmod.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRESTController {

    private final CompanyService companyService;

    @Autowired
    public MyRESTController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping("/company")
    public List<Company> showAllCompany(){
        List<Company> allCompany = companyService.getAllCompaniesList();
        return allCompany;
    }

    @GetMapping("/company/{id}")
    public Company getCompany(@PathVariable int id){
        Company company = companyService.getCompany(id);
        if(company == null)
            throw new NoSuchCompanyException("There is no company with ID = " + id + " in DB");
        return company;
    }

    @PostMapping("/company")
    public Company addNewCompany(@RequestBody Company company){
        companyService.saveNewCompany(company);
        return company;
    }

    @PutMapping("/company")
    public Company updateCompany(@RequestBody Company company){
        companyService.saveNewCompany(company);
        return company;
    }

    @DeleteMapping("/company/{id}")
    public String deleteCompany(@PathVariable int id){
        Company company = companyService.getCompany(id);
        if(company == null)
            throw new NoSuchCompanyException("There is no company with ID = " + id + " in DB");
        companyService.deleteCompany(id);
        return "Company with ID = " + id + " was deleted";
    }
}
