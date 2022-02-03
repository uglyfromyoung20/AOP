package AOP.aspects;

import AOP.Student;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversiteLoggingAspect {
//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLoggingAdvice() {
//        System.out.println("beforeGetStudentsLoggingAdvice: логируем получение " + "списка студентов перед методом getStudents");
//    }


//    @AfterReturning(pointcut = "execution(* getStudents())",
//    returning = "students")
//    public void afterReturningGetStudentsLoggingAdvice(List<Student> students) {
//        Student firstStudent = students.get(0);
//        String nameSurname = firstStudent.getNameSurname();
//        nameSurname = "JavaDeveloper"+ nameSurname;
//        firstStudent.setNameSurname(nameSurname);
//        double avgGrade = firstStudent.getAvgGrade();
//        avgGrade = avgGrade+1;
//        firstStudent.setAvgGrade(avgGrade);
//
//          System.out.println("afterReturningGetStudentsLoggingAdvice: логируем получение " + "списка студентов после рпботы  метода getStudents");
//    }
    @AfterThrowing(pointcut = "execution(* getStudents())",
    throwing = "exception")
    public void afterThrowingGetStudentsLoggingAdvice(Throwable exception){
        System.out.println("afterThrowingGetStudentsLoggingAdvice: логируем выброс исключения"+ exception);

    }
}
