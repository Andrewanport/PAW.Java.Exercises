package L1;

import java.util.Scanner;

public class L006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade do cliente: ");
        int idade = scanner.nextInt();

        System.out.print("Digite o preço do objeto: ");
        double preco = scanner.nextDouble();

        double desconto = 0;

        if (idade <= 17) {
            System.out.println("O cliente pode comprar uma bicicleta com 40% de desconto.");
            desconto = preco * 0.2;

        } else if (idade >= 18 && idade <= 75) {
            System.out.println("O cliente pode comprar um carro com 20% de desconto.");
            desconto = preco * 0.4;
        }
        else if (idade > 76) {
            System.out.println("O cliente pode comprar um carro com 20% de desconto.");
            desconto = preco * 0.6;
        }

        double precoFinal = preco - desconto;

        System.out.println("Valor do desconto: R$" + desconto);
        System.out.println("Preço final da venda: R$" + precoFinal);

        scanner.close();
    }
}