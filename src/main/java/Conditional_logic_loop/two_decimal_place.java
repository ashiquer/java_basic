//3. Input 2 decimal numbers and check if they are both same or different up to two decimal places. E.g 120.546 & 120.241?

package Conditional_logic_loop;

import java.util.Scanner;

public class two_decimal_place {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Input floating number: ");
        double x = in.nextDouble();
        System.out.print("Input floating another number: ");
        double y = in.nextDouble();

        x = Math.round(x * 1000);
        x = x / 1000;

        y = Math.round(y * 1000);
        y = y / 1000;

        if (x == y)
        {
            System.out.println("They are the same up to three decimal places");
        }
        else
        {
            System.out.println("They are different");
        }
    }
}

