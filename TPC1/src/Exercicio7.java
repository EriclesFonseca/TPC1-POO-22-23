import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        double salarioAumentado;
        double salary = readDouble("Por favor, insira seu salário: ");
        double percentageRaise = readDouble("Qual a percentagem do aumento?");
        salarioAumentado=salary + (salary* percentageRaise) / 100 ;
        System.out.println("Salário Aumentado: " + salarioAumentado);

    }

    static double readDouble(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextDouble();
    }
}