//8. Write a program to generate 2 random numbers which will not be shown to the user. Take a user input and match it with any of the random numbers. If correct give it 1 point and if incorrect, do not give it any point. Finally, repeat this for 10 times and count the point user achieved.

package Conditional_logic_loop;

import java.util.Scanner;

public class random_numbers {
    public static void main(String[] args) {
        System.out.println("Welcome to number guessing game");

        try {
            int userGuessNumber, count = 0;
            int randomNumberOne = (int)(Math.random() * 4 + 1);
            int randomNumberTwo = (int)(Math.random() * 9 + 1);

            System.out.println("Enter your favorite number between 1 to 50" + " " + "You have 50 chances at a time");

            System.out.println("Enter your number");
            Scanner scanner = new Scanner(System.in);

            for (int i = 1; i <= 50; i++) {
                if (scanner.hasNextInt()) {
                    userGuessNumber = scanner.nextInt();
                    if (userGuessNumber == randomNumberOne || userGuessNumber == randomNumberTwo) {
                        count += 1;
                        System.out.println("you get one point");
                        //                    break;
                    } else if (userGuessNumber < randomNumberOne || userGuessNumber < randomNumberTwo) {
                        System.out.println("your guess number is low");
                        //                    break;
                    } else {
                        System.out.println("your guess number is high");
                        //                    break;
                    }
                    if (i == 10) {
                        System.out.println("You have exceeded the maximum attempt try again later");
                        break;
                    }
                } else {
                    System.out.println("Enter a valid integer number");
                    break;
                }

            }
            System.out.println("Your get" + " " + count + " " + "points");

            scanner.close();
        } catch (Exception e) {
            System.out.println("Enter valid numbers");
        }

    }
}
