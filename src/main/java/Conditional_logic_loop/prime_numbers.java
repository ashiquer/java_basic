//7. Write a program to print prime numbers from 2 to n

package Conditional_logic_loop;

import java.util.Scanner;

public class prime_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the last number until which you want to print prime numbers: ");
        int n = scanner.nextInt();

        System.out.println("\nThe prime numbers are: ");
        int j = 2;
        while (j <= n) {
            int i = 1, counter = 0;
            while (i <= j) {
                if (j % i == 0) {
                    counter++;
                }
                i++;
            }
            if (counter == 2) {
                System.out.print(j + " ");
            }
            j++;
        }
        System.out.println();
    }
}
