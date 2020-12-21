package com.epam.my_spring;

/**
 * @author Evgeny Borisov
 */

public class OlgaService {

    @InjectByType
    private CoronaService coronaService;


    public void doWork() {
        System.out.println(coronaService.countInfectedToday()+" OLGA");
    }
}
