package com.epam.screen_saver;

import org.springframework.context.annotation.*;

import java.awt.*;
import java.util.Random;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ComponentScan
public class MainConf {

    @Bean
    public Random random() {
        return new Random();
    }

    @Bean
    @Lazy
    @Scope(value = "singleton",proxyMode = ScopedProxyMode.TARGET_CLASS)
    public Color randomColor(Random random) {
        return new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
    }


    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConf.class);
        while (true) {
            context.getBean(ColorFrame.class).moveToRandomLocation();
            Thread.sleep(80);
        }
    }
}
