package com.epam.corona_hospital.treatments;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class Cognac implements Treatment {
    @Override
    public void use(Patient patient) {
        System.out.println("Drink one bottle of cognac before sleep");
    }
}
