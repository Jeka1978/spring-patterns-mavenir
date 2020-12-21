package com.epam.singleton_anti_pattern;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Evgeny Borisov
 */
class TaxCalcTest {

    @Test
    void withMaam() {
        MaamResolver mock = Mockito.mock(MaamResolver.class);
        Mockito.when(mock.getMaam()).thenReturn(0.17);

        TaxCalc taxCalc = new TaxCalc();
        double withMaam = taxCalc.withMaam(100);
        assertEquals(118,withMaam);


    }
}