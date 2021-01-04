package com.epam.corona_hospital.treatments;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class Vodka implements Treatment {
    @Override
    public void use(Patient patient) {
        System.out.println("Use 100 gramm of Vodka 3 times before each meal");
    }
}
