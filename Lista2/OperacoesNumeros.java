package Lista2; // questão 4
import java.util.Scanner;

public class OperacoesNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro valor:");
        double num1 = scanner.nextDouble();

        System.out.println("Insira o segundo valor:");
        double num2 = scanner.nextDouble();

        if (num1 == num2) {
            double multiplicacao = num1 * num2;
            System.out.println("Multiplicação: " + multiplicacao);
        } else if (num1 > num2) {
            double subtracao = num1 - num2;
            System.out.println("Subtração: " + subtracao);
        } else {
            double soma = num1 + num2;
            System.out.println("Soma: " + soma);
        }
        
        scanner.close();
    }
}
