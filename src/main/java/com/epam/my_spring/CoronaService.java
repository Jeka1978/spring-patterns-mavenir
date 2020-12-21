package com.epam.my_spring;

import java.util.Random;

/**
 * @author Evgeny Borisov
 */
@Singleton
public class CoronaService {


    @InjectRandomInt(min = 3, max = 100)
    private int bound;


    public CoronaService() {
        System.out.println("was created");
    }

    public int countInfectedToday() {

        return bound;
    }
}
