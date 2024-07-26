package Lista1; // questão 3
import java.util.Scanner;

public class NovoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o salário:");

        double salario = scanner.nextDouble();
        double novoSalario = salario * 1.25;

        System.out.printf("Novo salário: %.2f%n", novoSalario);
        
        scanner.close();
    }
}
