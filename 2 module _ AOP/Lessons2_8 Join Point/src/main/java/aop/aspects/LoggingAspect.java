package aop.aspects;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

/*    @Pointcut("execution(* aop.UniLibrary.*(..))")
    private void allMethodFromUniLibrary(){}

    @Pointcut("execution(public void aop.UniLibrary.returnMagazine())")
    private void returnMagazineFromUniLibrary(){}

    @Pointcut("allMethodFromUniLibrary() && !returnMagazineFromUniLibrary()")
    private void allMethodExceptReturnMagazineFromUniLibrary(){}



    @Before("allMethodExceptReturnMagazineFromUniLibrary()")
    public void beforeAllMethodExceptReturnMagazineAdvice(){
        System.out.println("beforeAllMethodExceptReturnMagazineAdvice: Log #10");
    }*/

//--------------------------------------------------------------------------------------------------------
    /*@Pointcut("execution(* aop.UniLibrary.get*())")
    private void allGetMethodFromUniLibrary(){}

    @Pointcut("execution(* aop.UniLibrary.return*())")
    private void allReturnMethodFromUniLibrary(){}

    @Pointcut("allGetMethodFromUniLibrary() || allReturnMethodFromUniLibrary()")
    private void allGetAndReturnMethodFromUniLibrary(){}



    @Before("allGetMethodFromUniLibrary()")
    public void beforeGetLoggingAdvice(){
        System.out.println("beforeGetLoggingAdvice: writing Log#1");
    }

    @Before("allReturnMethodFromUniLibrary()")
    public void beforeReturnLoggingAdvice(){
        System.out.println("beforeReturnLoggingAdvice: writing Log#2");
    }

    @Before("allGetAndReturnMethodFromUniLibrary()")
    public void beforeGetAndReturnLoggingAdvice(){
        System.out.println("beforeGetAndReturnLoggingAdvice: writing Log#3");
    }*/
//------------------------------------------------------------------------------------------------------------


    @Before("aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddBookLoggingAdvice(JoinPoint joinPoint){
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getMethod() = " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() = " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName() = " + methodSignature.getName());

        if(methodSignature.getName().equals("addBook")){
            Object[] arguments = joinPoint.getArgs();
            for(Object obj: arguments){
                if(obj instanceof Book){
                    Book myBook = (Book) obj;
                    System.out.println("???????????????????? ?? ??????????:");
                    System.out.println("\t???????????????? - " + myBook.getName());
                    System.out.println("\t?????????? - " + myBook.getAuthor());
                    System.out.println("\t?????? ???????????????????? - " + myBook.getYearOfPublication());
                } else if(obj instanceof String){
                    System.out.println("?????????? ?? ???????????????????? ?????????????????? " + obj);
                }
            }
        }

        System.out.println("beforeGetBookLoggingAdvice: ?????????????????????? ?????????????? ???????????????? ??????????/????????????");
        System.out.println("-----------------------------------------------------");
    }

}
