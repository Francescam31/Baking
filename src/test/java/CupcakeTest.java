import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CupcakeTest {

    Cupcake cupcake;

    @BeforeAll
    public void setUp(){
        cupcake = new Cupcake("Vanilla Cupcakes", "Vanilla", 12);

    }

    @Test
    public void canCheckIcing(){
        assertThat(cupcake.enoughIcing()).isEqualTo(false);
    }
}
