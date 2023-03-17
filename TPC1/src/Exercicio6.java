import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o valor do r do círculo: ");
        double r = scanner.nextDouble();
        System.out.print("Insira o valor da altura h: ");
        double h = scanner.nextDouble();

        System.out.println("Volume da esfera: " + sphereVolume(r));
        System.out.println("Área da superfície da esfera: " + sphereSurface(r));
        System.out.println("Volume do cilindro: " + cylinderVolume(r, h));
        System.out.println("Área da superfície do cilindro: " + cylinderSurface(r, h));
        System.out.println("Volume do cone: " + coneVolume(r, h));
        System.out.println("Área da superfície do cone: " + coneSurface(r, h));
    }

    static double sphereVolume(double r) {
        return (4.0/3.0) * Math.PI * Math.pow(r, 3);
    }

    static double sphereSurface(double r) {
        return 4.0 * Math.PI * Math.pow(r, 2);
    }

    static double cylinderVolume(double r, double h) {
        return Math.PI * Math.pow(r, 2) * h;
    }

    static double cylinderSurface(double r, double h) {
        return 2.0 * Math.PI * r * (r + h);
    }

    static double coneVolume(double r, double h) {
        return (1.0/3.0) * Math.PI * Math.pow(r, 2) * h;
    }

    static double coneSurface(double r, double h) {return Math.PI * r * (r + Math.sqrt(Math.pow(h, 2) + Math.pow(r, 2)));
    }
}