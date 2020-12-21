package com.epam.my_spring;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {


        ApplicationContext context = new ApplicationContext("com.epam");

        CoronaController coronaController = context.getObject(CoronaController.class);
        coronaController.stam();
        context.getObject(OlgaService.class).doWork();
    }
}
