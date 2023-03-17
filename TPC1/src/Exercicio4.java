import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args){
        int numCiranças, tamnhoGrupo, numGrupos, criançasrestantes;
        Scanner lerInput = new Scanner(System.in);
        System.out.println("Digite o numero total de crianças: ");
        numCiranças = lerInput.nextInt();
        System.out.println("Digite o tamanho desejado para os grupos: ");
        tamnhoGrupo = lerInput.nextInt();
        numGrupos = numCiranças/tamnhoGrupo;
        criançasrestantes=numCiranças % tamnhoGrupo;
        System.out.println("Podem ser formados "+numGrupos+" grupos de crianças e restam "+criançasrestantes+" criança(as) sem um grupo.");
    }
}