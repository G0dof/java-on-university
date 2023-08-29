package Aula1_2;

import java.util.Scanner;

public class Aula1_B {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int diasAbaixo = 0, diasAcima = 0;
        double soma = 0, media;
        double temperaturas[] = new double[2];

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.printf("Insira a %dª temperatura: ", (i + 1));
            temperaturas[i] = leia.nextDouble();
            soma += temperaturas[i];
        }
        media = (soma) / temperaturas.length;
        for (double temp : temperaturas) {
            if (temp > media) diasAcima++;
            else if (temp < media) diasAbaixo++;
        }

        System.out.printf("A média das temperaturas é %.2f%n", media);
        System.out.printf("A quantidade de dias acima da média é %d%n", diasAcima);
        System.out.printf("A quantidade de dias abaixo da média é %d%n", diasAbaixo);
    }
}
