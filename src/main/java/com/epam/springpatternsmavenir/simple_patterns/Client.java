package com.epam.springpatternsmavenir.simple_patterns;

import lombok.*;

import java.util.List;
import java.util.Map;

/**
 * @author Evgeny Borisov
 */
@Value
@Builder
@With
public class Client {
    private String name;
    private Integer income;
    private Integer debt;
    @NonNull
    private Integer salary;

    @Singular
    private Map<String,Integer> beers;

    @Singular("oneFish")
    private List<String> fish;



}

