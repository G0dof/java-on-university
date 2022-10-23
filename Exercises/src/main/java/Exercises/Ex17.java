package Exercises;

import java.util.Scanner;

/*
 * @author Pedro Ferreira Sudre
 * realizado dia 22/10/2022
 */

public class Ex17 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double alunosMedia[] = new double[10], media;
        for (int i = 0; i < 10; i++) {
            media = 0;
            for (int j = 0; j < 4; j++) {
                System.out.printf("Insira a %dª nota do %dº aluno: ", (j + 1), (i + 1));
                alunosMedia[i] = leia.nextDouble();
                media += alunosMedia[i];
            }
            alunosMedia[i] = media / 4;
            System.out.println();
        }
        System.out.println("Médias dos alunos:\n");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Média do %d° aluno: %.2f%n", (i + 1), alunosMedia[i]);
        }

    }
}