package com.epam.springpatternsmavenir.simple_patterns;

import java.time.LocalTime;

/**
 * @author Evgeny Borisov
 */
public interface RadioAlarm {
    void changeChannel(double channel);

    void changeVolume(int volume);

    void setAlarm(LocalTime time);

    void stopAlarm();


}
