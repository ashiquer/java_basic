//4. Write a program to check balance and withdraw money from ATM booth using if else or switch case
package Conditional_logic_loop;

import java.util.Scanner;
public class ATM_booth {

    public static Scanner in;
    public static int balance = 100000;

    public static void main(String[] args) {
        System.out.println("Welcome to our Atm_Bank, you can withdraw and balance");
        in = new Scanner(System.in);
        transaction();
    }

    public static void transaction(){
        int choice;
        System.out.println("1. Withdraw ");
        System.out.println("2. Balance");
        System.out.println ("---Please select an option: " );//input your choice
        choice = in.nextInt();


        switch (choice){
            case 1:
                int amount;
                System.out.println("Please enter an amount you would like to withdraw \n" +
                        " Note: the amount must be multiple of 500");
                amount = in.nextInt();
                if ((amount > balance || amount == 0)  ){
                    System.out.println("You have a insufficient with your funds\n\n");

                }
                else if ((amount % 500 != 0)){
                    System.out.println("You have a press worn amount \n please enter valid amount \n");

                }

                else{
                    balance = balance - amount;
                    System.out.println("You have withdrawn tk: " + amount + "\n And your current new balance is now tk: " + balance + "\n");

                }
                break;

            case 2:
                System.out.println("Your balance is tk " + balance + "\n");
                break;
        }
    }

}
