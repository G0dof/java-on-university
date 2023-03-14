package Calculadora;

import java.util.Scanner;

public class CalculadoraComplexa {
    Scanner leia = new Scanner(System.in);

    public void interacao() {
        System.out.println("Seja bem vindo ao nosso sistema de cálculo da fórmula de Bhaskara");
        System.out.println("Você deverá digitar três números (a, b, c) para que o cálculo seja realizado\n");
        System.out.print("Por favor, digite o primeiro número (a): ");
        float a = leia.nextFloat();
        System.out.print("Por favor, digite o segundo número (b): ");
        float b = leia.nextFloat();
        System.out.print("Por favor, digite o terceiro número (c): ");
        float c = leia.nextFloat();

        System.out.println(Bhaskara(a,b,c));
    }

    public String Bhaskara(float a, float b, float c) {
        double delta = Math.pow(b, 2) - 4 * a * c;
        double x1 = (-b + Math.sqrt(delta) / 2*a);
        double x2 = (-b - Math.sqrt(delta) / 2*a);

        return String.format("\nO delta é: %f\nA raízes da equação são: \nX1: %f\nX2: %f%n",delta, x1,x2);
    }
}
