public class Bank {
    private double balance;


    // Creating constructor to initialize the bank account with an initial balance.

    public Bank(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
            System.out.println("Initial balance of bank account cannot be negative...");
        }
    }


     // This method is used for gets the current balance of the account.

    public double getBalance() {
        return balance;
    }

    // Deposits a specified amount into the account if the amount is positive.
    //Return true if deposit is successful, ele false

    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }


    // Withdraws a specified amount from the account if there is sufficient balance.
    // Return true if withdrawal is successful, else false

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
