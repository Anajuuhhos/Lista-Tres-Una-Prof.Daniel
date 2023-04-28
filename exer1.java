package Lista3;
import java.util.Scanner;

public class exer1 {

    public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in);
        double notas;
{
        String titulo = "Notas Alunos";
        System.out.println(titulo);
        System.out.println("Digite um número: ");
        notas = scanner.nextDouble();
        while ((notas < 0) || (notas > 10)) {
            System.out.println("Nota inválida\n" + "Digite outra nota");
            notas = scanner.nextDouble();

            scanner.close();

        }
    }
}
}
