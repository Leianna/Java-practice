

public class Coin {
   private static final double nickel = 0.05;
    private static final double dime = 0.10;
    private static final double quarter = 0.25;
    private static final double unrecognized = 0.0;

    public static double value(String coinType) {
        double coinValue;
        if (coinType.equalsIgnoreCase("nickel")) {
            coinValue = nickel;
        } else if (coinType.equalsIgnoreCase("dime")) {
            coinValue = dime;
        } else if (coinType.equalsIgnoreCase("quarter")) {
            coinValue = quarter;
        } else {
            coinValue = unrecognized;
        }
        return coinValue;
    }
}
