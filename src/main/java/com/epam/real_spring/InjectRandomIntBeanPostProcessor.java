package com.epam.real_spring;

import com.epam.my_spring.ApplicationContext;
import com.epam.my_spring.InjectRandomIntAnnotationObjectConfigurator;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@MService
public class InjectRandomIntBeanPostProcessor implements BeanPostProcessor {


    private InjectRandomIntAnnotationObjectConfigurator objectConfigurator = new InjectRandomIntAnnotationObjectConfigurator();
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        objectConfigurator.configure(bean, null);
        return bean;
    }
}
