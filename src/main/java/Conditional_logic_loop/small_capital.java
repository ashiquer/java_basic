//Question: 1. Write a program to check if inputted letter is small or capital?
package Conditional_logic_loop;

import java.util.Scanner;

public class small_capital {
    public static void main(String[] args) {
        char character;
        System.out.println("Enter your letter.");
        Scanner scan=new Scanner(System.in);
        character= scan.next().charAt(0);

        if (character>='A' && character<='Z'){
            System.out.println(character+" is an upper case letter ");
        } else if (character>='a' && character<='z') {
            System.out.println(character+"is a lower case letter");
        }
        else {
            System.out.println(character+"not an alphabet");
        }
    }
}
