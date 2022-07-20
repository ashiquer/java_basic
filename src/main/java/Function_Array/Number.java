package Function_Array;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        System.out.println("Enter 5 numbers: ");
        Scanner sc = new Scanner(System.in);
        int i;
        int [] a = new int[5];

        for (i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        Number m = new Number();
        System.out.println("Even number ="+ countEvenNumbers(a));
        System.out.println("Odd number ="+ countOddNumbers(a));
        System.out.println("Average of a number ="+m.Average(a));
    }

    private int Average(int[] a) {
        int i;
        int average;
        int sum=0;


        i = 0;
        while (i < 5) {
            sum= sum+ a[i];
            i++;
        }
        average = sum/5;
        return average;

    }

    public static int countEvenNumbers(int[] array) {
        int evenNumberCount = 0;
        for (int values :
                array) {
            if (values % 2 == 0) {
                evenNumberCount += 1;
            }

        }
        return evenNumberCount;
    }

    public static int countOddNumbers(int[] array) {
        int oddNumberCount = 0;
        for (int values :
                array) {
            if (values % 2 == 1) {
                oddNumberCount += 1;
            }

        }
        return oddNumberCount;
    }
}
