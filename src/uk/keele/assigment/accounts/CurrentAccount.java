package uk.keele.assigment.accounts;

import uk.keele.assigment.root.Account;
import uk.keele.assigment.root.AccountBehaviour;

/**
 * Cari Hesap
 */
public class CurrentAccount {


    private float balance;
    private float interestRate = (float) 0.0007;


    public CurrentAccount(float balance) {
        this.balance = balance;
    }

    public CurrentAccount() {
    }


    /**
     * This method should take no arguments and return the balance. It is required because balance
     * will not be accessible directly.
     * @return this float is in pounds
     */
    public float getBalance(){
        return balance;
    }

    /**
     * This method should take the amount to be deposited to the account as an argument and add
     * that to the balance.
     */
    public void addInterest() {
        balance += interestRate * balance;
    }

    /**
     * This method should take the amount to be deposited to the account as an argument and add
     * that to the balance
     *
     * @param amount an argument and add that to the balance.
     */
    public void makeDeposit(float amount) {
        balance += amount;
    }




}
