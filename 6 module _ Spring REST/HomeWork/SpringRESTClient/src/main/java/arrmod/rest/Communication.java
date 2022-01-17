package arrmod.rest;

import arrmod.rest.entity.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class Communication {
    private final String URL = "http://localhost:8080/api/company";
    private final RestTemplate restTemplate;

    @Autowired
    public Communication(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<Company> getAllCompany() {
        ResponseEntity<List<Company>> responseEntity = restTemplate.exchange(URL,
                HttpMethod.GET, null, new ParameterizedTypeReference<List<Company>>() {
                });
        List<Company> allCompany = responseEntity.getBody();
        return allCompany;
    }

    public Company getCompany(int id) {
        Company company = restTemplate.getForObject(URL + "/" + id, Company.class);
        return company;
    }

    public void saveCompany(Company company) {
        int ID = company.getId();
        if (ID == 0) {
            ResponseEntity<String> responseEntity = restTemplate.postForEntity(URL, company, String.class);
            System.out.println("New company was added  to DB");
            System.out.println(responseEntity.getBody());
        } else {
            restTemplate.put(URL, company);
            System.out.println("Company with ID " + ID + " was updated");
        }
    }

    public void deleteCompany(int id){
        restTemplate.delete(URL + "/" + id);
        System.out.println("Company with ID " + id + " was deleted from DB");
    }
}
