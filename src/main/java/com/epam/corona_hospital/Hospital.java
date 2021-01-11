package com.epam.corona_hospital;

import com.epam.corona_hospital.healers.Cleric;
import com.epam.corona_hospital.healers.Healer;
import com.epam.corona_hospital.healers.Physician;
import com.epam.corona_hospital.treatments.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Map;

import static com.epam.corona_hospital.healers.Healer.FOLK;
import static com.epam.corona_hospital.healers.Healer.TRADITIONAL;

/**
 * @author Evgeny Borisov
 */
@Service
public class Hospital {

    private final Map<String, Healer> map;

    private final Healer defaultHealer;

    public Hospital(Map<String, Healer> map, Healer defaultHealer) {
        this.map = map;
        this.defaultHealer = defaultHealer;
    }



    public void treatPatient(Patient patient) {

        String method = patient.getMethod();
        map.getOrDefault(method,defaultHealer).treat(patient);


    }
}
