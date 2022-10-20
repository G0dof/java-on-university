package Aula06;

import java.util.Scanner;

public class Aula06_A {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numeros[], soma = 0, n;

        System.out.print("Digite o tamanho do vetor: ");
        n = leia.nextInt();

        numeros = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            numeros[i] = leia.nextInt();
            soma += numeros[i];
        }
        
        System.out.printf("%nA soma dos números é: %d%n", soma);
        System.out.printf("%nOs números digitados foram: %n");
        for (int i = 0; i < n; i++) {
            System.out.printf("%dº número: %d%n", (i+1), numeros[i]);
        }
    }
}
