package com.epam.corona_hospital.controllers;

import com.epam.corona_hospital.Hospital;
import com.epam.corona_hospital.treatments.Patient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * @author Evgeny Borisov
 */
@RestController
@RequestMapping("/corona/")
@RequiredArgsConstructor
public class CoronaController {

    private final Hospital hospital;


    @GetMapping("hi")
    public String hi(){
        return "hi";
    }

    @PostMapping("treat")
    public void treat(@RequestBody Patient patient) {
        hospital.treatPatient(patient);
    }

}
