// Programmers: Heloisa and Alejandro
// Course:  CS 212
// Due Date: 2/11/24
// Lab Assignment: 2
// Problem Statement: ATM
// Data In: Deposit, Withdraw, Balance, Exit, Deposit amount, Withdraw amount
// Data Out: Balance, new balance
// Credits: In class

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;


class Lab3 {

    static double Balance = 212.90;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NumberFormat formatter = new DecimalFormat("$#0.00");

        System.out.println("Welcome to the ATM, what is your name?");
        String name = input.nextLine();

        System.out.println("It is nice to meet you " + name + " what would you like to do today:");
        System.out.println("D eposit" + "\n" + "W ithdraw" + "\n" + "B alance" + "\n" + "E xit");
        String user_choice = input.nextLine();

        while (!user_choice.equals("E")) {

            if (user_choice.equals("D")) {
                System.out.println("How much would you like to deposit: ");
                double deposit_amt = input.nextDouble();
                input.nextLine();
                Balance += deposit_amt;
                System.out.println("Your new balance is: " + formatter.format(Balance));

            }

            else if(user_choice.equals("W")) {
                System.out.println("How much would you like to withdraw: ");
                double withdraw_amt = input.nextDouble();
                input.nextLine();
                Balance -= withdraw_amt;
                System.out.println("Your new balance is: " + formatter.format(Balance));

                //Just cant be negative
                while (withdraw_amt < 0){
                    System.out.println("Error! Insufficent Funds!");
                    System.out.println("Please enter a valid amount: ");
                    withdraw_amt = input.nextDouble();

                }
            }

            else if (user_choice.equals("B")){
                System.out.println("Here is your current Balance: ");
                System.out.println(formatter.format(Balance));
            }

            System.out.println("What would you like to do now?");
            System.out.println("D eposit" + "\n" + "W ithdraw" + "\n" + "B alance" + "\n" + "E xit");
            user_choice = input.nextLine();
        }
        if(user_choice.equals("E")){
            System.out.println("Thanks for using the ATM!");
            System.out.println("How would you like your receipt: (P rinted or E mailed) ");
            String receipt_choice = input.nextLine();

            if (receipt_choice.equals("E")) {
                System.out.println("Please remember to check your email");

            }

        }

    }

}
