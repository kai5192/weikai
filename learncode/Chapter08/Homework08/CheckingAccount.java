package learncode.Chapter08.Homework08;

public class CheckingAccount extends BankAccount{
    private double interest;//手续费

    public CheckingAccount(int balance, double interest) {
        super(balance);
        this.interest = interest;
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount - interest);
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount+interest);
    }
}
