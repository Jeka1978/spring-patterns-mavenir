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

import java.util.List;
import java.util.Map;
import java.util.Random;

import static com.epam.corona_hospital.healers.Healer.*;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.toMap;

/**
 * @author Evgeny Borisov
 */
@SpringBootApplication
public class CoronaConf {


    @Bean
    public Map<String, Healer> healerMap(List<Healer> healers) {
        return healers.stream().collect(toMap(Healer::myType, identity()));

    }

    @Bean
    public Random random(){
        return new Random();
    }


    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(CoronaConf.class);
//        context.getBean(Hospital.class).treatPatient(Patient.builder().method(FOLK).build());
//        System.out.println("************");
//        context.getBean(Hospital.class).treatPatient(Patient.builder().method(TRADITIONAL).build());
//        System.out.println("************");
//        context.getBean(Hospital.class).treatPatient(Patient.builder().method(ALCOHOL).build());
//        System.out.println("************");
//        context.getBean(Hospital.class).treatPatient(Patient.builder().method("chineese").build());
    }














}
