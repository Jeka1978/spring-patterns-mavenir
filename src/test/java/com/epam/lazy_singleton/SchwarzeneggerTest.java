package com.epam.lazy_singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Evgeny Borisov
 */
class SchwarzeneggerTest {

    @Test
    void killEnemies() {

        Schwarzenegger schwarzenegger = new Schwarzenegger();

        schwarzenegger.killEnemies();

    }
}