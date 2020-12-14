package com.epam.springpatternsmavenir.simple_patterns;

import java.time.LocalDate;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {


        LocalDate now = LocalDate.now();
        LocalDate localDate = now.withYear(1900);
        System.out.println(localDate.getDayOfWeek());


        Client donald = Client.builder().oneFish("Carpion").beer("Tubrog",3).beer("Leff",6).debt(10).name("Donald").salary(40).income(100).build();
        System.out.println("donald = " + donald);
        Client olga = donald.withName("Olga");
        System.out.println("olga = " + olga);
    }
}
