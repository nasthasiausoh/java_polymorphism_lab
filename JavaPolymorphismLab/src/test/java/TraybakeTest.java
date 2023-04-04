import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TraybakeTest {

    Traybake traybake;

    @BeforeEach
    public void setUp() {
        traybake = new Traybake("Lotus world", "Vanilla", 5.50, 0.95, "Lotus biscoff", "Cinnamon sugar", 12, 9);
    }

    @Test
    public void canSelectTieredCakeName(){
        assertThat(traybake.selectCakeName()).isEqualTo("You selected Lotus world");
    }

    @Test
    public void canCalculateTieredCakeMargin(){
        assertThat(traybake.calculateMargin()).isEqualTo(4.55);
    }

    @Test
    public void canSetTraybakeSize(){
        traybake.setTraybakeSize(24);
        assertThat(traybake.getTraybakeSize()).isEqualTo(24);
    }

    @Test
    public void canSetNumberOfSlices(){
        traybake.setNumberOfSlices(4);
        assertThat(traybake.getNumberOfSlices()).isEqualTo(4);
    }

    @Test
    public void traybakeHasDisplayName(){
        traybake = new Traybake("Lotus world", "Vanilla", 5.50, 0.95, "Lotus biscoff", "Cinnamon sugar", 12, 9);
        assertThat(traybake.getDisplayName()).isEqualTo("LOTUS WORLD - VANILLA - £5.5");
    }
}
