package com.epam.real_spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;

import java.util.Random;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ComponentScan
@ImportResource("classpath:context.xml")
public class Conf {


    @Bean
    public Random random() {
        return new Random();
    }


    public static void main(String[] args) {


        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Conf.class);
        MavenirService mavenirService = context.getBean(MavenirService.class);
        context.getBeansWithAnnotation(MService.class);
        mavenirService.doStuff();
    }
}
