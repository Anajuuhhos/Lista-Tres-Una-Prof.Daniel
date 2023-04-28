package Lista3;
import java.util.Scanner;

public class exer5 {

    public static void main(String[] args)  {

        Scanner scanner = new Scanner (System.in);

        System.out.println("Programa para informar números ímpares");

        System.out.println("Valores ímpares entre 1 e 50: ");
        for (int i = 1; i < 50; i++) {
            if (i % 2 != 0) {
                System.out.println(i);

                scanner.close();
            }
            }
    }
}
