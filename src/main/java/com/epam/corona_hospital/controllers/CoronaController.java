package com.epam.corona_hospital.controllers;

import com.epam.corona_hospital.Hospital;
import com.epam.corona_hospital.services.PcrService;
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
    private final PcrService pcrService;


    @GetMapping("/pcr")
    public String pcr(String name) {
        try {
            return String.valueOf(pcrService.isPositive());
        } catch (Exception e) {
            System.out.println(e.getClass());
            return "you seems to be Papaya, some problem with pcr, come back later";
        }

    }


    @GetMapping("hi")
    public String hi() {
        return "hi";
    }

    @PostMapping("treat")
    public void treat(@RequestBody Patient patient) {
        hospital.treatPatient(patient);
    }

}
