package hibernate_test;

import hibernate_test.entity.Detail;
import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        try(SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
            Session session = sessionFactory.getCurrentSession()) {

//            Employee employee = new Employee("Sergei", "Stouanov", "XZ", 1200);
//            Detail detail = new Detail("Mozir","+375(33)222444666","Seri@gmail.com");
//            employee.setEmpDetail(detail);
//            detail.setEmployee(employee);
//
//            session.beginTransaction();
//
//            session.save(employee);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");


            session.beginTransaction();

            Detail detail = session.get(Detail.class, 4);
            System.out.println(detail.getEmployee());

            session.getTransaction().commit();
            System.out.println("Done!");

            /*session.beginTransaction();

            Detail detail = session.get(Detail.class, 6);
            detail.getEmployee().setEmpDetail(null);
            session.delete(detail);

            session.getTransaction().commit();
            System.out.println("Done!");*/

        }catch (Exception e){
            throw e;
        }
    }
}