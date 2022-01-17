package arrmod.service;

import arrmod.entity.Company;

import java.util.List;

public interface CompanyService {
    List<Company> getAllCompaniesList();

    void saveNewCompany(Company company);

    Company getCompany(int id);

    void deleteCompany(int id);
}
