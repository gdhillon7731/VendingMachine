
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
    public void penny_Invalid_Coin_Identifies(){

        Boolean invalidCoin = Coin.isValidCoin(CoinType.PENNY);
        assertEquals(false, invalidCoin);
    }
    @Test
    public void quarter_Valid_Coin_Identifies(){

        Boolean validCoin = Coin.isValidCoin(CoinType.QUARTER);
        assertEquals(true, validCoin);
    }
    @Test
    public void dime_Valid_Coin_Identifies(){

        Boolean validCoin = Coin.isValidCoin(CoinType.DIME);
        assertEquals(true, validCoin);
    }
    @Test
    public void nickel_Valid_Coin_Identifies(){

        Boolean validCoin = Coin.isValidCoin(CoinType.NICKEL);
        assertEquals(true, validCoin);
    }
    @Test
    public void correctMonetaryValueForCoins(){

        assertEquals(5, Coin.coinValue(CoinType.NICKEL));
        assertEquals(10, Coin.coinValue(CoinType.DIME));
        assertEquals(25, Coin.coinValue(CoinType.QUARTER));
    }

}
