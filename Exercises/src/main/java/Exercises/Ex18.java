package Exercises;

import java.util.Scanner;

/*
 * @author Pedro Ferreira Sudre
 * realizado dia 23/10/2022
 */

public class Ex18 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numeros[] = new int[5], soma = 0, mult = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Insira o %d° número: ", i + 1);
            numeros[i] = leia.nextInt();
            soma += numeros[i];
            mult *= numeros[i];
        }

        System.out.println("Números:");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        System.out.printf("%nSoma: %d%n", soma);
        System.out.printf("Multiplicação: %d%n", mult);
    }
}