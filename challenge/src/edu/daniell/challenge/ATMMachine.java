package edu.daniell.challenge;

public class ATMMachine {
    
    public static void main(String[] Args) {

        //variables
        int balance;
        int withdraw;
        int newBalance;

        //variables values
        balance = 2500;
        withdraw = 30100;
        
        //withdraw
        newBalance = balance - withdraw;

        //if conditions
        String result = (withdraw > 0) ? "Approved" : "Not Approved";

        //print
        System.out.println("==== ATM Machine ====");

        System.out.println("Balance: R$" + balance);
        System.out.println("Withdrawal: R$" + withdraw);
        System.out.println("Result: " + result);
        System.out.println("New Balance: R$" + newBalance);

        System.out.println("=====================");

    }

}
