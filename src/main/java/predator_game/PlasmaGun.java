package predator_game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class PlasmaGun {

    private final Commando mac;


    public PlasmaGun(@Indian Commando mac) {
        System.out.println("Plazma arrived");
        this.mac = mac;
    }

    public void shoot(Commando commando) {
        if (!commando.getClass().getSimpleName().equals("Datch")) {
            commando.setAlive(false);
        }
    }
}
