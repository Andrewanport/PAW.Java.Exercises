package L1;

// Import da propriedade Scanner para trabalhar com recebimento de dados

import java.util.Scanner;

// Definir a classe criada ("L004") -> Definir método 'main' -> Criar objeto a partir do 'scanner'

public class L004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o valor do salário bruto:

        System.out.print("Digite o valor do salário bruto: ");
        double salarioBruto = scanner.nextDouble();

        // Cálculos necessários, tipo da variável + nome do objeto = (...):

        double descontoIR = salarioBruto * 0.10; // 10% de desconto de IR
        double baseCalculoINSS = salarioBruto - descontoIR;
        double descontoINSS = baseCalculoINSS * 0.15; // 15% de desconto de INSS

        double salarioLiquido = salarioBruto - descontoIR - descontoINSS;

        // Saída
        System.out.println("Desconto de IR: R$ " + descontoIR);
        System.out.println("Desconto de INSS: R$ " + descontoINSS);
        System.out.println("Salário líquido: R$ " + salarioLiquido);

        // Encerramento do scanner
        scanner.close();
    }
}
