package wk2.BankAbstract;

public class BasicAccount extends BankAccount {

    private String accountNumber;
    private float balance;

    public BasicAccount(String accountNumber, float balance){
        this.accountNumber = accountNumber;
        this.balance=balance;
    }

    @Override
    public boolean withdraw(float amount) {
        if (getBalance() > amount){
            setBalance(getBalance() - amount);
            return true;
        }return false;
    }


}
