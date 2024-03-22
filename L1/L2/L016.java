package L2;

import java.util.Scanner;

public class L016 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pontos = 0;
        double premio = 0;

        while (true) {
            System.out.print("Digite dois números (positivo e negativo para sair): ");
            int primeiroNumero = scanner.nextInt();
            int segundoNumero = scanner.nextInt();

            if (primeiroNumero > 0 && segundoNumero < 0) {
                break;
            }

            if (primeiroNumero < segundoNumero) {
                pontos++;
            }
        }

        if (pontos > 0) {
            premio = pontos / 10.0;
        }

        System.out.println("Total de pontos do jogador: " + pontos);
        System.out.println("Valor do prêmio: R$" + premio);
    }
}
