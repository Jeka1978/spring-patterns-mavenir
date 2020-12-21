package com.epam.springpatternsmavenir.simple_patterns;

import lombok.Setter;
import lombok.experimental.Delegate;

import java.time.LocalTime;

/**
 * @author Evgeny Borisov
 */
public class RadioAlarmImpl implements RadioAlarm {
    @Setter
    @Delegate
    private Alarm alarm;
    @Setter
    @Delegate(excludes =RadioExclusions.class )
    private Radio radio;

    public RadioAlarmImpl(Alarm alarm, Radio radio) {
        this.alarm = alarm;
        this.radio = radio;
    }



    @Override
    public void changeVolume(int volume) {

    }
}
