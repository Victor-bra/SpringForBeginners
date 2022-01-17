package hibernate_test;

import hibernate_test.entity.Detail;
import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        try {
//            Session session = sessionFactory.getCurrentSession();
//
//            Employee employee = new Employee("Baran", "Victor", "IT", 1000);
//            Detail detail = new Detail("Soligorsk","+375(33)3078559","VictorBaran@gmail.com");
//
//            session.beginTransaction();
//
//            employee.setEmpDetail(detail);
//            session.save(employee);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

            /*try(Session session = sessionFactory.getCurrentSession()) {
                session.beginTransaction();

                Employee employee = session.get(Employee.class, 2);
                System.out.println(employee.getEmpDetail());

                session.getTransaction().commit();
                System.out.println("Done!");
            }*/

            try(Session session = sessionFactory.getCurrentSession()) {
                session.beginTransaction();

                Employee employee = session.get(Employee.class, 3);
                session.delete(employee);

                session.getTransaction().commit();
                System.out.println("Done!");
            }
        }finally {
            sessionFactory.close();
        }
    }
}