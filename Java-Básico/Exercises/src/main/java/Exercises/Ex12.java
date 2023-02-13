package Exercises;

import java.util.Scanner;

/*
 * @author Pedro Ferreira Sudre
 * realizado dia 22/10/2022
 */

public class Ex12 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int  numList[] = new int[5];

        for(int i = 0; i < numList.length;i++){
            System.out.printf("Insira o %d° valor: ", i+1);
            numList[i] = leia.nextInt();
        }
        for (int i : numList) {
            System.out.println(i);
        }
    }
}