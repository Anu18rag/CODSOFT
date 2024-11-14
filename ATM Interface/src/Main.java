// Main class to run the ATM interface.
// Creates a BankAccount with an initial balance and starts the ATM interface.

public class Main {
    public static void main(String[] args) {
        // Create an object of bank  with an initial balance of 500 rupees
        Bank account = new Bank(500.00);

        // Create an object of ATM to link  the bank
        ATM atm = new ATM(account);

        // Start the ATM interface, allowing the user to interact with ATM interface
        atm.start();
    }
}
