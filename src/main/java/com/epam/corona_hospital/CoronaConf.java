package com.epam.corona_hospital;

import com.epam.corona_hospital.healers.Healer;
import com.epam.corona_hospital.treatments.Patient;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ComponentScan
public class CoronaConf {

    @Bean
    public Random random(){
        return new Random();
    }


    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CoronaConf.class);
        context.getBean("cleric", Healer.class).treat(Patient.builder().build());
    }














}
