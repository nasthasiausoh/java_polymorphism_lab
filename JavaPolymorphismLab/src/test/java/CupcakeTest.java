import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CupcakeTest {

    Cupcake cupcake;

    @BeforeEach
    public void setUp(){
        cupcake = new Cupcake("Oreo dream", "Oreo", 5.00, 1.00, "Oreo", "Oreo crumbs", false);
    }

    @Test
    public void canSelectCupcakeName(){
        assertThat(cupcake.selectCakeName()).isEqualTo("You selected Oreo dream");
    }

    @Test
    public void canCalculateCupcakeMargin(){
        assertThat(cupcake.calculateMargin()).isEqualTo(4.00);
    }

    @Test
    public void canCheckForSprinkles() {
        cupcake.setSprinkles(false);
        assertThat(cupcake.getSprinkles()).isEqualTo(false);
    }

    @Test
    public void canAddSprinkles(){
        assertThat(cupcake.addSprinkles()).isEqualTo("Add sprinkles");
    }

    @Test
    public void cupcakeHasDisplayName(){
        cupcake = new Cupcake("Oreo dream", "Oreo", 5.00, 1.00, "Oreo", "Oreo crumbs", false);
        assertThat(cupcake.getDisplayName()).isEqualTo("OREO DREAM - OREO - £5.0");
    }
}
