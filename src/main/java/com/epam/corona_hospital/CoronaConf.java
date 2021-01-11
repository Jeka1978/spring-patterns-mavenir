package com.epam.corona_hospital;

import com.epam.corona_hospital.healers.Healer;
import com.epam.corona_hospital.treatments.Patient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

import static com.epam.corona_hospital.healers.Healer.*;

/**
 * @author Evgeny Borisov
 */
@SpringBootApplication
public class CoronaConf {

    @Bean
    public Random random(){
        return new Random();
    }


    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(CoronaConf.class);
        context.getBean(Hospital.class).treatPatient(Patient.builder().method(FOLK).build());
        System.out.println("************");
        context.getBean(Hospital.class).treatPatient(Patient.builder().method(TRADITIONAL).build());
        System.out.println("************");
        context.getBean(Hospital.class).treatPatient(Patient.builder().method(ALCOHOL).build());
        System.out.println("************");
        context.getBean(Hospital.class).treatPatient(Patient.builder().method("chineese").build());
    }














}
