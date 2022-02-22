public class test {
    public static void main(String[] args) {
        //test standard class
        Standard testStandard = new Standard("Mary", "Smith", "12345");
        //test constructor
        System.out.println("Last name should be Mary: "  + testStandard.getLastName());
        System.out.println("First name should be Smith: "  + testStandard.getFirstName());
        System.out.println("Card number should be 12345: "  + testStandard.getCardNumber());
        System.out.println("Interest rate should be 0.15: "  + testStandard.getInterestRate());
        System.out.println("Upper limit should be 5000: "  + testStandard.getUpperLimit());
        //Test upper limit
        System.out.println("Should be true: "  + testStandard.Spend(100));
        System.out.println("Should be 100: "  + testStandard.getBalance());
        System.out.println("Should be false: "  + testStandard.Spend(5000));
        System.out.println("Should be 100: "  + testStandard.getBalance());
        //test pay balance
        testStandard.Pay(90);
        testStandard.calcInterest();
        System.out.println("New balance should be 11.5: "  + testStandard.getBalance());

        System.out.println("————————————————————————————————————");
        //test LastChance
        LastChance testLastChance = new LastChance("Alex", "Adams", "34567");
        //test constructor
        System.out.println("Last name should be Alex: "  + testLastChance.getLastName());
        System.out.println("First name should be Adams: "  + testLastChance.getFirstName());
        System.out.println("Card number should be 234567: "  + testLastChance.getCardNumber());
        System.out.println("Interest rate should be 0.25: "  + testLastChance.getInterestRate());
        System.out.println("Upper limit should be 1000: "  + testLastChance.getUpperLimit());
        //Test upper limit
        System.out.println("Should be true: "  + testLastChance.Spend(100));
        System.out.println("Should be 100: "  + testLastChance.getBalance());
        System.out.println("Should be false: "  + testLastChance.Spend(1000));
        System.out.println("Should be 100: "  + testLastChance.getBalance());
        //test calcInterest
        testLastChance.Pay(90);
        testLastChance.calcInterest();
        System.out.println("New balance should be 12.5: "  + testLastChance.getBalance());
        testLastChance.Pay(12.5);
        //test pay in times
        //1
        System.out.println("Pay in time should be 1: "  + testLastChance.getPayingTime());
        //2
        testLastChance.Spend(100);
        testLastChance.Pay(100);
        //3
        testLastChance.Spend(100);
        testLastChance.Pay(100);
        //4
        testLastChance.Spend(100);
        testLastChance.Pay(100);
        //5
        testLastChance.Spend(100);
        testLastChance.Pay(100);

        //test pay in times >= 5
        System.out.println("Interest rate should be 0.20: "  + testLastChance.getInterestRate());
        System.out.println("Upper limit should be 2500: "  + testLastChance.getUpperLimit());

        System.out.println("————————————————————————————————————");
        //test Gold class
        Gold testGold = new Gold("John", "Jones", "34567");
        //test constructor
        System.out.println("Last name should be John: "  + testGold.getLastName());
        System.out.println("First name should be Jones: "  + testGold.getFirstName());
        System.out.println("Card number should be 34567: "  + testGold.getCardNumber());
        System.out.println("Interest rate should be 0.1: "  + testGold.getInterestRate());
        System.out.println("Upper limit should be 20000: "  + testGold.getUpperLimit());
        //Test upper limit

        System.out.println("Should be true: "  + testGold.Spend(100));
        System.out.println("Should be 100: " + testGold.getBalance());
        System.out.println("Should be false: "  + testGold.Spend(20000));
        System.out.println("Should be 100: " + testGold.getBalance());
        System.out.println("Reward point should be 100: " + testGold.getRewardPoint());
        //test calcInterest
        testGold.Spend(100);
        System.out.println("balance should be 200: " + testGold.getBalance());
        System.out.println("Reward point should be 200: " + testGold.getRewardPoint());

        //test pay balance
        testGold.Pay(100);
        testGold.calcInterest();
        System.out.println("New balance should be 110: "  + testGold.getBalance());
    }

}
