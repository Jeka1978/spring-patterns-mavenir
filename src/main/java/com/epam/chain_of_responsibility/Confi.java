package com.epam.chain_of_responsibility;

import lombok.SneakyThrows;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ComponentScan
public class Confi {





    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Confi.class);
        PersonMainValidator validator = context.getBean(PersonMainValidator.class);
        String violation = validator.validate(Person.builder().age(-2).email("asdasd").name(null).build());
        System.out.println("violation = " + violation);
    }
}
