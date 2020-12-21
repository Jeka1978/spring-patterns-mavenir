package com.epam.chain_of_responsibility;

/**
 * @author Evgeny Borisov
 */
public class PersonMainValidator {

    public String validate(Person person) {

        String msg = "";
        if (person.getAge() < 0) {
            msg += " age can't be negative";
        }
        if (!person.getEmail().contains("@")) {
            msg += ", email not valid";
        }

        if (msg == "") {
            return "no problem";

        }
        return msg;
    }
}
