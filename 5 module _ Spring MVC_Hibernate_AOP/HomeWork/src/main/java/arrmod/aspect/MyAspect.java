package arrmod.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

    @Around("execution(* arrmod.controller.*.*(..))")
    public Object aroundAllRepositoryMethodAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("Begin of " + methodSignature.getName());
        Object targetMethodResult = joinPoint.proceed();
        System.out.println("End of " + methodSignature.getName());
        return targetMethodResult;
    }
}
