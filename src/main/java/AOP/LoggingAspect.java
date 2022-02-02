package AOP;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    @Before("execution(public  void *(..))")
    public void beforeGetBookAdvice(){
        System.out.println("Попытка взять книгу");
    }
    //@Before("execution(  * returnBook())")
   // public void beforeReturnBookAdvice(){
    //    System.out.println("Попытка вернуть книгу");
    //}
}
