package com.epam.corona_hospital.healers;

import com.epam.corona_hospital.treatments.Patient;

/**
 * @author Evgeny Borisov
 */
public interface Healer {
    void treat(Patient patient);

    // todo add 3 implementations




    String TRADITIONAL = "traditional";
    String FOLK = "folk";
}
