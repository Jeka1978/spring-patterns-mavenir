package com.epam.springpatternsmavenir.stream_api;

import lombok.RequiredArgsConstructor;

import java.util.Arrays;

/**
 * @author Evgeny Borisov
 */
@RequiredArgsConstructor
public enum Seniority {


    JUNIOR(Integer.MIN_VALUE,12),
    MIDDLE(13,20),
    SENIOR(21,Integer.MAX_VALUE);

    private final int min;
    private final int max;


    public static Seniority findBySalary(Employee employee) {
        int salary = employee.getSalary();
        return Arrays.stream(values())
                .filter(seniority -> salary >= seniority.min && salary <= seniority.max)
                .findFirst()
                .get();
    }

}









