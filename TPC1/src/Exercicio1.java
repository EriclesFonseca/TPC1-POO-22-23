import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner lerInput = new Scanner(System.in);
        System.out.println("Digite a temperatura em Fahrenheit:");
        double tempF = lerInput.nextDouble();

        double tempC = converter(tempF);
        System.out.println("A temperatura em Celsius é: " + tempC);
    }
    static double converter(double tempF) {
        double tempC = (tempF - 32.0) * (5.0/9.0);
        return tempC;
    }
}