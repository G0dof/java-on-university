package Desafio;

import java.util.Scanner;

public class Tabuada1 {

    public void calcularTabuada() {
        Scanner leia = new Scanner(System.in);

        System.out.print("Insira um número para visualizar sua tabuada: ");
        int num = leia.nextInt();

        System.out.println(num + " x 1 = " + (num));
        System.out.println(num + " x 2 = " + (num * 2));
        System.out.println(num + " x 3 = " + (num * 3));
        System.out.println(num + " x 4 = " + (num * 4));
        System.out.println(num + " x 5 = " + (num * 5));
        System.out.println(num + " x 6 = " + (num * 6));
        System.out.println(num + " x 7 = " + (num * 7));
        System.out.println(num + " x 8 = " + (num * 8));
        System.out.println(num + " x 9 = " + (num * 9));
        System.out.println(num + " x 10 = " + (num * 10));
    }
}
