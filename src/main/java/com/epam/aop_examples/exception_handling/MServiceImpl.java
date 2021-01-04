package com.epam.aop_examples.exception_handling;

import com.epam.aop_examples.exception_handling.Dao;
import com.epam.aop_examples.exception_handling.services.MService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
public class MServiceImpl implements MService {
    @Autowired
    private Dao dao;

    @Override
    public void work() {
        System.out.println("Working...");
        dao.save();
    }
}
