package Exercises;

import java.util.Scanner;

/*
 * @author Pedro Ferreira Sudre
 * realizado dia 22/10/2022
 */

public class Ex15 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        char letras[] = new char[10];
        int consoantes = 0;
        String consoantesStr = "";

        for (int i = 0; i < letras.length; i++) {
            System.out.print("Escreva uma letra: ");
            letras[i] = leia.next().toLowerCase().charAt(0);

            if (letras[i] != 'a' && letras[i] != 'e' && letras[i] != 'i' && letras[i] != 'o' && letras[i] != 'u') {
                consoantes++;
                consoantesStr += " "+letras[i]+" ";
            }
        }
        System.out.printf("Consoantes: (%s)%n", consoantesStr);
        System.out.printf("Foram lidas %d consoantes%n", consoantes);

    }
}