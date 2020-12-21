package com.epam.lazy_singleton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Role;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.ScheduledAnnotationBeanPostProcessor;

/**
 * @author Evgeny Borisov
 */
@SpringBootApplication
@EnableScheduling
public class MainConf {






    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(MainConf.class);
    }
}
