import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TieredCakeTest {

    TieredCake tier;

    @BeforeAll
    public void setUp(){
        tier = new TieredCake("Tiered Cake", "Sponge", 3);

    }

    @Test
    public void canSetTierFlavours(){
        tier.setTierFlavours("Chocolate");
        assertThat(tier.getTierFlavours().size()).isEqualTo(3);
    }
}
