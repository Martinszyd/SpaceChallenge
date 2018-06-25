import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import java.util.Random;


class U2Test {

    double CoLE;
    double CoLC;
    double random = new Random().nextDouble();
    double rateExplosion = 0.04;                // 5% rate of launch explosion
    double rateCrash = 0.08;
    int cargoCarried;                    // 1% rate of landing crash
    int cargoLimit;


    @Before

    @Test
    boolean launch() {
        cargoCarried=10;
        cargoLimit=36;
        this.CoLE = rateExplosion*(cargoCarried/cargoLimit);
        return !(this.CoLE >= this.random);
        assertThat(CoLE).isEqualTo(0.0111);
    }

    @Test
    boolean land() {
        cargoCarried = 10;
        cargoLimit = 36;
        this.CoLC = rateCrash * (cargoCarried / cargoLimit);
        return !(this.CoLC >= this.random);
        assertThat(CoLC).isEqualTo(0.02222);
    }
}