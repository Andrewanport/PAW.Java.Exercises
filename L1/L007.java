package L1;

import java.util.Scanner;

public class L007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tempo em segundos: ");
        int tempoSegundos = scanner.nextInt();

        int horas = tempoSegundos / 3600; // Calcula o número de horas
        int minutos = (tempoSegundos % 3600) / 60; // Calcula o número de minutos
        int segundos = tempoSegundos % 60; // Calcula o número de segundos

        System.out.println("Tempo em horas: " + horas);
        System.out.println("Tempo em minutos: " + minutos);
        System.out.println("Tempo em segundos: " + segundos);

        scanner.close();
    }
}
