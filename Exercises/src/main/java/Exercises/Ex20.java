package Exercises;

import java.util.Scanner;

/*
 * @author Pedro Ferreira Sudre
 * realizado dia 23/10/2022
 */

public class Ex20 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numeros[] = new int[10], soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Insira um valor: ");
            numeros[i] = leia.nextInt();
            numeros[i] = (int) Math.pow(numeros[i], 2);
            soma += numeros[i];
        }
        System.out.printf("A soma dos quadrados dos elementos inseridos é: %d%n", soma);
    }
}