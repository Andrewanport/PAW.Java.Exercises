package L2;

import java.util.Scanner;

public class L015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = scanner.nextInt();

            if (numero >= 10 && numero <= 40) {
                contador++;
            }
        }

        System.out.println("Quantidade de números no intervalo [10, 40]: " + contador);
    }
}
