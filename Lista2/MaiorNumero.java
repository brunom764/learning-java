package Lista2; // questão 1
import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro número:");
        double num1 = scanner.nextDouble();

        System.out.println("Insira o segundo número:");
        double num2 = scanner.nextDouble();

        if (num1 > num2) {
            System.out.println("O maior é: " + num1);
        } else if (num2 > num1) {
            System.out.println("O maior é: " + num2);
        } else {
            System.out.println("Os números são iguais");
        }
        
        scanner.close();
    }
}
