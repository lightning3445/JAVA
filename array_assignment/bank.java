import java.util.*;

class bank {
    String accountHolderName;
    String accountNumber;
    double[] transactions = new double[5];  // Array to store the last 5 transactions
    int transactionCount = 0;  // Keeps track of the number of transactions added

    // Parameterized constructor to initialize account holder name and account number
    bank(String name, String number) {
        accountHolderName = name;
        accountNumber = number;
    }

    // Method to add a new transaction (replace the oldest if the array is full)
    void addTransaction(double amount) {
        if (transactionCount < 5) {
            transactions[transactionCount] = amount;
            transactionCount++;
        } else {
            // Shift the transactions and add the new one at the end
            for (int i = 1; i < 5; i++) {
                transactions[i - 1] = transactions[i];
            }
            transactions[4] = amount;
        }
    }

    // Method to calculate the current account balance
    double calculateBalance() {
        double balance = 0;
        for (int i = 0; i < transactionCount; i++) {
            balance += transactions[i];
        }
        return balance;
    }

    // Method to display all transaction details and current balance
    void displayTransactionHistory() {
        System.out.println("Transaction History for Account " + accountNumber + " (" + accountHolderName + "):");
        for (int i = 0; i < transactionCount; i++) {
            System.out.println("Transaction " + (i + 1) + ": " + transactions[i]);
        }
        System.out.println("Current Balance: " + calculateBalance());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking account holder name and account number as input
        System.out.print("Enter account holder name: ");
        String name = scanner.nextLine();
        System.out.print("Enter account number: ");
        String number = scanner.nextLine();

        // Create a new bank object
        bank account = new bank(name, number);

        // Menu for adding transactions and displaying details
        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Deposit");
            System.out.println("2. Add Withdrawal");
            System.out.println("3. Display Transaction History");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.addTransaction(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    account.addTransaction(-withdrawalAmount);  // Withdrawal is negative
                    break;
                case 3:
                    account.displayTransactionHistory();
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
