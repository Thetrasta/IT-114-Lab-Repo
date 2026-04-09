public class SavingsAccount extends BankAccount {
    // DO NOT CHANGE ANY VARIABLE, METHOD, OR CLASS NAMES. THE AUTOGRADER DEPENDS ON THEM.
    public SavingsAccount(String accountHolder, double initialDeposit) {
        super(accountHolder, initialDeposit);
        // TODO: Call the parent constructor using 'super'
    }

    @Override
    public String withdraw(double amount) {
        if (amount <= getBalance()){
            setBalance(getBalance() - amount);
            return "Withdraw success! New balance is: $" + getBalance();
        } else {
            return "Transaction Dnied! Insufficient funds. New balance is: $" + getBalance();
        }
    }
}