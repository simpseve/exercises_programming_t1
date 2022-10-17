package Wk3.Bank;


public class GoldAccount implements BankAccount {

    private String accountNumber;
    private float balance;
    private float min;

    public GoldAccount(String accountNumber, float balance, float min){
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.min=min;
    }
    @Override
    public void setAccountNumber(String accountNumber) {
        this.accountNumber=accountNumber;
    }

    @Override
    public void setBalance(float balance) {
        this.balance=balance;
    }

    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public float getBalance() {
        return balance;
    }

    @Override
    public void deposit(float amount) {
        balance = balance + amount;
    }

    @Override
    public boolean withdraw(float amount) {
        if(amount > balance){
            return false;
        }else if(balance-amount<min){
            return false;
        }
        balance = balance - amount;
        return true;
    }
}
