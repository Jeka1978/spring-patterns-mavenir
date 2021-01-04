package com.epam.corona_hospital.treatments;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class Pray implements Treatment {
    @Override
    public void use(Patient patient) {
        System.out.println("Say: 'Covid, begone!!!' before apchi");
    }
}
