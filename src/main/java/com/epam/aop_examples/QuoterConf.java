package com.epam.aop_examples;

import com.epam.aop_examples.quoters.Quoter;
import com.epam.aop_examples.quoters.QuoterAggregator;
import com.epam.aop_examples.quoters.TerminatorQuoter;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author Evgeny Borisov
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class QuoterConf {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(QuoterConf.class);
//        Quoter terminatorQuoter = context.getBean("terminatorQuoter", Quoter.class);
//        terminatorQuoter.sayQuote();
    }
}
