package L2;

import java.util.Scanner;

public class L018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeClientes = 1000;

        for (int i = 1; i <= quantidadeClientes; i++) {
            System.out.println("Informe o salário do cliente " + i + ":");
            double salario = scanner.nextDouble();

            double credito;

            if (salario <= 800.00) {
                credito = salario * 0.05;
            } else if (salario <= 2000.00) {
                credito = salario * 0.10;
            } else {
                credito = salario * 0.15;
            }

            System.out.println("O crédito do cliente " + i + " é de: R$" + credito);
        }

        scanner.close();
    }
}
