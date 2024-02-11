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
// sets balance as a static value to keep it consistent and able to be updated
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NumberFormat formatter = new DecimalFormat("$#0.00");
//sets number format to provide acurate decimal numbers to user (balance can have decimals)
        System.out.println("Welcome to the ATM, what is your name?");
        String name = input.nextLine();
// inputs users name
        System.out.println("It is nice to meet you " + name + " what would you like to do today:");
        System.out.println("D eposit" + "\n" + "W ithdraw" + "\n" + "B alance" + "\n" + "E xit");
        String user_choice = input.nextLine();
//gives user various options
        while (!user_choice.equals("E")) {
//will continue as long as choice does not equal e 
            if (user_choice.equals("D")) {
                System.out.println("How much would you like to deposit: ");
                double deposit_amt = input.nextDouble();
                input.nextLine();
                Balance += deposit_amt; // will keep orihginal balance amount and just add user input
                System.out.println("Your new balance is: " + formatter.format(Balance)); //balance will be formatted with decimals
//will add whatever deposited value to Balance
            }

            else if(user_choice.equals("W")) {
                System.out.println("How much would you like to withdraw: ");
                double withdraw_amt = input.nextDouble();
                input.nextLine();
                Balance -= withdraw_amt;
                System.out.println("Your new balance is: " + formatter.format(Balance));
// will withdraw whatever value user inpouts
                //Just cant be negative
                while (withdraw_amt < 0){
                    System.out.println("Error! Insufficent Funds!");
                    System.out.println("Please enter a valid amount: ");
                    withdraw_amt = input.nextDouble();
                    //error checking to make sure user withdraws correct amount

                }
            }

            else if (user_choice.equals("B")){
                System.out.println("Here is your current Balance: ");
                System.out.println(formatter.format(Balance));
                //will print balance on users command
            }

            System.out.println("What would you like to do now?");
            System.out.println("D eposit" + "\n" + "W ithdraw" + "\n" + "B alance" + "\n" + "E xit");
            user_choice = input.nextLine();
            //after usermakes choice, they can do something else unless they hit E
        }
        if(user_choice.equals("E")){
            System.out.println("Thanks for using the ATM!");
            System.out.println("How would you like your receipt: (P rinted or E mailed) ");
            String receipt_choice = input.nextLine();
//allows user to choose how they want receipt
            
            if (receipt_choice.equals("E")) {
                System.out.println("Please remember to check your email");
                System.out.println("Have a great day!");

            }
            else if(receipt_choice.equals("P")){
                System.out.println("*Printing...*");
                System.out.println("Thanks for using the ATM! Have a great day!");
            }

        }

    }

}

