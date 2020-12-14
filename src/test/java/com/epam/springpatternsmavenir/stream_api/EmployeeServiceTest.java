package com.epam.springpatternsmavenir.stream_api;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Evgeny Borisov
 */
class EmployeeServiceTest {

    @Test
    void groupBySeniority() {
        List<Employee> employees = IntStream.iterate(8, operand -> ++operand)
                .peek(System.out::println)
                .mapToObj(Employee::new)
                .limit(10)
                .collect(Collectors.toList());

        EmployeeService service = new EmployeeService();
        Map<Seniority, Long> map = service.groupBySeniority(employees);
        assertEquals(5,map.get(Seniority.JUNIOR));
    }
}