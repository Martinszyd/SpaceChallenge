
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class KalkulatorTest {

    int a;
    int b;

    @Before
    public void before() {
        a = 6;          //GIVEN
        b = 3;
    }

    @Test
    public void dodaj() {

        int result = Kalkulator.dodaj(a, b);  //test wykonuje JUnit   WHEN

        assertThat(result).isEqualTo(9); // wynik sprawdza assertJ    THEN
    }

    @Test
    public void odejmij() {

        int result = Kalkulator.odejmij(a, b);

        assertThat(result).isEqualTo(3);
    }

    @Test
    public void pomnoz() {

        int result = Kalkulator.pomnoz(a, b);

        assertThat(result).isEqualTo(18);
    }

    @Test
    public void podziel() {

        int result = Kalkulator.podziel(a, b);

        assertThat(result).isEqualTo(2);
    }

}