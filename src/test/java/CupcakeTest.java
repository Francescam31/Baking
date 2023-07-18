import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CupcakeTest {

    Cupcake cupcake;

    @BeforeEach
    public void setUp(){
        cupcake = new Cupcake("Vanilla Cupcakes", "Vanilla", 12);

    }

    @Test
    public void canCheckIcing(){
        assertThat(cupcake.enoughIcing()).isEqualTo(false);
    }

    @Test
    public void canIceCake(){
        assertThat(cupcake.ice()).isEqualTo("Cake is iced and ready to go");
    }

    @Test
    public void canBakeCake(){
        assertThat(cupcake.cakeBaked()).isEqualTo("Cupcakes are ready");
    }


}

