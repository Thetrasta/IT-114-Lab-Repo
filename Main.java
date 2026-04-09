import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); 
        System.out.println("State your Name: "); 
        String name = scan.nextLine(); 
        System.out.println("State your Initial Deposit"); 
        double initialDeposit = scan.nextDouble(); 
        scan.nextLine(); 
        System.out.println("Would like to open a Checking or Savings? (Enter 'Checking' or 'Savings')"); 
        String AccountType = scan.nextLine(); BankAccount NewAccount; 
        if (AccountType.equals("Checking")){ 
            NewAccount = new CheckingAccount(name, initialDeposit); 
        } else { NewAccount = new SavingsAccount(name, initialDeposit); 

        } 

        System.out.println("Welcome to Da Cunha Banking! What would you like to do? Press the number that corresponds to your desired option!"); 
        int option = 0; while (option != 4) { 
            System.out.println("1. Deposit"); 
            System.out.println("2. Withdraw"); 
            System.out.println("3. Check Balance"); 
            System.out.println("4. Exit"); 
            option = scan.nextInt(); 
            if (option == 1)
                { System.out.println("How much would you like to deposit?: "); 
            NewAccount.deposit(scan.nextDouble()); 
        } else if (option == 2) {
        System.out.println("How much would you like to withdraw?: "); 
        NewAccount.withdraw(scan.nextDouble()); 
        } else if (option == 3) { 
            System.out.println("Here's your balance! "); 
            System.out.println(NewAccount.getBalance()); 
        } else if (option == 4){
            System.out.println("Goodbye."); 
            break; 
        } else { 
            System.out.println("Error: No Number Inputted."); 
        } 
    } 
} 

}