import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CakeTest {

    Cake cake;

    @BeforeEach
    public void setUp() {
        cake = new Cupcake("Oreo","Oreo", 5.00, 1.00, "Oreo", "Oreo crumbs" , false);
    }

    @Test
    public void canSelectCakeName(){
        assertThat(cake.selectCakeName()).isEqualTo("You selected Oreo");
    }

    @Test
    public void canCalculateCakeMargin(){
        assertThat(cake.calculateMargin()).isEqualTo(4.00);
    }


    // testing getters and setters:
    @Test
    public void canSetSellPrice(){
        cake.setSellPrice(200.00);
        assertThat(cake.getSellPrice()).isEqualTo(200.00);
    }

}

