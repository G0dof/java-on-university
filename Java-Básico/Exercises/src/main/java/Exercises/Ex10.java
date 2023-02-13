package Exercises;

import java.util.Scanner;

/*
 * @author Pedro Ferreira Sudre
 * realizado dia 05/10/2022
 */

public class Ex10 {
    public static void main(String[] args) {
        int qtdNum, menor = 999999999, positivos = 0, negativos = 0;
        float numero;

        Scanner leia = new Scanner(System.in);

        System.out.print("Digite a quantidade de números que deseja digitar: ");
        qtdNum = leia.nextInt();
        for (int cont = 1; cont <= qtdNum; cont++) {
            System.out.printf("Digite o %dº número: ", cont);
            numero = leia.nextFloat();

            if (numero >= 0) {
                positivos++;
            } else {
                negativos++;
            }

            if (numero < menor) {
                menor = (int) numero;
            }

        }
        System.out.printf("%n%d números são positivos e %d números são negativos.%nE o menor valor é %d", positivos,
                negativos, menor);
    }
}