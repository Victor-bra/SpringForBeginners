package arrmod.dao;

import arrmod.entity.Company;

import java.util.List;

public interface CompanyDAO {
    List<Company> getAllCompaniesList();

    void saveNewCompany(Company company);

    Company getCompany(int id);

    void deleteCompany(int id);
}
