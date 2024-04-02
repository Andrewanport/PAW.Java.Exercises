/*
        ----------------------------------- Exercise 3 -----------------------------------------------------------------

        Read 2 String type values and convert to double precision floating point values A and B, which correspond to 2 grades of a student.
        Next, calculate the student's average. Assume that each grade can range from 0 to 10.0, always with one decimal place.InputThe input file contains 2 values of type String.
        OutputPrint the message "MEDIA" and the student's average, with 2 digits after the decimal point and with a blank space before and after the equality.
        Use double precision variables.

        ----------------------------------------------------------------------------------------------------------------
*/

package A1;

import java.util.Scanner;

public class A003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first grade
        System.out.println("Enter the first grade:");
        String grade1Str = scanner.next();

        // Prompt the user to enter the second grade
        System.out.println("Enter the second grade:");
        String grade2Str = scanner.next();

        // Convert the strings to double-precision floating-point values
        double grade1 = Double.parseDouble(grade1Str);
        double grade2 = Double.parseDouble(grade2Str);

        // Calculate the student's average grade
        double average = (grade1 + grade2) / 2;

        // Print the formatted result
        System.out.printf("Average = %.2f", average);

        scanner.close();
    }
}
