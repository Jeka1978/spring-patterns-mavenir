package com.epam.corona_hospital.treatments;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class Aspirin implements Treatment {
    @Override
    public void use(Patient patient) {
        System.out.println("Use Aspirin 3 times per day after dinner");
    }
}
