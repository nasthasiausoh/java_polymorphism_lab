import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MilkshakeTest {

    @Test
    public void milkshakeHasDisplayName(){
        Milkshake milkshake = new Milkshake("Strawberry dream", "strawberry", 5.00);
        assertThat(milkshake.getDisplayName()).isEqualTo("STRAWBERRY DREAM - STRAWBERRY - £5.0");
    }
}
