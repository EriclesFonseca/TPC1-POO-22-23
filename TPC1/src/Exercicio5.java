import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {
        double raio, area =0.0, circunferencia = 0.0;
        Scanner lerInput = new Scanner(System.in);
        System.out.println("Digite o raio do circulo: ");
        raio = lerInput.nextDouble();
        calcularArea(raio, area, circunferencia);
    }

    static void calcularArea(double raio, double area, double circunferencia) {
        area = Math.PI * Math.pow(raio, 2);
        circunferencia = 2 * Math.PI * raio;
        System.out.println("A área do círculo é: " + area);
        System.out.println("A circunferência do círculo é: " + circunferencia);
    }

}