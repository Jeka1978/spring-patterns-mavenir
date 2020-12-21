package predator_game;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.support.GenericApplicationContext;


/**
 * @author Evgeny Borisov
 */
@SpringBootTest(classes = TestEnvConfig.class)
class PredatorTest {

    @Autowired
    GenericApplicationContext context;

    @Autowired
    private Commando billy;

    @Autowired
    private Predator predator;
    @Test
    public void predatorKillNotDatch() {
        predator.fight(billy);
        Assertions.assertFalse(billy.isAlive());
    }
}