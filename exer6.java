package Lista3;
import java.util.Scanner;

public class exer6 {

    public static void main(String[] args)  {

        Scanner scanner = new Scanner (System.in);

        String titulo = "Números entre o intervalo";
        System.out.println(titulo);
        System.out.println("Informe o primeiro numero: ");
        int numeroUm = scanner.nextInt();
        System.out.println("Informe o segundo número: ");
        int numeroDois = scanner.nextInt();
        for (int numero = numeroUm; numero <= numeroDois; numero = numero + 1) {
            System.out.println("Os numeros são: " + numero);
       
            scanner.close();
    }   
}
}
