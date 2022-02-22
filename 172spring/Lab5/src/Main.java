import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String Exit="a";
        while (Exit!="Quit") {

            Scanner s = new Scanner(System.in);
            System.out.print("Enter carat weighs: ");
            double CaratWeighs = s.nextDouble();

            System.out.print("Enter clarity: flawless or flawed: ");
            while (!s.hasNext("flawless") && !s.hasNext("flawed")) {
                System.out.print("Please re-enter clarity: flawless or flawed: ");
                s.next();
            }
            String clarity = s.next();

            System.out.print("Enter colorRating: D, K or T: ");
            while (!s.hasNext("D") && !s.hasNext("K") && !s.hasNext("T")) {
                System.out.print("Please re-enter colorRating: D, K or T: ");
                s.next().charAt(0);
            }
            Character colorRating = s.next().charAt(0);

            Diamond D1 = new Diamond(CaratWeighs, clarity, colorRating);
            D1.CaratCost();
            System.out.println("Base price: " + D1.getBasePrice());
            D1.calcCharityCost();
            D1.calcColorRateCost();
            System.out.println("Total price: " + D1.getFinalValue());
            Exit = s.next();
        }


    }
}
