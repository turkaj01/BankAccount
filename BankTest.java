public class BankTest {
    public static void main(String[] args){
        // Create 3 bank accounts
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        BankAccount account3 = new BankAccount();
        // Deposit Test
        // - deposit some money into each bank account's checking or savings account and display the balance each time
        // - each deposit should increase the amount of totalMoney
        account1.depositMoney("Savings", 1000);
        account1.depositMoney("checking", 400);
        System.out.println("Account 1: ");
        account1.getBalance();
        System.out.println("Account 2: ");
        account2.depositMoney("savings", 2000);
        account2.depositMoney("checking", 200);
        account2.getBalance();
        System.out.println("Account 3: ");
        account3.depositMoney("savings", 20000);
        account3.depositMoney("checking", 300);
        account3.getBalance();
        // Withdrawal Test
        // - withdraw some money from each bank account's checking or savings account and display the remaining balance
        // - each withdrawal should decrease the amount of totalMoney
        System.out.println("Account 1: ");
        account1.withdrawMoney("savings", 500);
        account1.withdrawMoney("checking", 100);
        account1.getBalance();
        System.out.println("Account 2: ");
        account2.withdrawMoney("savings", 1000);
        account2.withdrawMoney("checking", 50);
        account2.getBalance();
        System.out.println("Account 3: ");
        account3.withdrawMoney("savings", 5000);
        account3.withdrawMoney("checking", 70);
        account3.getBalance();
        System.out.println();

        // Static Test (print the number of bank accounts and the totalMoney)
        System.out.println("Total bank accounts: " + BankAccount.getAccounts());
        System.out.println("Total amount: " + BankAccount.getTotalMoney());

        //Ninja Bonus 1: Add the following class attribute: account number.
        //The type is up to you, can be a String or a Long or another type.
        System.out.println("Account 1 Number: Account" + account1.getAccountNumber());
        System.out.println("Account 2 Number: Account" + account2.getAccountNumber());
        System.out.println("Account 3 Number: Account" + account2.getAccountNumber());

    }
    
    
}
