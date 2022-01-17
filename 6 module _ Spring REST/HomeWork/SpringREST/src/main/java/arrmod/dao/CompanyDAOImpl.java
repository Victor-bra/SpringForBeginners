package arrmod.dao;

import arrmod.entity.Company;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CompanyDAOImpl implements CompanyDAO{

    private final SessionFactory sessionFactory;

    @Autowired
    public CompanyDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Company> getAllCompaniesList() {
        Session session = sessionFactory.getCurrentSession();

        List<Company> allCompanies = session.createQuery("from Company", Company.class).getResultList();

        return allCompanies;
    }

    @Override
    public void saveNewCompany(Company company){
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(company);
    }

    @Override
    public Company getCompany(int id) {
        Session session = sessionFactory.getCurrentSession();
        Company company = session.get(Company.class,id);
        return company;
    }

    @Override
    public void deleteCompany(int id) {
        Session session = sessionFactory.getCurrentSession();

        Query<Company> query = session.createQuery("delete from Company where id=:companyId");
        query.setParameter("companyId",id);
        query.executeUpdate();
    }

}
