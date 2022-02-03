package AOP;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class University {
    private List<Student> student = new ArrayList<>();
    public void addStudents(){
        Student st1 = new Student("Alexey Maklov",2,4);
        Student st2 = new Student("Kirill Krilov",2,4.1);
        Student st3 = new Student("Akmal Dusmuratov",2,5);
        student.add(st1);
        student.add(st2);
        student.add(st3);
    }

    public List<Student> getStudents() {
        System.out.println("Начало работы getStudents");
        System.out.println(student.get(3));
        System.out.println("Information from method getStudents:");
        System.out.println(student);
        return  student;
    }
}
