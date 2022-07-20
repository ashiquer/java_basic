//9. Write a program to sum of user input until users input ‘q’ from keyboard
package Conditional_logic_loop;
import java.util.Scanner;

public class users_input {
    public static void main(String[] args) {

        int i;
        double num;
        double sum = 0;
        char choice;

        Scanner scanner = new Scanner(System.in);


        for (i = 1; i >= 1; i++) {

            System.out.println("Enter a number:" + " ");

            num = scanner.nextDouble();
            sum += num;
            i++;

            System.out.println("Do you want to exit? press q || For Continue press c");
            choice = scanner.next().charAt(0);
            if (choice == 'q') {
                break;
            } else if (choice == 'c') {
                continue;

            }
            scanner.close();
        }

        System.out.println("Sum of users" + " " + sum);

    }
}