package Desafio;

import java.util.Random;
import java.util.Scanner;

public class Adivinhe {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        Scanner leia = new Scanner(System.in);
        int num = aleatorio.nextInt(20), numUsuario = 21;

        while (num != numUsuario) {
            System.out.print("\033[1;34mInsira um número: ");
            numUsuario = leia.nextInt();

            if (num == numUsuario) {
                System.out.println("\033[1;32mVocê acertou");

            } else {
                String maiorOuMenor = (num > numUsuario ? "\033[1;33mÉ Maior!" : "\033[1;31mÉ Menor!");
                System.out.println(maiorOuMenor);
            }
        }

    }
}
