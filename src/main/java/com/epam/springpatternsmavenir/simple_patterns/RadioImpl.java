package com.epam.springpatternsmavenir.simple_patterns;

/**
 * @author Evgeny Borisov
 */
public class RadioImpl implements Radio {
    @Override
    public void changeChannel(double channel) {
        System.out.println("Channel was changed");
    }

    @Override
    public void changeVolume(int volume) {
        System.out.println("volume was changed");
    }
}
