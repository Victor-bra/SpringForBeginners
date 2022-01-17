package hibernate_one_to_many_bi;

import hibernate_one_to_many_bi.entity.Department;
import hibernate_one_to_many_bi.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        try(SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
            Session session = sessionFactory.getCurrentSession()) {

//            Department department = new Department("IT", 3000, 700);
//            Employee emp1 = new Employee("Baran", "Victor", 2000);
//            Employee emp2 = new Employee("Sergei", "Stoianov", 2100);
//            Employee emp3 = new Employee("Egor", "Trubilo", 1800);
//
//            department.addEmployeeToDepartment(emp1);
//            department.addEmployeeToDepartment(emp2);
//            department.addEmployeeToDepartment(emp3);
//            session.beginTransaction();
//
//            session.save(department);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

            /*session.beginTransaction();

            Department department = session.get(Department.class, 1);
            System.out.println(department);
            System.out.println(department.getEmps());

            session.getTransaction().commit();
            System.out.println("Done!");*/

//            session.beginTransaction();
//
//            Employee employee = session.get(Employee.class, 1);
//            System.out.println(employee);
//            System.out.println(employee.getDepartment());
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

            session.beginTransaction();

            Employee employee = session.get(Employee.class, 3);
            session.delete(employee);

            session.getTransaction().commit();
            System.out.println("Done!");

        }catch (Exception e){
            throw e;
        }
    }
}