package com.epam.aop_examples.quoters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
@Component
public class TerminatorQuoter implements Quoter {


    @Autowired
    @Qualifier("terminatorQuoter")
    private Quoter proxy;

    @Override
    public void sayQuote() {
        System.out.println("I'll back");
        proxy.sayYes();
    }


    public void sayYes() {
        System.out.println("YES!");
    }


    @EventListener(ContextRefreshedEvent.class)
    public void sayInitCache(){
        System.out.println("cache instantiated...");
    }











}
