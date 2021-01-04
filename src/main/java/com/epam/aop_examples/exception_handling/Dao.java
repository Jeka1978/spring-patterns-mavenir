package com.epam.aop_examples.exception_handling;

import com.epam.aop_examples.exception_handling.DBException;
import org.springframework.stereotype.Repository;

/**
 * @author Evgeny Borisov
 */
@Repository
public class Dao {
    public void save() {
        System.out.println("trying to save");
        throw new DBException("fire all DBA");
    }
}
