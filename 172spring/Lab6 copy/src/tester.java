public class tester {
    public static void main(String[] args) {
        BankCustomer smith = new BankCustomer("John", "Smith", 1001);
        System.out.println("Created account for " + smith.getFirstName() +
                " " + smith.getLastName() + " account number: " +
                smith.getAccountNumber());
        smith.deposit("savings", 500);
        smith.transfer("checking", "savings", 200);
        System.out.println( "Expected 300 got " +
                smith.getBalance("savings"));
        System.out.println( "Expected 200 got " +
                smith.getBalance("checking"));
        BankCustomer doe = new BankCustomer("Jane", "Doe", 1002);
        System.out.println("Created account for " + doe.getFirstName() + " "
                + doe.getLastName() + " account number: " +
                doe.getAccountNumber());
        doe.deposit("checking", 700);
        doe.transfer("savings", "checking", 400);
        System.out.println( "Expected 400 got " + doe.getBalance("savings"));
        System.out.println( "Expected 300 got " +doe.getBalance("checking"));
        boolean result = doe.withdraw("checking", 1000);
        System.out.println("Expected false got " + result);
        System.out.println( "Expected 300 got " +doe.getBalance("checking"));
        result = doe.withdraw("checking", 100);
        System.out.println("Expected true got " + result);
        System.out.println( "Expected 200 got " +doe.getBalance("checking"));
    }

}
