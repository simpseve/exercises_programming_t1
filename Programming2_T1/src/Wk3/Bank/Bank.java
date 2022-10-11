package Wk3.Bank;


import java.util.*;

public class Bank {

    BankAccount[] accounts = new BankAccount[5];
    List<BankAccount> accountsList = new ArrayList<>();

    public void populate(){
        BankAccount account1 = new BasicAccount("DA",1000);
        BankAccount account2 = new GoldAccount("Db",2000,200);

        accounts[0] = account1;
        accounts[1] = account2;

        //automatically decending
        Arrays.sort(accounts);
        Arrays.sort(accounts, Collections.reverseOrder());

        accountsList.add(account1);
        accountsList.add(account2);

        //without comparitor
        Collections.sort(accountsList, Collections.reverseOrder());


    }

    public static void main(String[] args) {

    }
}

