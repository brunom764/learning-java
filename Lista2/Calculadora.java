package Lista2; // questão 5
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 1 para somar;");
        System.out.println("Digite 2 para subtrair;");
        System.out.println("Digite 3 para multiplicar;");
        System.out.println("Digite 4 para dividir;");
        
        int opcao = scanner.nextInt();

        System.out.println("Insira o primeiro valor:");
        int num1 = scanner.nextInt();

        System.out.println("Insira o segundo valor:");
        int num2 = scanner.nextInt();

        switch (opcao) {
            case 1:
                int soma = num1 + num2;
                System.out.println("Soma: " + soma);
                break;
            case 2:
                int subtracao = num1 - num2;
                System.out.println("Subtração: " + subtracao);
                break;
            case 3:
                int multiplicacao = num1 * num2;
                System.out.println("Multiplicação: " + multiplicacao);
                break;
            case 4:
                if (num2 != 0) {
                    int divisao = num1 / num2;
                    System.out.println("Divisão: " + divisao);
                } else {
                    System.out.println("Divisão por zero.");
                }
                break;
            default:
                System.out.println("Opção inválida.");
        }
        
        scanner.close();
    }
}
