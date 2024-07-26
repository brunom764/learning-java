package Lista2; // questão 2
import java.util.Scanner;

public class CondicaoNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro número:");
        double num1 = scanner.nextDouble();

        System.out.println("Insira o segundo número:");
        double num2 = scanner.nextDouble();

        System.out.println("Insira o terceiro número:");
        double num3 = scanner.nextDouble();

        if (num1 > num2 && num1 > num3 && num1 != num2 && num1 != num3) {
            System.out.println("Condição satisfeita");
        } else {
            System.out.println("Erro");
        }
        
        scanner.close();
    }
}
