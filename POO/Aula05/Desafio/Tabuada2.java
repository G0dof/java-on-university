package Desafio;

import java.util.Scanner;

public class Tabuada2 {
    public void calcularTabuada() {
        Scanner leia = new Scanner(System.in);

        System.out.print("Insira um número para realizar a tabuada: ");
        int num = leia.nextInt();

        for (int i = 1; i <= 10; i++) System.out.printf("%d x %d = %d%n", num, i, (num * i));
    }
}
