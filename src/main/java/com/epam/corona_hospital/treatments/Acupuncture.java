package com.epam.corona_hospital.treatments;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@TreatmentType(TreatmentTypeEnum.CHINES)
public class Acupuncture implements Treatment {
    @Override
    public void use(Patient patient) {
        System.out.println("100 spears into your body");
    }
}
