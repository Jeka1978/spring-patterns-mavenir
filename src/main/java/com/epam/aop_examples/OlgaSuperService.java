package com.epam.aop_examples;

import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
public class OlgaSuperService {
    public void sayBlaBla() {
        System.out.println("Bla bla");
    }
}
