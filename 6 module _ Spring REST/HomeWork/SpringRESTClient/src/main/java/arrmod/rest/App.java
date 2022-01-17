package arrmod.rest;

import arrmod.rest.configuration.MyConfig;
import arrmod.rest.entity.Company;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App
{
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);

        List<Company> allCompany = communication.getAllCompany();
        System.out.println(allCompany);

//        Company companyByID = communication.getCompany(1);
//        System.out.println(companyByID);

//        Company company = new Company("TEST 2","TEST 1", "TEST1", 1, 1,"TS1","TEST1");
//        company.setId(11);
//        communication.saveCompany(company);

//        communication.deleteCompany(11);
    }
}
