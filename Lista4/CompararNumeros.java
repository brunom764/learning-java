package Lista4; // questão 1
import java.util.Scanner;

public class CompararNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro número:");
        int numero1 = scanner.nextInt();

        System.out.println("Insira o segundo número:");
        int numero2 = scanner.nextInt();

        maior(numero1, numero2);

        scanner.close();
    }

    public static void maior(int a, int b) {
        if (a > b) {
            System.out.println("O maior é: " + a);
        } else if (b > a) {
            System.out.println("O maior é: " + b);
        } else {
            System.out.println("Os números são iguais");
        }
    }
}
