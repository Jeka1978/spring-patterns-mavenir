package com.epam.aop_examples.quoters;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class TerminatorQuoter implements Quoter {
    @Override
    public void sayQuote() {
        System.out.println("I'll back");
    }
}
