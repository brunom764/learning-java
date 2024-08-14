package Lista4; // questão 2

import java.util.Scanner;

public class VerificarCondicao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[3];

        System.out.println("Insira o primeiro número:");
        numeros[0] = scanner.nextInt();

        System.out.println("Insira o segundo número:");
        numeros[1] = scanner.nextInt();

        System.out.println("Insira o terceiro número:");
        numeros[2] = scanner.nextInt();

        isFirstGreater(numeros);

        scanner.close();
    }

    public static void isFirstGreater(int[] nums) {
        if (nums[0] > nums[1] && nums[0] > nums[2] && nums[0] != nums[1] && nums[0] != nums[2]) {
            System.out.println("Condição satisfeita");
        } else {
            System.out.println("Erro");
        }
    }
}
