package com.epam.corona_hospital.healers;

import com.epam.corona_hospital.treatments.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

import static com.epam.corona_hospital.healers.Healer.ALCOHOL;
import static com.epam.corona_hospital.healers.Healer.FOLK;

/**
 * @author Evgeny Borisov
 */
@Component(ALCOHOL)
public class AlcoDoctor implements Healer {

    @TreatmentType(TreatmentTypeEnum.ALCOHOL)
    private List<Treatment> treatments;

    @Override
    public void treat(Patient patient) {
        System.out.println("Let's drink: ");
        treatments.forEach(treatment -> treatment.use(patient));
    }
}
