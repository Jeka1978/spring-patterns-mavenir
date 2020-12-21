package com.epam.my_spring;

import lombok.SneakyThrows;

import java.lang.reflect.Field;

/**
 * @author Evgeny Borisov
 */
public class InjectByTypeObjectConfigurator implements ObjectConfigurator {
    @SneakyThrows
    @Override
    public void configure(Object t,ApplicationContext context) {
        Field[] fields = t.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(InjectByType.class)) {
                Object object = context.getObject(field.getType());
                field.setAccessible(true);
                field.set(t,object);
            }
        }
    }
}
