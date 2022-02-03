package AOP.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class ExcetionHandlingAspect {
    @Before("AOP.aspects.MyPointcuts.allGetMethods()")
    private void beforeGetExceptionHandlingAdvice(){
        System.out.println("Ловим и обрабатываем исключение при попытке взять книгу или журнал");
    }
}
