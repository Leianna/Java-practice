public class Tester {
    public static void main(String[] args) {
        System.out.println("-------------Test VendingMachine--------------");
        VendingMachine test1 = new VendingMachine();
        test1.insertCoin("nickel");
        test1.insertCoin("nickel");
        test1.insertCoin("nickel");
        test1.insertCoin("nickel");
        System.out.println("should return balance 0.20: " + test1.getBalance());

        test1.insertCoin("dime");
        System.out.println("should return balance 0.30: " + test1.getBalance());

        test1.insertCoin("quarter");
        test1.insertCoin("quarter");
        test1.insertCoin("quarter");
        System.out.println("should return balance 1.05: " + test1.getBalance());

        //test to buy 1.25 drink with 1.00 in balance
        System.out.println("should return false: " + test1.buy(1));

        //test to buy 1.00 drink with 1.00 in balance
        System.out.println("should return true: " + test1.buy(2));

        //test to get change
        System.out.println("should return Changes 0.05: " + test1.makeChange());
        System.out.println("should return Balance 0.00: " + test1.getBalance());

        //test to get change
        System.out.println("-------"  + "\nshould return: \nProduct name:Dr.Pepper\nQuantity:5\nPrice:1.25\nProduct name:Snapple\nQuantity:4\nPrice:1.0\nProduct name:Water\nQuantity:5\nPrice:0.8: " + test1.getInventory());


        System.out.println("-------------Test Product--------------");
        Product test2 = new Product("testObj", 1, 3.00);
        System.out.println("-------"  + "\nshould return: \nProduct name:testObj\nQuantity:1\nPrice:3.0" + test2.toString() + "\n-------" );

        test2.decrementQuanity();
        System.out.println("-------"  + "\nshould return: \nProduct name:testObj\nQuantity:0\nPrice:3.0" + test2.toString() + "\n-------" );
        test2.decrementQuanity();
        System.out.println("Test decrementQuanity() should return false: " + test2.decrementQuanity());

        test2.incrementQuantity(3);//test incrementQuantity 3
        test2.changePrice(2.75);//Test Changing Price
        System.out.println("-------"  + "\nshould return: \nProduct name:testObj\nQuantity:3\nPrice:2.75" + test2.toString() + "\n-------" );
    }
}
