/*
 * Calculate interest and get amount on Last Chance credit card.
 */

public class LastChance extends Standard {
    int PayingTime;

    /**
     * @param LastName of the account
     * @param FirstName of the account
     * @param CardNumber of the account
     */
    public LastChance(String LastName, String FirstName, String CardNumber){
        super(LastName, FirstName, CardNumber);
        interestRate = 0.25;
        upperLimit = 1000;
        PayingTime = 0;

    }//constructor

    /**
     * calculate the PayingTime
     * @param amount pay in that month
     */
    public void Pay(double amount){
        balance = balance - amount;
        if (balance==0){
            PayingTime = PayingTime + 1;
        }
        if (PayingTime >= 5){
            upperLimit = 2500;
            interestRate = 0.20;
        }
    }//Pay() method


    //get(print) the answers
    public int getPayingTime(){
        return PayingTime;
    }//getter

}//LastChance class
