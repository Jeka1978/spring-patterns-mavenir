package com.epam.singleton_anti_pattern;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Evgeny Borisov
 */
public class TaxCalc {



    public double withMaam(double price) {
        double maam = MaamResolverSingleton.getInstance().getMaam();
        return price * maam + price;
    }

    public static void main(String[] args) {
        System.out.println(new TaxCalc().withMaam(100));
    }
}





