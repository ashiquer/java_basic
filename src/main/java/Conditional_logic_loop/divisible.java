//5. Write a program to sum of numbers which only divisible by 5 from 1 to 100

package Conditional_logic_loop;

public class divisible {
    public static void main(String[] args) {
        System.out.println("Sum of divisible by five program");

        int sum = 0, num = 100, i;

        for (i = 1; i <= num; i++) {
            if (i % 5 == 0) {
                sum += i;
                System.out.println("five divided number is:" + " " + i);
            }

        }
        System.out.println("sum of total numbers which divisible by five is:" + " " + sum);

    }
}