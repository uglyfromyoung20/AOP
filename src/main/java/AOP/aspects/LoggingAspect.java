package AOP.aspects;

import AOP.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
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







    @Before("AOP.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint){

     MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getMethod() = " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() = " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName()= " + methodSignature.getName());
        if( methodSignature.getName().equals("addBook") ){
            Object[] arguments = joinPoint.getArgs();
            for(Object obj: arguments){
                if(obj instanceof Book){
                    Book myBook = (Book) obj;
                    System.out.println("Информация о книге: название книги -"
                            + myBook.getName()+"author-"
                            + myBook.getAuthor()+", год издания -  "
                            + myBook.getYearOfPublication());
                }
else  if (obj instanceof String){
                    System.out.println("Книгу в библиотеку добавляет - "+ obj );
                }
            }

        }

        System.out.println("Логирование"+ " " + "Попытка взять книгу");
        System.out.println("-----------------------------");
    }

}
