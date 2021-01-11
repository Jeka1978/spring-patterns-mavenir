package com.epam.corona_hospital;

import com.epam.corona_hospital.healers.Cleric;
import com.epam.corona_hospital.healers.Physician;
import com.epam.corona_hospital.treatments.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.epam.corona_hospital.healers.Healer.FOLK;
import static com.epam.corona_hospital.healers.Healer.TRADITIONAL;

/**
 * @author Evgeny Borisov
 */
@Service
public class Hospital {
    @Autowired
    private Cleric cleric;

    @Autowired
    private Physician physician;


    public void treatPatient(Patient patient) {

        if (patient.getMethod().equalsIgnoreCase(FOLK)) {
            cleric.treat(patient);
        } else if (patient.getMethod().equals(TRADITIONAL)) {
            physician.treat(patient);
        }


    }
}
