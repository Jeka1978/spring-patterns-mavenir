package com.epam.real_spring;/**
 * @author Evgeny Borisov
 */

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Service
public @interface MService {
}
