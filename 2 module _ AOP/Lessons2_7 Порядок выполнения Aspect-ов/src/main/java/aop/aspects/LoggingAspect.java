package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
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


    @Before("aop.aspects.MyPointcuts.allGetMethods()")
    public void beforeGetBookLoggingAdvice(){
        System.out.println("beforeGetBookLoggingAdvice: логирование попытки получить книгу/журнал");
    }

}
