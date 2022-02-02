package AOP;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

@Pointcut("execution(* AOP.UniLibrary.get*())")
    private void allGetMethodsFromUniLibrary(){

}
    @Pointcut("execution(* AOP.UniLibrary.return*())")
    private void allReturnMethodsFromUniLibrary(){

    }

    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary() ")
    private void allGetAndReturnMethodsFromUniLibrary(){

    }


@Before("allGetMethodsFromUniLibrary()")
    public void beforeGetLoggingAdvice (){
    System.out.println("Writing Log №1");
}

    @Before("allReturnMethodsFromUniLibrary()")
    public void beforeReturnLoggingAdvice (){
        System.out.println("Writing Log №2");
    }

    @Before("allGetAndReturnMethodsFromUniLibrary()")
    public void beforeGetAndReturnLoggingAdvice (){
        System.out.println("Writing Log №3");
    }







    // @Pointcut("execution(* get*())")
   // private void allGetMethods(){

   // }
   // @Before("allGetMethods()")
   // public void beforeGetLoggingAdvice(){
    //    System.out.println("Попытка взять книгу");
   // }
   // @Before("allGetMethods()")
   // public void beforeGetSecurityAdvice(){
    //    System.out.println("Проверка прав на получение книги или журнала");
   //}
}
