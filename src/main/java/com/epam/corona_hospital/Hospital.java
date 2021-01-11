package com.epam.corona_hospital;

import com.epam.corona_hospital.healers.Cleric;
import com.epam.corona_hospital.healers.Healer;
import com.epam.corona_hospital.healers.Physician;
import com.epam.corona_hospital.treatments.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import static com.epam.corona_hospital.healers.Healer.FOLK;
import static com.epam.corona_hospital.healers.Healer.TRADITIONAL;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.toMap;

/**
 * @author Evgeny Borisov
 */
@Service
public class Hospital {

    private final Map<String, Healer> map;

    private final Healer defaultHealer;

    public Hospital(List<Healer> list, Healer defaultHealer) {
        this.map = list.stream().collect(toMap(Healer::myType, identity()));
        this.defaultHealer = defaultHealer;
    }



    public void treatPatient(Patient patient) {

        String method = patient.getMethod();
        map.getOrDefault(method,defaultHealer).treat(patient);


    }
}
