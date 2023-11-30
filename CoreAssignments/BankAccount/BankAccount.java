public class BankAccount {
    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;

    private static int accounts;
    private static double totalMoney; // refers to the sum of all bank account checking and savings balances

    // CONSTRUCTOR
    public BankAccount(){
        BankAccount.accounts++;
    }

    public BankAccount(double checkingBalance, double savingsBalance){
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        BankAccount.accounts++;
        BankAccount.totalMoney += checkingBalance + savingsBalance;
    }

    // GETTERS
    public double getCheckingBalance(){
        return this.checkingBalance;
    }

    public double getSavingsBalance(){
        return this.savingsBalance;
    }

    public static int getAccounts(){
        return BankAccount.accounts;
    }

    public static double getTotalMoney(){
        return BankAccount.totalMoney;
    }

    // METHODS
    // deposit
    public void depositChecking(double amount){
        this.checkingBalance += amount;
        System.out.println("New Checking Balance: " + checkingBalance);
    }

    public void depositSavings(double amount){
        this.savingsBalance += amount;
        System.out.println("New Savings Balance: " + savingsBalance);
    }
    // withdraw 
    public void withdrawChecking(double amount){
        if(amount <= checkingBalance){
            this.checkingBalance -= amount;
            System.out.println("New Checking Balance: " + checkingBalance);
        } else {
            System.out.println("Can't withdraw " + amount + " from a checkings balance of: " + checkingBalance);
        }
    }

    public void withdrawSavings(double amount){
        if(amount <= savingsBalance){
        this.savingsBalance -= amount;
        System.out.println("New Savings Balance: " + savingsBalance);
        } else {
            System.out.println("Can't withdraw " + amount + " from a savings balance of: " + savingsBalance);
        }
    }
    // - all deposits and withdrawals should affect totalMoney

    // getBalance
    // public void balanceChecking(){
    //     return BankAccount.checkingBalance;
    // }

    // public void balanceSavings(){
    //     return BankAccount.savingsBalance;
    // }
    // - display total balance for checking and savings of a particular bank account
}
