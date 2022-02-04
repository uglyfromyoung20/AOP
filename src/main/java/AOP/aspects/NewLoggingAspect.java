package AOP.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {
    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {//связь с target методом
        System.out.println("aroundReturnBookLoggingAdvice: В библиотеку пытаются вернуть книгу ");
        Object targetMethodResult = null;
try {


   targetMethodResult = proceedingJoinPoint.proceed(); //вызов таргет метода
} catch(Exception e){
    System.out.println("aroundReturnBookLoggingAdvice: было поймано исключение " + e );
    targetMethodResult = "Неизвестное название книги ";
}
        targetMethodResult = "Затеряный мир";

        System.out.println("aroundReturnBookLoggingAdvice: В библиотеку успешно вернули  книгу");

        return targetMethodResult;
    }
}
