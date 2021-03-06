package com.epam.corona_hospital.treatments;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@TreatmentType(TreatmentTypeEnum.ALCOHOL)
public class Whisky implements Treatment {
    @Override
    public void use(Patient patient) {
        System.out.println("Use Whisky instead of meal");
    }
}
