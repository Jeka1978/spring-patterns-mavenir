package com.epam.corona_hospital.treatments;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class Sauna implements Treatment {
    @Override
    public void use(Patient patient) {
        System.out.println("Sauna temreture should be mor per 3 than body temperature");
    }
}
