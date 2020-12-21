package com.epam.my_spring;

import lombok.Setter;
import lombok.SneakyThrows;
import org.reflections.Reflections;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.InvocationHandler;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

        configurators.forEach(configurator -> configurator.configure(t, context));




        if (Arrays.stream(type.getMethods()).anyMatch(method -> method.isAnnotationPresent(Benchmark.class))) {
            return (T) Enhancer.create(type, new InvocationHandler() {
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                    System.out.println("***** BENHMARK **** " + method.getName() + " started");
                    long start = System.nanoTime();
                    Object retVal = method.invoke(t, args);
                    long end = System.nanoTime();
                    System.out.println(end-start);
                    System.out.println("***** BENHMARK **** " + method.getName() + " finished");
                    return retVal;
                }
            });
        }


        return t;
    }
}












