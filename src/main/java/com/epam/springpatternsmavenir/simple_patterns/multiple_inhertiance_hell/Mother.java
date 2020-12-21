package com.epam.springpatternsmavenir.simple_patterns.multiple_inhertiance_hell;

/**
 * @author Evgeny Borisov
 */
public interface Mother {
   default void talkToChildren(){
       System.out.println("CHILDREN, COME TO ME!!!");
   }
}
