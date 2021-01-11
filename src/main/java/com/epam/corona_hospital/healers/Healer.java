package com.epam.corona_hospital.healers;

import com.epam.corona_hospital.Hospital;
import com.epam.corona_hospital.treatments.Patient;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Evgeny Borisov
 */
public interface Healer {
    void treat(Patient patient);

    String myType();



    // todo add 3 implementations




    String TRADITIONAL = "traditional";
    String FOLK = "folk";
    String ALCOHOL = "alcohol";
}
