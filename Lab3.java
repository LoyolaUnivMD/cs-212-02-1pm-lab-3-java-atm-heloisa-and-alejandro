// Programmers:  [your names here]
// Course:  CS 212
// Due Date:
// Lab Assignment:
// Problem Statement:
// Data In:
// Data Out:
// Credits: [Is your code based on an example in the book, in class, or something else?
//            Reminder: you should never take code from the Internet or another person

import java.util.Scanner;

class Lab3 {

    static double Balance = 212.90;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the ATM, what is your name?");
        String name = input.nextLine();

        System.out.println("It is nice to meet you " + name + " what would you like to do today:");
        System.out.println("D eposit" + "\n" + "W ithdraw" + "\n" + "B alance" + "\n" + "E xit");
        String user_choice = input.nextLine();

        while (!user_choice.equals("E")) {

            if (user_choice.equals("D")) {
                System.out.println("How much would you like to deposit: ");
                Double deposit_amt = input.nextDouble();
                Balance += deposit_amt;
                System.out.println(Balance);

            }
            else if(user_choice.equals("W")) {
                System.out.println("How much would you like to withdraw: ");
                Double withdraw_amt = input.nextDouble();
                //Just cant be negative
                //while (withdraw_amt > Balance){
                    //System.out.println("Error! Insufficent Funds!");
                    //System.out.println("Please enter a valid amount: ");
                    //withdraw_amt = input.nextDouble();

                //}
                //if (withdraw_amt <= Balance){
                   // Balance -= withdraw_amt;
                    //System.out.println(Balance);
                //}

            }
            else if (user_choice.equals("B")){
                System.out.println("Here is your current Balance: ");
                System.out.println(Balance);
            }

            System.out.println("What would you like to do now?");
            System.out.println("D eposit" + "\n" + "W ithdraw" + "\n" +
                    "B alance" + "\n" + "E xit");
            user_choice = input.nextLine();
        }
        if(user_choice.equals("E")){
            System.out.println("Thanks for using the ATM!");
            System.out.println("How would you like your receipt: (printed or emailed) ");


        }

    }
}
