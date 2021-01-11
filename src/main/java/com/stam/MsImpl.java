package com.stam;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class MsImpl implements Ms {

    public static void main(String[] args) {
        new AnnotationConfigApplicationContext("com.stam");
    }
}
