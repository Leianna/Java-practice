public class Tester {
    public static void main(String[] args) {


        Diamond d1 = new Diamond(1.5, "flawless", 'D');
        d1.CaratCost();
        System.out.println("Base price should be 2250: " + d1.getBasePrice());
        d1.calcCharityCost();
        d1.calcColorRateCost();
        System.out.println("Total price should be 4500: " + d1.getFinalValue());

        Diamond d2 = new Diamond(1.5, "flawed", 'D');
        d2.CaratCost();
        System.out.println("Base price should be 2250: " + d2.getBasePrice());
        d2.calcCharityCost();
        d2.calcColorRateCost();
        System.out.println("Total price should be 2250: " + d2.getFinalValue());

        Diamond d3 = new Diamond(1.5, "flawed", 'K');
        d3.CaratCost();
        System.out.println("Base price should be 2250: " + d3.getBasePrice());
        d3.calcCharityCost();
        d3.calcColorRateCost();
        System.out.println("Total price should be 1800: " + d3.getFinalValue());

        Diamond d4 = new Diamond(1.5, "flawed", 'T');
        d4.CaratCost();
        System.out.println("Base price should be 2250: " + d4.getBasePrice());
        d4.calcCharityCost();
        d4.calcColorRateCost();
        System.out.println("Total price should be 1575: " + d4.getFinalValue());

        Diamond d5 = new Diamond(3.0, "flawed", 'D');
        d5.CaratCost();
        System.out.println("Base price should be 4500: " + d5.getBasePrice());
        d5.calcCharityCost();
        d5.calcColorRateCost();
        System.out.println("Total price should be 4500: " + d5.getFinalValue());
    }
}
