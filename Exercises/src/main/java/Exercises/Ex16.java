package Exercises;

import java.util.Scanner;

/*
 * @author Pedro Ferreira Sudre
 * realizado dia 22/10/2022
 */

public class Ex16 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int valores[] = new int[20], pares[] = new int[20], impares[] = new int[20];

        for (int i = 0; i < valores.length; i++) {
            System.out.print("Digite um número: ");
            valores[i] = leia.nextInt();
            if (valores[i] % 2 == 0)
                pares[i] = valores[i];
            else
                impares[i] = valores[i];
        }
        System.out.println("\nVALORES: ");
        for (int valor : valores) {
            if (valor == 0) {
            }
            System.out.println(valor);
        }
        System.out.println("\nPARES: ");
        for (int par : pares) {
            if (par == 0) {  // Evitar a repetição de 0 na saída
            } else
                System.out.println(par);
        }
        System.out.println("\nÍMPARES: ");
        for (int impar : impares) {
            if (impar == 0) { // Evitar a repetição de 0 na saída
            } else
                System.out.println(impar);
        }
    }
}