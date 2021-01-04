package com.epam.aop_examples.quoters;

import com.epam.chain_of_responsibility.Person;
import lombok.SneakyThrows;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author Evgeny Borisov
 */
@Component
@Aspect
public class QuoterAspect {


 /*   @Before("execution(* com.epam.aop_examples..*.say*(..))")
    public void beforeSayMethods(JoinPoint jp) {
        String className = jp.getTarget().getClass().getSimpleName();
        System.out.print("This is quote of "+className+" : ");
    }*/


//    @Around("@annotation(com.epam.my_spring.InjectRandomInt)")
    @Around("execution(* com.epam.aop_examples..*.say*(..))")
//    @AfterThrowing
    public Object beforeSayMethods(ProceedingJoinPoint jp) throws Throwable {



        if (allowed()) {
           /* String[] args = (String[]) jp.getArgs();
            var newArgs = Arrays.stream(args).map(String::toUpperCase).toArray();
            jp.proceed(newArgs);*/

            System.out.print("This is quote of "+jp.getTarget().getClass().getSimpleName()+" : ");
            Object retVal = jp.proceed();
            return retVal;
        }else {
            throw new SecurityException("not allowed here");
        }

    }

    private boolean allowed() {
        return true;
    }


}
