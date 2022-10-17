package wk2.BankAbstract;

public class GoldAccount extends BankAccount {
    private String accountNumber;
    private float balance;
    private float min;

    public GoldAccount(String accountNumber, float balance, float min){
        this.accountNumber = accountNumber;
        this.balance=balance;
        this.min = min;
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

