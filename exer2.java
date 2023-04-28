package Lista3;
import java.util.Scanner;

public class exer2 {

    public static void main(String[] args)  {

        Scanner scanner = new Scanner (System.in);

        String titulo = "Programa de Login";
        System.out.println(titulo);
        System.out.println("Digite o nome de usuário: ");
        String nomeUsuario = scanner.next();
        System.out.println("Digite sua senha: ");
        String senha = scanner.next();
        while (nomeUsuario.equals(senha)) {
            System.out.println("Erro! - Insira uma nova senha");
            System.out.println("Digite o nome de usuário: ");
            nomeUsuario = scanner.next();
            System.out.println("Digite a sua senha: ");
            senha = scanner.next();

        scanner.close();
        }
    }
}