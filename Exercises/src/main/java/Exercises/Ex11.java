package Exercises;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        char sexo;
        float estatura, somaFem = 0, mediaFem, cont = 1, masculino = 0, feminino = 0;

        do {
            System.out.print("Insira o seu sexo (M | F): ");
            sexo = leia.next().charAt(0);
            System.out.print("Insira a sua estatura (em centímetros): ");
            estatura = leia.nextFloat();
            if (Character.toLowerCase(sexo) == 'f') {
                somaFem += estatura;
                feminino++;
            }
            if (Character.toLowerCase(sexo) == 'm') {
                masculino++;
            }
            cont++;
        } while (cont <= 5);
        mediaFem = (somaFem / 100) / feminino;

        System.out.printf("%nO grupo de pessoas contém %.0f homens%nA estatura média das mulheres é %.2fm", masculino,
                mediaFem);
    }
}