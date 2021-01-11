package com.epam.screen_saver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * @author Evgeny Borisov
 */
@Component
public class ColorFrame extends JFrame {
    @Autowired
    private Random random;


    @Autowired
    private Color randomColor;



    @PostConstruct
    public void init(){

        System.out.println(randomColor.getClass().getName());
        System.out.println(randomColor.getBlue());
        System.out.println(randomColor.getBlue());
        System.out.println(randomColor.getBlue());

        setSize(200,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }


    public void moveToRandomLocation() {
        setLocation(random.nextInt(1200), random.nextInt(900));
        getContentPane().setBackground(randomColor);
        repaint();
    }

}






