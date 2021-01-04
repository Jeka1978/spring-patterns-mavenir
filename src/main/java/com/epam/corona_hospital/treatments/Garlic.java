package com.epam.corona_hospital.treatments;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class Garlic implements Treatment {
    @Override
    public void use(Patient patient) {
        System.out.println("Insert garlic into your ears till the end of pandemic");
    }
}
