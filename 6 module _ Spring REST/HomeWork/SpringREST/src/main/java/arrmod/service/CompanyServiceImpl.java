package arrmod.service;

import arrmod.dao.CompanyDAO;
import arrmod.entity.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService{

    private final CompanyDAO companyDAO;

    @Autowired
    public CompanyServiceImpl(CompanyDAO companyDAO) {
        this.companyDAO = companyDAO;
    }

    @Override
    @Transactional
    public List<Company> getAllCompaniesList() {
        return companyDAO.getAllCompaniesList();
    }

    @Override
    @Transactional
    public void saveNewCompany(Company company) {
        companyDAO.saveNewCompany(company);
    }

    @Override
    @Transactional
    public Company getCompany(int id) {
        return companyDAO.getCompany(id);
    }

    @Override
    @Transactional
    public void deleteCompany(int id) {
        companyDAO.deleteCompany(id);
    }
}
