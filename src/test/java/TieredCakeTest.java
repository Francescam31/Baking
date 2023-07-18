import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TieredCakeTest {

    TieredCake tier;

    @BeforeEach
    public void setUp(){
        tier = new TieredCake("Tiered Cake", "Sponge", 3);
    }

    @Test
    public void caGetNumberOfTiers(){
        assertThat(tier.getNumberOfTiers()).isEqualTo(3);
    }

    @Test
    public void canBakeCake(){
        assertThat(tier.cakeBaked()).isEqualTo("Cake tiers are ready");
    }

    @Test
    public void canSetTierFlavours(){
        tier.setTierFlavours("Chocolate");
        assertThat(tier.getTierFlavours().size()).isEqualTo(3);
    }



}
