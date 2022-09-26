package wk2;

public class Bank {
    public static void main(String[] args) {
        BasicAccount account1 = new BasicAccount("DA1",10000);
        GoldAccount account2 = new GoldAccount("DA2",10000,0);

        System.out.println(account1.withdraw(805));
        System.out.println(account2.withdraw(30000000));

        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());
    }
}
