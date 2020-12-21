package com.epam.chain_of_responsibility;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * @author Evgeny Borisov
 */
@Component
@Order(30)
public class EmailValidator implements Validator {
    @Override
    public Optional<String> validate(Person person) {
        if (!person.getEmail().contains("@")) {
            return Optional.of("not valid mail");
        }
        return Optional.empty();
    }
}
