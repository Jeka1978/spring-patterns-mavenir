package predator_game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ComponentScan(lazyInit = true)
public class MainPredator {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainPredator.class);
        System.out.println();
    }
}
