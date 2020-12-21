package com.epam.singleton_anti_pattern;

import lombok.Getter;
import lombok.SneakyThrows;

/**
 * @author Evgeny Borisov
 */
public class MaamResolverSingleton {
    @Getter
    private double maam;
    private static MaamResolverSingleton instance = new MaamResolverSingleton();

    public static MaamResolverSingleton getInstance() {
        return instance;
    }

    private MaamResolverSingleton() {
        maam = getMaamFromServer();
    }



    @SneakyThrows
    private double getMaamFromServer() {
        Thread.sleep(4000);
        return 0.18;
    }
}








