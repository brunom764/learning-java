package Lista4; // questão 3

import java.util.Scanner;

public class VerificarParImpar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número:");
        int numero = scanner.nextInt();

        parImpar(numero);

        scanner.close();
    }

    public static void parImpar(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " é par.");
        } else {
            System.out.println(num + " é ímpar.");
        }
    }
}
