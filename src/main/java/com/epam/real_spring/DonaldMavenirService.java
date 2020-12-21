package com.epam.real_spring;

import com.epam.my_spring.InjectRandomInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * @author Evgeny Borisov
 */

@Component
public class DonaldMavenirService implements MavenirService {


    @InjectRandomInt(min = 10,max = 13)
    private int repeat;

    @Override
    public void doStuff() {
        for (int i = 0; i < repeat; i++) {
            System.out.println("Donald!!!");

        }


    }
}
