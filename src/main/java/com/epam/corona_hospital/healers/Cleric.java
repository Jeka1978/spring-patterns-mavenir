package com.epam.corona_hospital.healers;

import com.epam.corona_hospital.treatments.*;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Component
public class Cleric implements Healer {

    @AutowireList({Vodka.class, Sauna.class, Garlic.class})
    private List<Treatment> treatments;


    @Override
    public void treat(Patient patient) {
        System.out.println("Cleric will save you!");
        treatments.forEach(treatment -> treatment.use(patient));


    }
}
