package Lista1; // questão 5
import java.util.Scanner;
import java.lang.Math;

public class Potencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro número:");
        double base = scanner.nextDouble();

        System.out.println("Insira o segundo número:");
        double expoente = scanner.nextDouble();

        if (base > 0 && expoente > 0) {
            double resultado = Math.pow(base, expoente);
            System.out.printf("Resultado: %.2f%n", resultado);
        } else {
            System.out.println("Os números devem ser maiores que zero.");
        }
        
        scanner.close();
    }
}
