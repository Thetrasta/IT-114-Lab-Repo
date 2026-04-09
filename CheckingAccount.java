public class CheckingAccount extends BankAccount {
    // DO NOT CHANGE ANY VARIABLE, METHOD, OR CLASS NAMES. THE AUTOGRADER DEPENDS ON THEM.
    private final double OVERDRAFT_FEE = 35.00;

    public CheckingAccount(String accountHolder, double initialDeposit) {
        super(accountHolder, initialDeposit);
        // TODO: Call the parent constructor using 'super'
    }

    public String withdraw(double amount){

        // TODO: Implement Checking withdrawal logic
        if (amount <= getBalance()){
            setBalance(getBalance() - amount);
            return "Withdraw success! New balance is: $" + getBalance();
        } else {
            setBalance(getBalance() - amount - OVERDRAFT_FEE);
            return "Attention: Overdraft! $35 fee applied. New balance is: $" + getBalance();
        }
    
        
    }
}