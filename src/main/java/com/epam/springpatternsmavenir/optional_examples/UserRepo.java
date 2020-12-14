package com.epam.springpatternsmavenir.optional_examples;

import java.util.Optional;

/**
 * @author Evgeny Borisov
 */
public class UserRepo {

    public Optional<User> findUser(int id) {
        if (id == 1) {
            return Optional.of(new User("Jack"));
        }else {
           return Optional.empty();
        }
    }
}
