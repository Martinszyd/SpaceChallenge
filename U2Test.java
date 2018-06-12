import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class U2Test {

    double CoLE;
    double CoLC;
    double random = new Random().nextDouble();
    double rateExplosion = 0.04;                // 5% rate of launch explosion
    double rateCrash = 0.08;
    int cargoCarried;                    // 1% rate of landing crash
    int cargoLimit;


    @BeforeEach

    @Test
    boolean launch() {
        this.CoLE = rateExplosion*(cargoCarried/cargoLimit);
        return !(this.CoLE >= this.random);
    }

    @Test
    boolean land() {
        this.CoLC = rateCrash*(cargoCarried/cargoLimit);
        return !(this.CoLC >= this.random);
    }
}