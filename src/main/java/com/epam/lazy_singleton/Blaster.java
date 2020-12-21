package com.epam.lazy_singleton;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */

@Component
@Lazy
public class Blaster {

    @PostConstruct
    private void init() {
        System.out.println("you paid 100500 for the blaster");
    }

    public void fire() {
        System.out.println("boom boom!!!");
    }

}
