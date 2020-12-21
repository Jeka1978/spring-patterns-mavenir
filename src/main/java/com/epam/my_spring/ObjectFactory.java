package com.epam.my_spring;

import lombok.Setter;
import lombok.SneakyThrows;
import org.reflections.Reflections;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 * @author Evgeny Borisov
 */
public class ObjectFactory {

    private List<ObjectConfigurator> configurators = new ArrayList<>();
    @Setter
    private ApplicationContext context;

    @SneakyThrows
    public ObjectFactory(Reflections scanner) {
        Set<Class<? extends ObjectConfigurator>> classes = scanner.getSubTypesOf(ObjectConfigurator.class);
        for (Class<? extends ObjectConfigurator> aClass : classes) {
            configurators.add(aClass.getDeclaredConstructor().newInstance());
        }
    }

    @SneakyThrows
    public <T> T createObject(Class<T> type) {
        T t = type.getDeclaredConstructor().newInstance();

        configurators.forEach(configurator ->configurator.configure(t,context) );


        return t;
    }
}












