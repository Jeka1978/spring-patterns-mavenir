package com.epam.chain_of_responsibility;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * @author Evgeny Borisov
 */
@Component
@Order(20)
public class AgeValidator implements Validator {
    @Override
    public Optional<String> validate(Person person) {
        if (person.getAge() < 0) {
            return Optional.of("age can't be negative");
        }
        return Optional.empty();
    }
}
