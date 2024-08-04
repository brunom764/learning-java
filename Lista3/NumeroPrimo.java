package Lista3; // questão 5

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número:");
        int N = scanner.nextInt();

        if (isPrimo(N)) {
            System.out.println(N + " é primo.");
        } else {
            System.out.println(N + " não é primo.");
        }

        scanner.close();
    }

    public static boolean isPrimo(int N) {
        if (N <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                return false;
            }
        }
        return true;
    }
}
