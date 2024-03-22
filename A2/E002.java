/*
        ----------------------------------- Exercise 2 -----------------------------------

        Write a program that reads the height of a group of 5 people, calculates and displays:

        1) the greatest height of the group
        2) the average height
        3) the number of people taller than 2 meters.

        ----------------------------------------------------------------------------------
*/

package A2;

import java.util.Scanner;
public class E002 {
    public static void main (String[]args){

        Scanner scanner = new Scanner(System.in);

        double Soma = 0;

        int MaisDe2M = 0;

        double Maior = 0;

        double Media = 0;

        for (int i = 0; i < 5; i++){

            System.out.println("Digite sua altura: ");
            double Altura = scanner.nextDouble();

            if (Altura > Maior){
                Maior = Altura;
            }
            Soma += Altura;

            if (Altura > 2.0){
                MaisDe2M += 1;

            }
        }

        Media = Soma / 5;

        System.out.println("O maior do grupo tem: " + Maior + " metros");
        System.out.println("A média de altura é: " + Media);
        System.out.println("O número de pessoas com mais de 2 metros é: " + MaisDe2M);

    }

}
