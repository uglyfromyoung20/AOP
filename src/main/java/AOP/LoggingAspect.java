package AOP;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    public void beforeGetBookAdvaice(){
        System.out.println("Попытка взять книгу");
    }
}
