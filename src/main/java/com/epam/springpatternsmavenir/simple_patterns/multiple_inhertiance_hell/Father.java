package com.epam.springpatternsmavenir.simple_patterns.multiple_inhertiance_hell;

/**
 * @author Evgeny Borisov
 */
public interface Father {
   default void talkToChildren(){
       System.out.println("Children, please come to me");
   }
}
