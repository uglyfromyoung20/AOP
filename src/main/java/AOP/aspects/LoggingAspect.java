package AOP.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {
    //@Pointcut("execution(* AOP.UniLibrary.*(..))")
     //private void allMethodsFromUniLibrary(){

    //}
   // @Pointcut("execution(* AOP.UniLibrary.returnMagazine())")
    //private void allReturnMethodsFromUniLibrary(){

   // }
    //@Pointcut("allMethodsFromUniLibrary() && !allReturnMethodsFromUniLibrary() ")
   // private void allMethodsExceptReturnMagazineFromUniLibrary(){

   // }
   // @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
   // public void beforeФllMethodsExceptReturnMagazineAdvice(){
      //  System.out.println("Writing log №1");
   // }


    //@Pointcut("execution(* AOP.UniLibrary.get*())")
  //  private void allGetMethodsFromUniLibrary(){

//}
   // @Pointcut("execution(* AOP.UniLibrary.return*())")
   // private void allReturnMethodsFromUniLibrary(){

   // }

  //  @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary() ")
    //private void allGetAndReturnMethodsFromUniLibrary(){

   // }


//@Before("allGetMethodsFromUniLibrary()")
   // public void beforeGetLoggingAdvice (){
   // System.out.println("Writing Log №1");
//}

    //@Before("allReturnMethodsFromUniLibrary()")
   // public void beforeReturnLoggingAdvice (){
    //    System.out.println("Writing Log №2");
   // }

   // @Before("allGetAndReturnMethodsFromUniLibrary()")
  //  public void beforeGetAndReturnLoggingAdvice (){
   //     System.out.println("Writing Log №3");
  //  }







    @Before("AOP.aspects.MyPointcuts.allGetMethods()")
    public void beforeGetLoggingAdvice(){
        System.out.println("Логирование"+ " " + "Попытка взять книгу");
    }

}
