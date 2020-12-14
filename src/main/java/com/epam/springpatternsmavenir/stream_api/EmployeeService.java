package com.epam.springpatternsmavenir.stream_api;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Evgeny Borisov
 */
public class EmployeeService {


    public Map<Seniority,Long> groupBySeniority(List<Employee> employees) {
       return employees.stream()
                .collect(Collectors.groupingBy(Seniority::findBySalary,
                        Collectors.counting()));
    }

}
