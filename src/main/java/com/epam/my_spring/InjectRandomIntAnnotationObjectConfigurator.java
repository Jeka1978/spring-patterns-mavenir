package com.epam.my_spring;

import lombok.SneakyThrows;

import java.lang.reflect.Field;
import java.util.Random;

/**
 * @author Evgeny Borisov
 */
public class InjectRandomIntAnnotationObjectConfigurator implements ObjectConfigurator {
    @Override
    @SneakyThrows
    public void configure(Object t,ApplicationContext context) {
        Class<?> type = t.getClass();
        Field[] fields = type.getDeclaredFields();
        for (Field field : fields) {
            InjectRandomInt annotation = field.getAnnotation(InjectRandomInt.class);
            if (annotation != null) {
                int min = annotation.min();
                int max = annotation.max();
                Random random = new Random();
                int value = random.nextInt(max - min) + min;
                field.setAccessible(true);
                field.set(t,value);
            }
        }
    }
}
