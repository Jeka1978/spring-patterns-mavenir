package com.stam;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
public interface Ms {
    @PostConstruct
   default void init(){
        System.out.println("1231231231232");
    }
}
