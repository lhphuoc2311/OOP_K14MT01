/*
*  created date: Jan 10, 2022
*  author: cgm
*/
package oo;

public class AccountTestDrive {

    public static void main(String[] args) {
        Account account;
        account = new Account();

        account.show();
        account.deposit(500);
        account.show();

        account.withdraw(400);
        account.show();
    }
    
}
