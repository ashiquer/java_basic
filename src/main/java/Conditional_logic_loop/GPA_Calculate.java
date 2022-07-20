//2. Write a program to calculate GPA and find grade

package Conditional_logic_loop;
import java.text.DecimalFormat;
import java.util.Scanner;
public class GPA_Calculate {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int totalPoints = 0;
        int totalCredits = 0;

        boolean moreClasses;

        do {

            var credits = 0;
            boolean validCredits;
            do {
                validCredits = true;

                System.out.println("Enter number of credits:");
                String creditsString = scanner.nextLine();

                try {
                    credits = Integer.parseInt(creditsString);
                }
                catch (NumberFormatException nfe){
                    System.out.println("Please enter a valid integer");
                    validCredits = false;
                }
            }
            while (!validCredits);



            boolean validGrade;

            int gradeValue = 0;
            String grade;
            do {
                validGrade = true;

                System.out.println("Enter grade:");
                grade = scanner.nextLine();

                if (grade.equalsIgnoreCase("A")) {
                    gradeValue = 4;
                } else if (grade.equalsIgnoreCase("B")) {
                    gradeValue = 3;
                } else if (grade.equalsIgnoreCase("C")) {
                    gradeValue = 2;
                } else if (grade.equalsIgnoreCase("D")) {
                    gradeValue = 1;
                } else {
                    if (!grade.equalsIgnoreCase("F")) {
                        System.out.println("You didn't enter a valid grade :(");
                        validGrade = false;
                    }
                }
            }
            while (!validGrade);


            int points = gradeValue * credits;

            totalPoints += points;
            totalCredits += credits;

            System.out.println("Would you like to enter another class? (Y/N)");
            String moreClassesString = scanner.nextLine();

            moreClasses = moreClassesString.equalsIgnoreCase("Y");

        }
        while (moreClasses);


        DecimalFormat df = new DecimalFormat("0.00");

        Double gpa = (double) totalPoints / (double) totalCredits;


        System.out.println("Credits: " + totalCredits);
        System.out.println("Points: " + totalPoints);
        System.out.println("GPA: " + df.format(gpa));


        scanner.close();
    }

}
