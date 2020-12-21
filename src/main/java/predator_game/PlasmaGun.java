package predator_game;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class PlasmaGun {

    public PlasmaGun() {
        System.out.println("Plazma arrived");
    }

    public void shoot(Commando commando) {
        if (!commando.getClass().getSimpleName().equals("Datch")) {
            commando.setAlive(false);
        }
    }
}
