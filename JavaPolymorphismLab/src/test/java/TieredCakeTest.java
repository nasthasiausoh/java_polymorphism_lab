import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TieredCakeTest {

    TieredCake tieredCake;

    @BeforeEach
    public void setUp() {
        tieredCake = new TieredCake("Wedding cake", "Fruit cake", 350.00, 19.00, "Vanilla", "Petals", 4);
    }

    @Test
    public void canSelectTieredCakeName(){
        assertThat(tieredCake.selectCakeName()).isEqualTo("You selected Wedding cake");
    }

    @Test
    public void canCalculateTieredCakeMargin(){
        assertThat(tieredCake.calculateMargin()).isEqualTo(331.00);
    }

    @Test
    public void canSetTiers(){
       tieredCake.setTiers(6);
       assertThat(tieredCake.getTiers()).isEqualTo(6);

    }


}
