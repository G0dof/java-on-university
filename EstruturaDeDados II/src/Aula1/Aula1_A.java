package Aula1;

import java.util.Scanner;

public class Aula1_A {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double[] temperatura = new double[365];
        temperatura[0] = 25.7;
        temperatura[1] = 27.4;
        temperatura[2] = 29.3;
        temperatura[3] = 31.3;
        temperatura[4] = 30.2;
        temperatura[5] = 29.9;

        System.out.printf("O valor da temperatura do dia 3 é: %f", temperatura[2]);
        System.out.printf("O tamanho do vetor é: %d", temperatura.length);

        for (int i = 0; i < temperatura.length; i++) {
            if (temperatura[i] != 0)
                System.out.printf("O valor da temperatura do dia %d é %f%n", (i + 1), temperatura[i]);
        }

        for (double temp : temperatura) {
            if (temp != 0) System.out.println(temp);
        }
    }
}
