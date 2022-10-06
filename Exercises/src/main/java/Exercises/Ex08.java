package Exercises;

import java.util.Scanner;

/*
 * @author Pedro Ferreira Sudre
 * realizado dia 05/10/2022
 */

public class Ex08 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int qtdNum;
        float valores, soma = 0, media;

        System.out.print("Quantos valores deseja inserir: ");
        qtdNum = leia.nextInt();

        for(int i = 1; i <= qtdNum; i++){
            System.out.printf("Insira o %d valor : ",i);
            valores = leia.nextFloat();

            soma += valores;
        }

        media = soma / qtdNum;

        System.out.printf("%nA média é igual %.1f", media);
    }
}