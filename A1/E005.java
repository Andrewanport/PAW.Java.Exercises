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
public class E005 {
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

        switch (O) {
            case 1:
                if (N1 > N2) {
                    R = N1 - N2;
                    System.out.println("O valor da Subtração dos valores " + N1 + " e " + N2 + " é de: " + R);
                }
                else if (N2 > N1) {
                    R = N2 - N1;
                    System.out.println("O valor da Subtração dos valores " + N1 + " e " + N2 + " é de: " + R);
                }
                else {
                    R = N1 - N2;
                    System.out.println("O valor da Subtração dos valores " + N1 + " e " + N2 + " é de: " + R);
                }
                break;

            case 2:
                if (N1 == 0 ){
                    R = 0;
                    System.out.println(R);
                }

                else if (N2 == 0){
                    System.out.println("Valor indefinido. Nenhum número pode ser dividido por 0");
                }

                else {
                R = N1 / N2;
                System.out.println("O valor da divisão dos valores " + N1 + " e " + N2 + " é de: " + R);
                }
                break;

            case 3:
                R = N1 * N2;
                System.out.println("O valor da multiplicação dos valores " + N1 + " e " + N2 + " é de: " + R);
                break;

            case 4:
                R = (N1 + N2) / 2;
                System.out.println("O valor da média dos valores " + N1 + " e " + N2 + " é de: " + R);
                break;
        }
    }
}
