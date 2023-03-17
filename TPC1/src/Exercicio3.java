import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner lerInput = new Scanner(System.in);
        System.out.println("Digite o nm1: ");
        num1 = lerInput.nextInt();
        System.out.println("Digite o nm2: ");
        num2 = lerInput.nextInt();
        System.out.println("Digite o nm3: ");
        num3 = lerInput.nextInt();

        int maior = maiorNumero(num1, num2, num3);

        if (maior == 0) {
            System.out.println("Os numeros tem de ser diferente.");
        } else {
            System.out.println("O maior número é: " + maior);
        }
    }

    static int maiorNumero(int num1, int num2, int num3) {
        int maior = 0;

        if (num1 != num2 && num1 != num3 && num2 != num3) {
            if (num1 > num2 && num1 > num3) {
                maior = num1;
            }
            if (num2 > num1 && num2 > num3) {
                maior = num2;
            }
            if (num3 > num1 && num3 > num2) {
                maior = num3;
            }
        }
        return maior;
    }
}