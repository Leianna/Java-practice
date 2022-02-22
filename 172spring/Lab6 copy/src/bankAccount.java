/*
    calculate withdraw and deposit amount
 */

public class bankAccount {
    //property
    public double balance;

    /**
     * set initial balance equal to what it enters
     * @param amount
     */
    bankAccount(double amount){
        this.balance = amount;
    }

    /**
     * deposit money by adding amount into balance
     * @param amount - deposit
     */
    public void deposit(double amount){
        balance = balance + amount;
    }

    /**
     * withdraw money by subtract amount from balance.
     * If amount greater than balance should return false, else return true.
     * @param amount - amount to withdraw
     * @return true or false
     */
    public boolean withdraw(double amount){
        if(balance < amount){
            return false;
        }
        else{
            balance = balance - amount;
            return true;
        }
    }

    /**
     *
     * @return balance
     */
    public double getBalance(){
        return balance;
    }
}
