package com.epam.aop_examples.quoters;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class ShakespearQuoter implements Quoter {
    @Override
    public void sayQuote() {
        System.out.println("2 b || ! 2 b");
    }
}
