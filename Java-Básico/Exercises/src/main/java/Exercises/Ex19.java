package Exercises;

import java.util.Scanner;

/*
 * @author Pedro Ferreira Sudre
 * realizado dia 23/10/2022
 */

public class Ex19 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int pessoas = 5, idade[] = new int[pessoas];
        double altura[] = new double[pessoas];

        for(int i = 0; i < pessoas; i++){
            System.out.printf("Digite a idade da %dª pessoa: ", i+1);
            idade[i] = leia.nextInt();
            System.out.printf("Digite a altura da %dª pessoa (em cm): ", i+1);
            altura[i] = leia.nextDouble();
        }
        System.out.println();
        for(int i = pessoas-1; i >= 0; i--){
            System.out.printf("Idade da %dª pessoa: %d%n anos", (i+1), idade[i]);
            System.out.printf("Altura da %dª pessoa: %.2fm%n%n", (i+1), altura[i]/100);
        }
    }
}