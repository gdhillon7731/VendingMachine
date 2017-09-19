
public class VendingMachine {


    public static Boolean isValidCoin(String coin) {


        if (coin == "penny") {
            return false;
        } else if (coin == "quarter") {
            return true;
        }
        return null;
    }
}


