package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

    @Pointcut("execution(* get*())")
    private void allGetMethods(){
    }

    @Before("allGetMethods()")
    public void beforeGetBookLoggingAdvice(){
        System.out.println("beforeGetBookLoggingAdvice: попытка получить книгу/журнал");
    }

    @Before("allGetMethods()")
    public void beforeGetBookSecurityAdvice(){
        System.out.println("beforeGetBookSecurityAdvice: проверка прав на получение книги/журнала");
    }

}
