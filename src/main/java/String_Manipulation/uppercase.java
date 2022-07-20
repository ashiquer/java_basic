//8. Write a program to convert each 1st char to uppercase from a string
//Input: rahim lives in sylhet
//Output: Rahim Lives in Sylhet

package String_Manipulation;

import java.util.Scanner;
public class uppercase {
    public static void main(String[] args) {
        String upper_case_line = "";
        String str = "rahim lives in sylhet";
        Scanner lineScan = new Scanner(str);
        while(lineScan.hasNext()) {
            String word = lineScan.next();
            upper_case_line += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
        }
        System.out.println(upper_case_line);
    }
}