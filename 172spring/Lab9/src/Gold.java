/*
 * Calculate interest and get amount on gold credit card.
 */

public class Gold extends Standard {
    double RewardPoint;

    /**
     * @param LastName of the account
     * @param FirstName of the account
     * @param CardNumber of the account
     */
    //set the interest rate, uppper limit and reward point for gold credit card
    //get super class constructor
    public Gold(String LastName, String FirstName, String CardNumber) {
        super(LastName, FirstName, CardNumber);
        interestRate = 0.1;
        upperLimit = 20000;
        RewardPoint = 0;
    }//constructor

    /**
     * calculate Reward point by amount user spend
     * @param amount spend in that month
     * @return
     */
    //no decimals
    public boolean Spend(double amount){
        if (balance+amount < upperLimit){
            balance = balance + amount;
            RewardPoint = RewardPoint + (int)amount;
            return true;
        }
        else{
            return false;
        }
    }//Spend() method

    //get(print) the answers
    public double getRewardPoint(){
        return RewardPoint;
    } //getter
}
