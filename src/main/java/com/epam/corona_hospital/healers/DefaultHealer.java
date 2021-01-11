package com.epam.corona_hospital.healers;

import com.epam.corona_hospital.treatments.Patient;
import com.epam.corona_hospital.treatments.Treatment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

/**
 * @author Evgeny Borisov
 */
@Component
@Primary
public class DefaultHealer implements Healer {

    @Autowired
    private Random random;

    @Autowired
    private List<Treatment> treatments;


    @Override
    public void treat(Patient patient) {
        System.out.println("Welcome to Default healer");
        treatments.get(random.nextInt(treatments.size())).use(patient);
        System.out.println();
    }

    @Override
    public String myType() {
        return "default";
    }
}










