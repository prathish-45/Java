class Bank {
    // Data members
    String customerName;
    int accountNumber;
    double balance;

    // Default constructor
    public Bank() {
        customerName = "Unknown";
        accountNumber = 0;
        balance = 0.0;
    }

    // Parameterized constructor
    public Bank(String name, int accNumber, double initialBalance) {
        customerName = name;
        accountNumber = accNumber;
        balance = initialBalance;
    }

    // Method to deposit an amount
    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. New balance: " + balance);
    }

    // Method to withdraw an amount
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        // Calling the parameterized constructor
        Bank myAccount = new Bank("John Doe", 12345, 1000.0);

        // Displaying account details
        myAccount.displayAccountDetails();

        // Depositing an amount
        myAccount.deposit(500.0);

        // Withdrawing an amount
        myAccount.withdraw(300.0);

        // Displaying account details after transactions
        myAccount.displayAccountDetails();
    }
}
