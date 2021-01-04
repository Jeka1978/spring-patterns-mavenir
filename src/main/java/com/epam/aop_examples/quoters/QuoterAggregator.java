package com.epam.aop_examples.quoters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Component
public class QuoterAggregator {
    @Autowired
    private List<Quoter> quoters;


    public void printAllQuotes() {
        quoters.forEach(Quoter::sayQuote);
    }
}
