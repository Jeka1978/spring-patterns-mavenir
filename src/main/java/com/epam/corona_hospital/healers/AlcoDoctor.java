package com.epam.corona_hospital.healers;

import com.epam.corona_hospital.treatments.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Component
public class AlcoDoctor implements Healer {

    @TreatmentType(TreatmentTypeEnum.ALCOHOL)
    private List<Treatment> treatments;

    @Override
    public void treat(Patient patient) {
        System.out.println("Let's drink: ");
        treatments.forEach(treatment -> treatment.use(patient));
    }
}
