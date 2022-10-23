package Exercises;

import java.util.Scanner;

/*
 * @author Pedro Ferreira Sudre
 * realizado dia 22/10/2022
 */

public class Ex13 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double numList[] = new double[10];

        for (int i = 0; i < numList.length; i++) {
            System.out.printf("Digite o %d° valor: ", i + 1);
            numList[i] = leia.nextDouble();
        }
        for (int j = numList.length - 1; j >= 0; j--) {
            System.out.println(numList[j]);
        }
    }
}