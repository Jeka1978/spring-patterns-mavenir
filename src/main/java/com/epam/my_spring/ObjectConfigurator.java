package com.epam.my_spring;

/**
 * @author Evgeny Borisov
 */

//BeanPostProcessor
public interface ObjectConfigurator {

    void configure(Object t, ApplicationContext context);
}
