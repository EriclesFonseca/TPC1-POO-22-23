import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o numero para verificar se é Armstrong: ");
        int number = scanner.nextInt();

        if (checkArmstrong(number)) {
            System.out.println("O número " + number + " é Armstrong!");
        } else {
            System.out.println("O número " + number + " não é Armstrong!");
        }
    }

    static boolean checkArmstrong(int number) {
        int originalNumber = number;
        int remainder;
        int result = 0;
        int n = 0;

        while (originalNumber != 0) {
            originalNumber /= 10;
            ++n;
        }

        originalNumber = number;

        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
            originalNumber /= 10;
        }

        return result == number;
    }

}