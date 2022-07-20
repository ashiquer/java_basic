//5. Write a program that will count how many vowels in the given string:
//        "roadtosdet"
//        Output: 4

package String_Manipulation;

import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
        System.out.println(" Input field to check vowel: ");
        int count = 0;
        System.out.println("Enter your word: ");
        Scanner input = new Scanner(System.in);
        String words = input.nextLine();
        int i = 0;
        while (i < words.length()) {
            char ch = words.charAt(i);
            if (ch == 'a'|| ch == 'e'|| ch == 'i' || ch == 'o' || ch == 'u'|| ch == ' ') {
                count++;
            }
            i++;
        }
        System.out.println(count);
        input.close();
    }
}