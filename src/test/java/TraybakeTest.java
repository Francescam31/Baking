import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TraybakeTest {

    Traybake traybake;

    @BeforeEach
    public void setUp(){
        traybake = new Traybake("Chocolate cake", "Chocolate", 25);
    }

    @Test
    public void canGetBakingTime(){

        assertThat(traybake.calculateBakingTime()).isEqualTo(50);
    }

    @Test
    public void canBakeCake(){
        assertThat(traybake.cakeBaked()).isEqualTo("Traybake is ready");
    }
}
