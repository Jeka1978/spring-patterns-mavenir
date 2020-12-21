package com.epam.my_spring;

import java.util.Random;

/**
 * @author Evgeny Borisov
 */
@Singleton
public  final class CoronaService {


    @InjectRandomInt(min = 3, max = 100)
    private int bound;


    public CoronaService() {
        System.out.println("was created");
    }

    @Benchmark
    public int countInfectedToday() {

        return bound;
    }
}
