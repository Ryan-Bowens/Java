public class BankTest {
    public static void main(String[] args){
        BankAccount bank1 = new BankAccount(100, 500);
        BankAccount bank2 = new BankAccount(500, 5000);
        BankAccount bank3 = new BankAccount(20, 100);

        // Deposit Test
        // - deposit some money into each bank account's checking or savings account and display the balance each time
        // - each deposit should increase the amount of totalMoney

        // Withdrawal Test
        // - withdraw some money from each bank account's checking or savings account and display the remaining balance
        // - each withdrawal should decrease the amount of totalMoney

        // Static Test (print the number of bank accounts and the totalMoney)

        System.out.println(BankAccount.getAccounts());
        System.out.println(BankAccount.getTotalMoney());

        System.out.println("Bank 1");
        System.out.println("Checking: " + bank1.getCheckingBalance());
        System.out.println("Savings: " + bank1.getSavingsBalance());
        bank1.depositChecking(100);
        bank1.withdrawChecking(25);

        System.out.println("Bank 2");
        System.out.println("Checking: " + bank2.getCheckingBalance());
        System.out.println("Savings: " + bank2.getSavingsBalance());
        bank2.depositSavings(200.50);
        bank2.withdrawChecking(500);

        System.out.println("Bank 3");
        System.out.println("Checking " + bank3.getCheckingBalance());
        System.out.println("Savings: " + bank3.getSavingsBalance());
        bank3.depositChecking(120);
        bank3.withdrawChecking(200);

    }
}
