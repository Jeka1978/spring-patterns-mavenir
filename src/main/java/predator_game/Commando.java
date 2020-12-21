package predator_game;

import lombok.Data;

/**
 * @author Evgeny Borisov
 */
@Data
public abstract class Commando {
    private boolean alive;
    public Commando() {
        System.out.println(getClass().getSimpleName()+" was created");
    }
}
