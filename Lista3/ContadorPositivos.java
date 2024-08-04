package Lista3; // questão 3

import java.util.Scanner;

public class ContadorPositivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadePositivos = 0;

        while (true) {
            System.out.println("Insira um número:");
            int numero = scanner.nextInt();

            if (numero == 0) {
                break;
            }

            if (numero > 0) {
                quantidadePositivos++;
            }
        }

        System.out.println("Quantidade de positivos: " + quantidadePositivos);
        scanner.close();
    }
}
