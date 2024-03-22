package L2;

import java.util.Scanner;

public class L014 {
    public static void main(String[] args) {
        final int NUM_PESSOAS = 20;
        Scanner scanner = new Scanner(System.in);

        double maiorAltura = 0;
        double somaAlturas = 0;
        int contadorAlturaSuperior2m = 0;

        for (int i = 1; i <= NUM_PESSOAS; i++) {
            System.out.print("Digite a altura da pessoa " + i + " (em metros): ");
            double altura = scanner.nextDouble();

            // Atualiza a maior altura
            if (altura > maiorAltura) {
                maiorAltura = altura;
            }

            // Soma as alturas para calcular a média
            somaAlturas += altura;

            // Conta o número de pessoas com altura superior a 2 metros
            if (altura > 2) {
                contadorAlturaSuperior2m++;
            }
        }

        // Calcula a altura média
        double alturaMedia = somaAlturas / NUM_PESSOAS;

        // Exibe os resultados
        System.out.println("A maior altura do grupo é: " + maiorAltura + " metros");
        System.out.println("A altura média do grupo é: " + alturaMedia + " metros");
        System.out.println("O número de pessoas com altura superior a 2 metros é: " + contadorAlturaSuperior2m);

        scanner.close();
    }
}
