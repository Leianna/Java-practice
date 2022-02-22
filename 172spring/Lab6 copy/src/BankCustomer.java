/*
    calculate the amount in each account
 */

public class BankCustomer {

    //properties
    private int AccountNum;
    public String firstName;
    public String lastName;
    bankAccount checking = new bankAccount(0);
    bankAccount saving = new bankAccount(0);


    /**
     * account information
     * @param firstName - first name of the customer
     * @param lastName - last name of the customer
     * @param account - customer account number
     */
    public BankCustomer(String firstName, String lastName, int account){
        this.firstName=firstName;
        this.lastName=lastName;
        this.AccountNum = account;
    }


    /**
     * deposit money in saving or checking by call bankAccount class with deposit methods
     * @param account - checking or saving
     * @param amount - amount to withdraw
     */
    public void deposit(String account, double amount){
        if (account == "savings"){
            saving.deposit(amount);
        }
        else if (account == "checking"){
            checking.deposit(amount);
        }
    }

    /**
     * withdraw money in saving or checking by call bankAccount class with withdraw methods
     * @param account - checking or saving
     * @param amount - amount to withdraw
     * @return true if it can be withdraw, false if it can not
     */
    public boolean withdraw(String account, double amount){
        if (account == "savings") {
            return saving.withdraw(amount);
        }
        else{
            return checking.withdraw(amount);
        }
    }

    /**
     * transfer amount from account1 to another2 account
     * @param account1 - account that takes money out
     * @param account2 - account that deposit money
     * @param amount - amount to transfer
     */
    public void transfer(String account1, String account2, double amount){
        if (account1 == "savings" && account2 == "checking"){
            withdraw("checking",amount);
            deposit("savings",amount);
        }
        else{
            withdraw("savings",amount);
            deposit("checking",amount);
        }
    }


    /**
     * get the balance from checking account or saving account
     * @param account - checking or saving
     * @return
     */
    public double getBalance(String account){
        if (account == "savings"){
            return saving.getBalance();
        }
        else{
            return checking.getBalance();
        }

    }

    /**
     * get the account information
     * @return getters
     */

    public int getAccountNumber() {
        return AccountNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}