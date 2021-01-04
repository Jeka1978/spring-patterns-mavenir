package com.epam.corona_hospital.treatments;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class Amulet implements Treatment {
    @Override
    public void use(Patient patient) {
        System.out.println("put mask on your neck. Never take it of, even in the bath");
    }
}
