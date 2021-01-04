package com.epam.aop_examples.exception_handling;

/**
 * @author Evgeny Borisov
 */
public class DBException extends RuntimeException {
    public DBException() {
        super();
    }

    public DBException(String message) {
        super(message);
    }
}
