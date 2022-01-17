package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = sessionFactory.getCurrentSession();
            Employee emp = new Employee("Victor", "Baran", "IT", 700);
            session.beginTransaction();
            session.save(emp);
            session.getTransaction().commit();
        }finally {
            sessionFactory.close();
        }
    }
}
