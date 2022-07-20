//6. Write  a program to find the factorial of a given number

package Conditional_logic_loop;
import java.util.*;

public class factorial {
    public static void main(String[] args) {
        int num;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter an Integer: ");
        num = in.nextInt();
        int factorial = getfactorial(num);

        System.out.println("!" + num + " = " + factorial);
    }
    public static int getfactorial(int num) {
        if (num <= 1)
            return 1;
        return num * getfactorial(num-1);
    }
}