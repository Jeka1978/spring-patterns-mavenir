package com.epam.corona_hospital.healers;

import com.epam.corona_hospital.treatments.Patient;

/**
 * @author Evgeny Borisov
 */
public interface Healer {
    void treat(Patient patient);




    String TRADITIONAL = "traditional";
    String FOLK = "folk";
}
