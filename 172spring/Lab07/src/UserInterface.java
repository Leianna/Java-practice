
import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        VendingMachine vendingMachine = new VendingMachine();
        int request = 0;
        double balance;

        while (request > -1 && request <= 4) {

            System.out.println("\nWelcome to Soda Machine 2.0");
            System.out.println(" 1) Deposit Coins");
            System.out.println(" 2) Buy Drink");
            System.out.println(" 3) Get Change");
            System.out.println(" 4) Print Inventory");
            balance = vendingMachine.getBalance();
            System.out.println("Your balance is " + balance);
            System.out.println("\nwhat would you like to do? ");
            request = scan.nextInt();

            if (request == 1) {
                String coinInserted = "";
                do {
                    System.out.println("Please enter coin type 'nickel' or 'dime' or 'quarter' or 'next' when ready: ");
                    coinInserted = scan.next();
                    vendingMachine.insertCoin(coinInserted);
                    balance = vendingMachine.getBalance();
                    System.out.println("\nYour balance is " + balance);
                } while (!coinInserted.equalsIgnoreCase("next"));

            } else if (request == 2) {
                int selection;
                do {
                    System.out.println("Please make a selection: ");
                    System.out.println("1: Dr. Pepper: $1.25");
                    System.out.println("2: Snapple: $1.00");
                    System.out.println("3: Water: $0.80");
                    selection = scan.nextInt();
                } while (selection < 1 || selection > 3);

                if (vendingMachine.buy(selection)) {
                    System.out.println("Enjoy your drink!");
                }
                else {
                    System.out.println("Insufficient funds or selection out of stock");
                }
            }
            else if (request == 3  ) {
                if(vendingMachine.getBalance() > 0){
                    System.out.println("Please find " + vendingMachine.makeChange() + " in the coin return");
                }
                else {
                    System.out.println("No change");
                }
            }

            else if (request == 4){
                String inventory = vendingMachine.getInventory();
                System.out.print(inventory);
            }
        }//while request
    }//main
}//class