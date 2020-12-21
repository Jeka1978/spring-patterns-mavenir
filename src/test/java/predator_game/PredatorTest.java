package predator_game;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


/**
 * @author Evgeny Borisov
 */
@SpringBootTest(classes = TestEnvConfig.class)
class PredatorTest {

    @Autowired
    private Billy billy;
    @Autowired
    private Predator predator;
    @Test
    public void predatorKillNotDatch() {
        predator.fight(billy);
        Assertions.assertFalse(billy.isAlive());
    }
}