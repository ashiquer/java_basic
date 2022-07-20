package Function_Array;

import java.util.Scanner;

public class User_Pass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username, password;
        System.out.println("Enter your username: ");
        username = input.nextLine();
        System.out.println("Enter your password: ");
        password = input.nextLine();

        if(username.equals("admin") && (password.equals("adm1n"))){
            System.out.println("welcome. ");
        }else{
            System.out.println("Your user has been temporary locked");
        }

    }

}
