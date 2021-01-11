package com.epam.corona_hospital.services;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

/**
 * @author Evgeny Borisov
 */
@Service
public class PcrService {
    private List<?> answer = List.of("true", "false", new Papaya());
    private int position;

    public boolean isPositive() {
        if (position == answer.size()) {
            position=0;
        }
        System.out.println(position);
        String s = (String) answer.get(position++);
        System.out.println(s);
        return Boolean.parseBoolean(s);
    }
}
