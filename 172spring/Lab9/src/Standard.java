
/*
 * Calculate interest and get amount on Standard credit card.
 * @author Lei Chen
 * @date 4/8/2019
 */

public class Standard {
    String LastName;
    String FirstName;
    String CardNumber;
    double interestRate;
    double upperLimit;
    double balance;

    /**
     * @param LastName of the account
     * @param FirstName of the account
     * @param CardNumber of the account
     */
    public Standard(String LastName, String FirstName, String CardNumber){
        this.LastName = LastName;
        this.FirstName = FirstName;
        this.CardNumber = CardNumber;
        interestRate = 0.15;
        upperLimit = 5000;
        balance = 0;
    }//constructor

    /**
     *
     * @param amount spend in that month
     * @return
     */
    public boolean Spend(double amount){
        if (balance+amount < upperLimit){
            balance = balance + amount;
            return true;
        }
        else{
            return false;
        }
    }//Spend(double amt) method

    /**
     *
     * @param amount pay in that month
     */
    public void Pay(double amount){
        balance = balance - amount;
    }//pay balance (double amount method

    /**
     * calculate the interest and add it to balance
     */
    public void calcInterest(){
        balance = (interestRate*balance) + balance;
    }//calcInterest() method

    //get(print) the answers
    public String getLastName(){
        return LastName;
    }
    public String getFirstName(){
        return FirstName;
    }
    public String getCardNumber(){
        return CardNumber;
    }
    public double getBalance(){
        return balance;
    }
    public double getInterestRate(){
        return interestRate;
    }
    public double getUpperLimit(){
        return upperLimit;
    }//getters
}//Standard class
