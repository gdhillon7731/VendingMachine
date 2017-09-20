
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VendingMachineTest {


    @Test
    public void penny_Invalid_Coin_Identifies(){
        VendingMachine vendingMachine = new VendingMachine();
        Boolean invalidCoin = vendingMachine.isValidCoin(CoinType.PENNY);
        assertEquals(false, invalidCoin);
    }
    @Test
    public void quarter_Valid_Coin_Identifies(){
        VendingMachine vendingMachine = new VendingMachine();
        Boolean validCoin = vendingMachine.isValidCoin(CoinType.QUARTER);
        assertEquals(true, validCoin);
    }
    @Test
    public void dime_Valid_Coin_Identifies(){
        VendingMachine vendingMachine = new VendingMachine();
        Boolean validCoin = vendingMachine.isValidCoin(CoinType.DIME);
        assertEquals(true, validCoin);
    }
    @Test
    public void nickel_Valid_Coin_Identifies(){
        VendingMachine vendingMachine = new VendingMachine();
        Boolean validCoin = vendingMachine.isValidCoin(CoinType.NICKEL);
        assertEquals(true, validCoin);
    }
    @Test
    public void correctMonetaryValueForCoins(){
        VendingMachine vendingMachine = new VendingMachine();
        assertEquals(5, vendingMachine.coinValue(CoinType.NICKEL));
    }

}
