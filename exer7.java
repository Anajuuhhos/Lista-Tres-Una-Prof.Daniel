package Lista3;
import java.util.Scanner;

public class exer7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroInteiro, qtdPares = 0, qtdImpares = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número inteiro: ");
            numeroInteiro = scanner.nextInt();
            
            if (numeroInteiro % 2 == 0) {
                qtdPares++;
            } else {
                qtdImpares++;
            }
        }
        
        System.out.println("Quantidade de números pares: " + qtdPares);
        System.out.println("Quantidade de números ímpares: " + qtdImpares);
        
        scanner.close();
    }
}