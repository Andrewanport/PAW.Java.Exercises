/*
        ----------------------------------- Exercise 2 -----------------------------------

        Read 2 Strings and store them in variables A and B. Convert the values A and B to Integer.
        Add the integer values assigning your result to the variable X.
        Print X as per the example shown below.
        Do not present any message beyond what is being specified.InputThe input contains 2 values type String.
        OutputPrint the message "X = " (capital letter X) followed by the value of the variable X and the end of the line.

        ----------------------------------------------------------------------------------
*/

package A1;

import java.util.Scanner;

public class E002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura das duas strings
        String A = scanner.next();
        String B = scanner.next();

        // Conversão das strings para inteiros
        int numA = Integer.parseInt(A);
        int numB = Integer.parseInt(B);

        // Soma dos valores inteiros
        int X = numA + numB;

        // Impressão do resultado
        System.out.println("X = " + X);

        scanner.close();
    }
}
