package com.epam.aop_examples.exception_handling;

import lombok.SneakyThrows;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.lang.ref.WeakReference;
import java.util.*;

import static java.util.Arrays.asList;

/**
 * @author Evgeny Borisov
 */
@Component
@Aspect
public class ExceptionHandlerAspect {


    private Map<DBException,Void> exceptions = new WeakHashMap<>();

    private List<String> mails;

    @Value("${dba.mails}")
    void setMails(String[] mails) {
        this.mails = asList(mails);
    }

//    @AfterThrowing(pointcut = "execution(* com.epam.aop_examples.exception_handling..*.*(..))",throwing = "ex")
    @AfterThrowing(pointcut = "@within(org.springframework.stereotype.Repository)",throwing = "ex")
    public void handleDBExceptions(DBException ex) {

        if (!exceptions.containsKey(ex)) {
            mails.forEach(mail -> {
                System.out.println("sending mail to " + mail);
                System.out.println(ex.getMessage());
            });
            exceptions.put(ex,null);
        }


    }

   /* @SneakyThrows
    @Around("execution(* com.epam.aop_examples.exception_handling.daos.*.*(..))")
    public Object handleDBExceptions(ProceedingJoinPoint pjp) {
        try {
            return pjp.proceed();
        } catch (DBException ex) {
            mails.forEach(mail -> {
                System.out.println("sending mail to " + mail);
                System.out.println(ex.getMessage());
            });
            throw ex;

        }
    }*/
}
