package Aula05;

import java.util.Scanner;

public class Aula05_D {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double x, resp;
        int inicio, fim;

        System.out.print("Digite o número para realizar a tabuada: ");
        x = leia.nextDouble();
        System.out.print("Digite o número para iniciar a tabuada: ");
        inicio = (int) leia.nextDouble();
        System.out.print("Digite o número para finalizar a tabuada: ");
        fim = (int) leia.nextDouble();

        for (int i = inicio; i <= fim; i++) {
            resp = x * i;
            System.out.printf("%.0f x %d = %.0f%n", x, i, resp);
        }
    }
}