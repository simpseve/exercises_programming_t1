package wk2;

public class BasicAccount {

        private String accountNumber;
        private float balance;

        public BasicAccount(String accountNumber, float balance){
                this.accountNumber = accountNumber;
                this.balance=balance;
        }

        public void setAccountNumber(String accountNumber){
                if (accountNumber ==null){
                        throw new IllegalArgumentException("Account number is null");
                }
                this.accountNumber=accountNumber;
        }
        public void setBalance(float balance){
                this.balance=balance;
        }
        public String getAccountNumber(){
                return accountNumber;
        }
        public float getBalance(){
               return this.balance;
        }

        public void deposit(float amount){
                balance = balance + amount;
        }
        public boolean withdraw(float amount){
               if (amount<= balance ){
                       balance = balance-amount;
                       return true;
               }
              return false;
        }
}
