package com.epam.chain_of_responsibility;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * @author Evgeny Borisov
 */
@Component
@Order(10)
public class NameValidator implements Validator {
    @Override
    public Optional<String> validate(Person person) {
        if (person.getName()==null) {
            return Optional.of("name can't be null");
        }
        return Optional.empty();
    }
}
