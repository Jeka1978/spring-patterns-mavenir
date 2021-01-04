package com.epam.corona_hospital.healers;

import com.epam.corona_hospital.treatments.Aspirin;
import com.epam.corona_hospital.treatments.Patient;
import com.epam.corona_hospital.treatments.Treatment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class Physician implements Healer {
    @Autowired
    private Treatment aspirin;

    @Override
    public void treat(Patient patient) {
        System.out.println("Physician says:");
        aspirin.use(patient);
    }
}
