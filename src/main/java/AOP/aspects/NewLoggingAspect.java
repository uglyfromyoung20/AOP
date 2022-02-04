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
        long begin = System.currentTimeMillis();
        Object targetMethodResult = proceedingJoinPoint.proceed(); //вызов таргет метода
        long end = System.currentTimeMillis();
        System.out.println("aroundReturnBookLoggingAdvice: В библиотеку успешно вернули  книгу");
        System.out.println("aroundReturnBookLoggingAdvice: метод returnBook выполнил работу за " + (end-begin) + "миллисекунд ");
        return targetMethodResult;
    }
}
