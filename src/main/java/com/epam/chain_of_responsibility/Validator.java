package com.epam.chain_of_responsibility;

import java.util.Optional;

/**
 * @author Evgeny Borisov
 */
public interface Validator {
    Optional<String> validate(Person person);
}
