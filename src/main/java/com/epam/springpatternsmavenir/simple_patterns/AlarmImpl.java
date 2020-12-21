package com.epam.springpatternsmavenir.simple_patterns;

import java.time.LocalTime;

/**
 * @author Evgeny Borisov
 */
public class AlarmImpl implements Alarm {
    @Override
    public void setAlarm(LocalTime time) {
        System.out.println("alarm was set");
    }

    @Override
    public void stopAlarm() {
        System.out.println("alarm was stopped");
    }
}
