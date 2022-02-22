public class tester {
    public static void main(String[] args) {
        bankAccount accountEX1 = new bankAccount(0);
        System.out.println("test initial balance: $" + accountEX1.getbalance());
        System.out.println("test withdraw, should return false: " + accountEX1.withdraw(10));
        accountEX1.deposit(100);
        System.out.println("test deposit $100, should return $100: $" +accountEX1.getbalance());
        System.out.println("test withdraw $20, should return true, and get $80: " + accountEX1.withdraw(20) + "; $" + accountEX1.getbalance());
        accountEX1.calcInterest(0.1);
        System.out.println("test interest 10%, should return $88: $" + accountEX1.getbalance());
        System.out.println(accountEX1.getAlist());

    }
}
