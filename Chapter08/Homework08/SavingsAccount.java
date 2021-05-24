package Chapter08.Homework08;
//重写存款取款方法，并设置每月的利息
public class SavingsAccount extends BankAccount{
    private int count = 3;

    public SavingsAccount(int balance) {
        super(balance);
    }

    //手续费
    public void earnMonthlyInterest(double rate){
        count = 3;
        super.setBalance(super.getBalance()*(1-rate));
    }

    //重写存款方法
    @Override
    public void deposit(double amount) {
        if(count>0) {
            super.deposit(amount);
        }else {
            super.deposit(amount-1);
        }count--;
    }

    //重写取款方法
    @Override
    public void withdraw(double amount) {
        if(count>0) {
            super.withdraw(amount);
        }else {
            super.withdraw(amount + 1);
        }count--;
    }


}
