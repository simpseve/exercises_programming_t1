package wk2.bankinterface;

public class BasicAccount implements BankAccount{
    private String accountNumber;
    private float balance;

    public BasicAccount(String accountNumber,float balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
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
        if(balance>amount){
            balance = balance - amount;
            return true;
        }
        return false;
    }


}
