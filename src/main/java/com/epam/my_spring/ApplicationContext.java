package com.epam.my_spring;

import lombok.Getter;
import org.reflections.Reflections;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Evgeny Borisov
 */
public class ApplicationContext {

    private Map<Class<?>, Object> cache = new HashMap<>();

    private ObjectFactory factory;


    private String packagesToScan;
    @Getter
    private Reflections scanner;

    public ApplicationContext(String packageToScan) {
        this.packagesToScan = packageToScan;
        scanner = new Reflections(packageToScan);
        factory = new ObjectFactory(scanner);
        factory.setContext(this);
    }


    public <T> T getObject(Class<T> type) {
        if (cache.containsKey(type)) {
            return (T) cache.get(type);
        }
        T t = factory.createObject(type);

        if (type.isAnnotationPresent(Singleton.class)) {
            cache.put(type, t);
        }

        return t;

    }











}







