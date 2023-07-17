import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BakeryTest {

    Bakery bakery;
    Traybake traybake;

    @BeforeAll
    public void setUp(){
        bakery = new Bakery("Greggs");
        traybake = new Traybake("Chocolate cake", "Chocolate", 25);
    }

    @Test
    public void canCountCakes(){
        assertThat(bakery.countCakes()).isEqualTo(0);
    }

    @Test
    public void canAddCake(){
        bakery.addCake(traybake);
        assertThat(bakery.countCakes()).isEqualTo(1);
    }

}
