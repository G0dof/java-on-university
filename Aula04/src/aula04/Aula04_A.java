package aula04;

import java.util.Scanner;

public class Aula04_A {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        float n1, n2, n3, nMaior = 0;

        System.out.print("Insira um número: ");
        n1 = leia.nextFloat();
        if (nMaior < n1){
            nMaior = n1;
        }

        System.out.print("Insira outro número: ");
        n2 = leia.nextFloat();
        if (nMaior < n2){
            nMaior = n2;
        }

        System.out.print("Insira mais um número: ");
        n3 = leia.nextFloat();
        if (nMaior < n3){
            nMaior = n3;
        }

        System.out.printf("O maior valor entre  %f, %f e %f é %f", n1, n2, n3, nMaior);

        // System.out.println(num % 2 == 0 ? "Este número é par!": "Este número é ímpar!");
    }
}
