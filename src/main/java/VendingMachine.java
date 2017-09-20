
public class VendingMachine {


    public static Boolean isValidCoin(CoinType coin) {

        if (coin == CoinType.PENNY) {
            return false;
        } else if (coin == CoinType.QUARTER) {
            return true;
        } else if (coin == CoinType.DIME) {
            return true;
        } else if (coin == CoinType.NICKEL) {
            return true;
        } else {
            return null;
        }
    }

    public int coinValue(CoinType coin){

        if (coin == CoinType.NICKEL){
            return 5;
        }
        return 0;
    }
}



