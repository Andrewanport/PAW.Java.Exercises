/*
        ----------------------------------- Exercise 5 -----------------------------------

        Write a program that receives two numbers and performs the operations listed below, according to the user's choice.

        [1] - subtraction (from largest to smallest)
        [2] - division
        [3] - multiplication
        [4] - average

        ----------------------------------------------------------------------------------
*/

package A1;

import java.util.Scanner;
public class A005 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro (1): ");
        double N1 = scanner.nextInt();

        System.out.println("Digite um número inteiro (2): ");
        double N2 = scanner.nextInt();


        System.out.println("Selecione uma operação: ");
        System.out.println("[1] Subtração");
        System.out.println("[2] Divisão");
        System.out.println("[3] Multiplicação");
        System.out.println("[4] Média");

        double R;

        int O = scanner.nextInt();

        int O = scanner.nextInt();

        switch (O){
            case 1:
                if (N1 > N2) {
                    System.out.printf("A subtração de %.2f e %.2f é = %.2f ", N1, N2, (N1 - N2) );
                }

                else if (N1 < N2) {
                    System.out.printf("A subtração de %.2f e %.2f é = %.2f ", N2, N1, (N2 - N1) );
                }

                else if (N1 == N2) { // could be just "else", i used "else if" just to be more clear about it
                    System.out.printf("A subtração de %.2f e %.2f é = %.2f ", N1, N2, (N1 - N2) );
                }
                break;

            case 2:
                if (N1 == 0){
                    System.out.printf("%.2f dividido por %.2f = %.2f", N1, N2, N1);
                }

               else if (N2 == 0){
                    System.out.printf("%.2f dividido por %.2f = [Indefinido]", N1, N2);
                }
               else {
                    System.out.printf("%.2f dividido por %.2f = %.2f", N1, N2, (N1 / N2) );
                }
                break;

            case 3:
                System.out.printf("%.2f x %.2f = %.2f", N1, N2, (N1 * N2) );
                break;

            case 4:
                System.out.printf("A média entre %.2f & %.2f = %.2f", N1, N2, ( (N1 + N2) / 2 ) );
                break;
        }
    }
}
