/*
        ----------------------------------- Exercise 4 -----------------------------------

        Maria needs a program for her digital photo developing store, which works with the following prices
        and gives gifts to customers who develop more than 200 photos with an album

        Up to 30  -> R$ 0.50
        Up to 50  -> R$ 0.30
        Up to 100 -> R$ 0.20
        Over 100  -> R $ 0.10

        ----------------------------------------------------------------------------------
*/

package A1;

import java.util.Scanner;
public class A004 {
    public static void main (String[] args) {

        System.out.println("------------------------------------");
        System.out.println("Digite quantas fotos quer revelar!");
        System.out.println("------------------------------------");

        Scanner scanner = new Scanner(System.in);

        int F = scanner.nextInt();
        double V = 0;

        if (F <= 30){
            V = (F * 0.5);
            System.out.println("O valor de: " + F + " fotos é de: R$" + V);
        }
        else if (F <= 50){
            V = (F * 0.3);
            System.out.println("O valor de: " + F + " fotos é de: R$" + V);
        }

        else if (F <= 100){
            V = (F * 0.2);
            System.out.println("O valor de: " + F + " fotos é de: R$" + V);
        }

        else{
            V = (F * 0.1);
            System.out.println("O valor de: " + F + " fotos é de: R$" + V);
        }

        if (F > 250){
            System.out.println("Você ganhou um álbum!");
        }
    }
}
