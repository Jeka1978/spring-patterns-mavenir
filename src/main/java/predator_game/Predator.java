package predator_game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
public class Predator {
    @Autowired
    private PlasmaGun lazer;

    public Predator() {
        System.out.println("predator was created");
    }

    public void fight(Commando commando) {
        lazer.shoot(commando);
    }
}
