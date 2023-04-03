import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BakeryTest {
    Bakery bakery;

    @BeforeEach
    public void setUp(){
        bakery = new Bakery("Cake World");
    }

    @Test
    public void bakeryHasName(){
        assertThat(bakery.getName()).isEqualTo("Cake World");
    }

    @Test
    public void bakeryStartsEmpty(){
        assertThat(bakery.countCakes()).isEqualTo(0);
    }

    @Test
    public void tillStartsEmpty(){
        assertThat(bakery.getTill()).isEqualTo(0);
    }

    @Test
    public void canAddCakes() {
        Cake cakeType1 = new Cupcake("Oreo", "Oreo", 5.00, 1.00, "Oreo", "Oreo crumbs", false);
        Cake cakeType2 = new TieredCake("Wedding cake", "Fruit cake", 350.00, 19.00, "Vanilla", "Petals", 4);
        Cake cakeType3 = new Traybake("Lotus world", "Vanilla", 5.50, 0.95, "Lotus biscoff", "Cinnamon sugar", 12, 9);
        bakery.addCake(cakeType1);
        bakery.addCake(cakeType2);
        bakery.addCake(cakeType3);
        assertThat(bakery.countCakes()).isEqualTo(3);

    }

}
