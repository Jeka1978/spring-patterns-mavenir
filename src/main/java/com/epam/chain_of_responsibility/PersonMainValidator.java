package com.epam.chain_of_responsibility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author Evgeny Borisov
 */
@Component
public class PersonMainValidator {

    @Autowired
    private List<Validator> validators;
    

    public String validate(Person person) {
        String msg = validators.stream()
                .map(validator -> validator.validate(person))
                .flatMap(Optional::stream)
                .collect(Collectors.joining(", "));

        return msg;
    }
}
