package Exercises;

import java.util.Scanner;

/*
 * @author Pedro Ferreira Sudre
 * realizado dia 22/10/2022
 */

public class Ex14 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double notas[] = new double[4], media = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Insira a %dª nota: ", i + 1);
            notas[i] = leia.nextDouble();
            media += notas[i];
        }
        media /= notas.length;

        for (double i : notas) {
            System.out.println(i);
        }
        System.out.printf("A média das notas acima é %.2f%n", media);
    }
}