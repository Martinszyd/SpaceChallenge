import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.Random;


class U1Test {

    double CoLE;
    double CoLC;
    double random = new Random().nextDouble();
    double rateExplosion = 0.05;                // 5% rate of launch explosion
    double rateCrash = 0.01;
    int cargoCarried;                    // 1% rate of landing crash
    int cargoLimit;

    @Test
    boolean launch() {
        cargoCarried=10;
        cargoLimit=18;
        this.CoLE = rateExplosion*(cargoCarried/cargoLimit);
        return !(this.CoLE >= this.random);
        assertThat(CoLE).isEqualTo(0.0278);
    }

    @Test
    boolean land() {
        cargoCarried=10;
        cargoLimit=18;
        this.CoLC = rateCrash*(cargoCarried/cargoLimit);
        return !(this.CoLC >= this.random);
        assertThat(CoLC).isEqualTo(0.00555);
    }
}