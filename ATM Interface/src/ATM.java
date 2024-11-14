import java.util.Scanner;

public class ATM {
    private final Bank account;

    // Constructor to initialize the ATM with a connected BankAccount
    public ATM(Bank account) {
        this.account = account;
    }

    // Starts the ATM interface, allowing users to choose options and perform actions
    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Display ATM menu
            System.out.println("\n--- ATM ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            // Handle user selection
            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    System.out.print("Enter amount to deposit in your account: ");
                    double depositAmount = scanner.nextDouble();
                    deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw from your account: ");
                    double withdrawAmount = scanner.nextDouble();
                    withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM...");
                    scanner.close();
                    return; // Exit the loop and program
                default:
                    System.out.println("Invalid option...\nPlease choose a correct option.");
            }
        }
    }

    // Displays the current balance of the account
    public void checkBalance() {
        System.out.printf("Current Balance of your account is\n%.2f Rupees\n", account.getBalance());
    }

    // Deposits the specified amount into the account and displays the new balance
    // If the deposit amount is invalid, displays a message
    public void deposit(double amount) {
        if (account.deposit(amount)) {
            System.out.printf("Deposit successful...\nNew Balance\n%.2f Rupees\n", account.getBalance());
        } else {
            System.out.println("Invalid amount...\nPlease enter a valid amount.");
        }
    }

    // Withdraws the specified amount from the account if there is sufficient balance
    // Displays a message based on whether the withdrawal was successful or failed
    public void withdraw(double amount) {
        if (account.withdraw(amount)) {
            System.out.printf("Withdrawal successful...\nNew Balance\n%.2f Rupees\n", account.getBalance());
        } else {
            if (amount <= 0) {
                System.out.println("Withdrawal amount must be positive.");
            } else {
                System.out.printf("Insufficient balance...\nAvailable Balance of your account\n%.2f Rupees\n", account.getBalance());
            }
        }
    }
}
