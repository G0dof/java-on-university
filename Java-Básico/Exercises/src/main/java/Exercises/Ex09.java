package Exercises;

import java.util.Scanner;

/*
 * @author Pedro Ferreira Sudre
 * realizado dia 05/10/2022
 */

public class Ex09 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int qtdNum, cont = 1;
        float valores, soma = 0, media, maior = 0;

        System.out.print("Quantos valores deseja inserir: ");
        qtdNum = leia.nextInt();

        while (cont <= qtdNum) {
            System.out.printf("Insira o %d valor : ", cont);
            valores = leia.nextFloat();

            soma += valores;
            cont++;

            if (maior < valores) {
                maior = valores;
            }

        }
        media = soma / qtdNum;
        System.out.printf("%nA média é igual %.1f", media);
        System.out.printf("%nO maior valor é %.0f", maior);

    }
}