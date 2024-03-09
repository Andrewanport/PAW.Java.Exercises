/*
        ----------------------------------- Exercise 1 -----------------------------------

        Write an algorithm to get a number (integer) from the user, calculate and display the sum of all numbers between 1 and that number.
        If the user enters a value less than or equal to zero, an error message must be reported.

        (It's like an arithmetic progression with 1 of range)

        ----------------------------------------------------------------------------------
*/

package A2;

import java.util.Scanner;

public class E001 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Select a limit: ");
        int N1 = scanner.nextInt();
        int S = 0;

        if (N1 <= 0) {
            System.out.println("Select a valid value");
        } else {
            for (int i = 1; i <= N1; i++) {
                S += i;
            }
            System.out.println("The sum is: " + S);
        }

    }
}
