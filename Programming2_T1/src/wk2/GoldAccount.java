package wk2;

public class GoldAccount extends BasicAccount{
    private float minAmount;

    public GoldAccount(String accountNumber, float balance, float minAmount) {
        super(accountNumber, balance);
        this.minAmount = minAmount;
    }

    public boolean withdraw(float amount){
        if(getBalance() - amount < minAmount){
            return false;
        }
        return super.withdraw(amount);
    }
}
