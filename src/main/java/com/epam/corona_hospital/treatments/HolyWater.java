package com.epam.corona_hospital.treatments;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class HolyWater implements Treatment {
    @Override
    public void use(Patient patient) {
        System.out.println("mix one glass of holy water with ethanol. Drink slowly");
    }
}
