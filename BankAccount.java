public abstract class BankAccount {
    // DO NOT CHANGE ANY VARIABLE, METHOD, OR CLASS NAMES. THE AUTOGRADER DEPENDS ON THEM.
    private String accountHolder;
    private double balance;
    private double initialDeposit;


    public BankAccount(String accountHolder, double initialDeposit) {
        this.accountHolder = accountHolder;
        this.initialDeposit = initialDeposit;
        this.balance = initialDeposit;
        // TODO: Initialize the instance variables
    }

    
    public void deposit(double amount) {
        if (amount > 0){
            balance += amount;
        }
        // TODO: Implement deposit logic
    }

    /**
     * Abstract method: Child classes must implement this.
     */
    public abstract String withdraw(double amount);


    
    public String getAccountHolder() {
        // TODO: Return the account holder name
        return accountHolder;
    }

    public double getBalance() {
        // TODO: Return the current balance
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
        // TODO: Set the balance
    }
}