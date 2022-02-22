import java.util.ArrayList;

public class bankAccount {
    private double balance;
    ArrayList<String> alist = new ArrayList<>();

    public bankAccount(double initialBalance){
        this.balance = initialBalance;

        alist.add("balance: " + balance);
    }

    public void deposit(double amount){
        this.balance = balance + amount;
        alist.add("\nDeposit: $" + balance);
    }

    public boolean withdraw(double amount){
        if (amount > balance){
            return false;
        }
        else{
            this.balance = balance - amount;
            alist.add("\nwithdraw: $" + balance);
            return true;
        }
    }

    public void calcInterest(double interestRate){
        this.balance = balance + (interestRate * balance);
        alist.add("\nAdd interest: " + balance);
    }

    public double getbalance(){
        return this.balance;
    }

    public ArrayList<String> getAlist() {
        return alist;
    }
}
