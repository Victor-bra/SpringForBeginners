package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> studentList = new ArrayList<>();

    public void addStudents(){
        Student st1 = new Student("Baran Victor", 1,8.3);
        Student st2 = new Student("Mixal Ivanov", 3,2.5);
        Student st3 = new Student("Elena Paleno", 6,4.1);

        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
    }

    public List<Student> getStudents(){
        System.out.println("Начало работы метода getStudents");
        //System.out.println(studentList.get(3));
        System.out.println("Information from method getStudents:");
        System.out.println(studentList);
        return studentList;
    }
}
