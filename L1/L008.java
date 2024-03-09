package L1;

import java.util.Scanner;

public class L008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à venda de ingressos para o show!");

        // Leitura da quantidade de ingressos
        System.out.print("Digite a quantidade de ingressos desejada (máximo 3): ");
        int quantidadeIngressos = scanner.nextInt();

        // Verificação da quantidade máxima de ingressos por pessoa
        if (quantidadeIngressos > 3 || quantidadeIngressos <= 0) {
            System.out.println("Quantidade de ingressos inválida. A quantidade máxima por pessoa é 3.");
            return;
        }

        // Leitura do setor desejado
        System.out.println("Setores disponíveis:");
        System.out.println("1. VIP (R$ 350,00)");
        System.out.println("2. Cadeiras (R$ 200,00)");
        System.out.println("3. Arquibancada (R$ 100,00)");
        System.out.print("Escolha o setor desejado (1, 2 ou 3): ");
        int setor = scanner.nextInt();

        // Leitura do tipo de ingresso
        System.out.println("Tipos de ingresso:");
        System.out.println("1. Inteira");
        System.out.println("2. Estudante");
        System.out.print("Escolha o tipo de ingresso desejado (1 ou 2): ");
        int tipoIngresso = scanner.nextInt();

        // Cálculo do preço total
        double precoIngresso = 0;
        switch (setor) {
            case 1:
                precoIngresso = 350.00;
                if (tipoIngresso == 2) {
                    System.out.println("Não é possível comprar ingresso de estudante para o setor VIP.");
                    return;
                }
                break;
            case 2:
                precoIngresso = 200.00;
                break;
            case 3:
                precoIngresso = 100.00;
                break;
            default:
                System.out.println("Opção de setor inválida.");
                return;
        }

        double precoTotal = precoIngresso * quantidadeIngressos;

        // Exibição do valor total a pagar
        System.out.println("Valor total a pagar: R$ " + precoTotal);

        scanner.close();
    }
}
