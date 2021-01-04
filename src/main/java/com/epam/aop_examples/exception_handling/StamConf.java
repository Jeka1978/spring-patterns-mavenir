package com.epam.aop_examples.exception_handling;

import com.epam.aop_examples.exception_handling.services.MService;
import org.springframework.context.annotation.*;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ComponentScan
@EnableAspectJAutoProxy
@PropertySource("classpath:application.properties")
public class StamConf {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StamConf.class);
        MService mService = context.getBean(MService.class);
        System.out.println(context.getBean(Dao.class).getClass().getName());
        System.out.println("mService = " + mService.getClass().getName());
        try {
            mService.work();
        } catch (Exception e) {
            System.out.println("we will try another database");
        }
    }
}
