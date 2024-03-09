package L1;

import java.util.Scanner;

public class L005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade da pessoa: ");
        int idade = scanner.nextInt();

        if (idade <= 15) {
            System.out.println("Não pode votar.");
        } else if (idade >= 16 && idade <= 17) {
            System.out.println("Voto não obrigatório.");
        } else if (idade >= 18 && idade <= 65) {
            System.out.println("Voto obrigatório.");
        } else {
            System.out.println("Voto não obrigatório.");
        }

        scanner.close();
    }
}
