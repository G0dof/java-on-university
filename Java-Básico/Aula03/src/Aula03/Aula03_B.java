package Aula03;

import java.util.Scanner;

public class Aula03_B {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        float a, b;

        System.out.print("Digite o valor A: ");
        a = leia.nextFloat();
        System.out.print("Digite o valor B: ");
        b = leia.nextFloat();
        System.out.printf("A soma á entre os valores %.2f e %.2f é %.1f%n", a, b, Soma(a, b));
        Subtracao(a, b);
    }

    public static float Soma(float x, float y) {
        return x + y;
    }

    public static void Subtracao(float x, float y) {
        float sub = x - y;
        System.out.printf("A subtração á entre os valores %.2f e %.2f é %.1f%n", x, y, sub);
    }
}
