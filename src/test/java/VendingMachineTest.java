
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VendingMachineTest {


    @Test
    public void penny_Invalid_Coin_Identifies(){
        VendingMachine vendingMachine = new VendingMachine();
        Boolean invalidCoin = vendingMachine.isValidCoin("penny");
        assertEquals(false, invalidCoin);
    }
    @Test
    public void quarter_Valid_Coin_Identifies(){
        VendingMachine vendingMachine = new VendingMachine();
        Boolean invalidCoin = vendingMachine.isValidCoin("quarter");
        assertEquals(true, invalidCoin);
    }

}
