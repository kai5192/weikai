package learncode.Chapter08.Homework08;

public class Test {
    public static void main(String[] args) {
        //Test1
        System.out.println("----------测试一------------");
        BankAccount bankAccount = new BankAccount(500);
        bankAccount.deposit(100);
        System.out.println(bankAccount.getBalance());
        System.out.println("----------测试二------------");
        CheckingAccount checkingAccount = new CheckingAccount(500, 1);
        checkingAccount.deposit(200);
        checkingAccount.withdraw(100);
        System.out.println(checkingAccount.getBalance());
        System.out.println("----------测试三------------");
        SavingsAccount savingsAccount = new SavingsAccount(500);
        savingsAccount.deposit(100);
        savingsAccount.deposit(100);
        savingsAccount.deposit(100);
        savingsAccount.deposit(100);
        savingsAccount.withdraw(100);
        System.out.println(savingsAccount.getBalance());
        savingsAccount.earnMonthlyInterest(0.01);
        System.out.println(savingsAccount.getBalance());
    }
}
