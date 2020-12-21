package com.epam.springpatternsmavenir.simple_patterns;

import java.time.LocalTime;

/**
 * @author Evgeny Borisov
 */
public interface Alarm {
    void setAlarm(LocalTime time);

    void stopAlarm();
}
