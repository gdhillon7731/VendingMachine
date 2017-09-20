
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VendingMachineTest {

    private VendingMachine vendingMachine;

    @Before
    public void setup(){
        vendingMachine = new VendingMachine();
    }

    @Test
    public void no_Coins_Have_Been_Inserted_Displays_Message(){
        assertEquals("INSERT COIN", vendingMachine.vending_Machine_Display());

    }
}
