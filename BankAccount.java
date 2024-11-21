import java.util.Random;

public class BankAccount {
    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;
    private static int accounts;
    private static double totalMoney; // refers to the sum of all bank account checking and savings balances
    private long accountNumber;
    // CONSTRUCTOR
    // Be sure to increment the number of accounts
    public BankAccount(){
        this.checkingBalance=0.0;
        this.savingsBalance=0.0;
        accounts++;
        totalMoney=(checkingBalance + savingsBalance);
        this.accountNumber+=generateRandomAccountNumber();
    }
    // Static Test (print the number of bank accounts and the totalMoney)
    public static int getAccounts() {
        return accounts;
    }
    public static double getTotalMoney(){
        return totalMoney;
    }

    // GETTERS
    // for checking, savings, accounts, and totalMoney
    public double getCheckingBalance() {
        return checkingBalance;
    }
    public double getSavingsBalance() {
        return savingsBalance;
    }
    public static int getAccounts(int account) {
        return accounts;
    }
    public static double getTotalMoney(double total) {
        return totalMoney;
    }
    public long getAccountNumber() {
        return accountNumber;
    }
    // METHODS
    // deposit
    // - users should be able to deposit money into their checking or savings account
    public void depositMoney(String accountType, double amount) {
        if (amount>0) {
            if (accountType.equalsIgnoreCase("checking")) {
                checkingBalance+=amount;
                totalMoney+=amount;
              //  System.out.println("Deposited $" + amount + " into cheching account.");
             //   System.out.println("Total balance: $" + totalMoney);
            }
            else if (accountType.equalsIgnoreCase("savings")) {
                savingsBalance+=amount;
                totalMoney+=amount;
               // System.out.println("Deposited $" + amount + " into savings account");
              //  System.out.println("Total balance: $" + totalMoney);
            }
            else {
                System.out.println("Invalid account type. Please choose 'checking' or 'savings' account.");
                }
            }
        else {
            System.out.println("Deposit amount must be greater than zero.");
        }
    }
    // withdraw 
    // - users should be able to withdraw money from their checking or savings account
    // - do not allow them to withdraw money if there are insufficient funds
    // - all deposits and withdrawals should affect totalMoney
    public void withdrawMoney(String accountType, double amount) {
        if (accountType.equalsIgnoreCase("checking")) {
            if(amount<=checkingBalance) {
                checkingBalance-=amount;
                totalMoney-=amount;
            }
            else {
                System.out.println("Insufficient funds in checking account for withdrawal.");
            }
        }
        else if (accountType.equalsIgnoreCase("savings")){
            if(amount<=savingsBalance) {
                savingsBalance-=amount;
                totalMoney-=amount;
            }
            else {
                System.out.println("Insufficient funds in savings account for withdrawal.");
            }
        }
        else {
            System.out.println("Invalid account type. Please choose 'checking' or 'savings' account.");
        }
    }
    private long generateRandomAccountNumber() {
        Random rand = new Random();
        long accountNumberLong = 1000000000L + (long) (rand.nextDouble()*8999999999L);
        return accountNumberLong;
    }
    // getBalance
    // - display total balance for checking and savings of a particular bank account
    public double getBalance() {
        double totalBalance= savingsBalance + checkingBalance;
        System.out.println("Checking balance: $" + checkingBalance);
        System.out.println("Saving Balance: $" + savingsBalance);
        System.out.println("Total balance: $" + totalBalance);
        return totalBalance;
    }
}
