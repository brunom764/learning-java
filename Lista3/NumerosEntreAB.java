package Lista3; // questão 2

import java.util.Scanner;

public class NumerosEntreAB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o valor de A:");
        int A = scanner.nextInt();

        System.out.println("Insira o valor de B:");
        int B = scanner.nextInt();

        if (A < B) {
            System.out.println("Série numérica:");
            for (int i = A + 1; i < B; i++) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("Série numérica:");
            for (int i = B + 1; i < A; i++) {
                System.out.print(i + " ");
            }
        }
        
        scanner.close();
    }
}
