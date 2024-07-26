package Lista1; // questão 1
import java.util.Scanner;

public class SomarQuatroNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe quatro números, em sequência:");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();

        int soma = num1 + num2 + num3 + num4;

        System.out.println("Resultado da soma: " + soma);
        
        scanner.close();
    }
}
