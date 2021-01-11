package com.epam.corona_hospital;

import com.epam.corona_hospital.healers.Healer;
import com.epam.corona_hospital.treatments.Patient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Evgeny Borisov
 */
@Service
@RequiredArgsConstructor
public class Hospital {

    private final Map<String, Healer> map;

    private final Healer defaultHealer;




    public void treatPatient(Patient patient) {

        String method = patient.getMethod();
        map.getOrDefault(method, defaultHealer).treat(patient);


    }
}
