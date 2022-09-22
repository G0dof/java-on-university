package Exercises;

import java.util.Scanner;

/*
 * @author Pedro Ferreira Sudre
 * realizado dia 22/09/2022
 */

public class Ex05 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int a, b, c, delta;

        System.out.print("Insira o valor a: ");
        a = leia.nextInt();
        System.out.print("Insira o valor b: ");
        b = leia.nextInt();
        System.out.print("Insira o valor c: ");
        c = leia.nextInt();

        delta = (int) (Math.pow(b, 2)) - (4 * a * c);
        if (delta <= 0) System.out.printf("%nNão será possível calcular as raízes pois o delta (%d) é negativo", delta);
        else {
            Bhaskara(a, b, c, delta);
        }
    }
    
    public static void Bhaskara(int a, int b, int  c, int delta){
        double x1 = (-b + Math.sqrt(delta))/(2*a); 
        double x2 = (-b - Math.sqrt(delta))/(2*a); 
        System.out.printf("%nDelta: %d%nRaiz x1: %.0f%nRaiz x2: %.0f", delta,  x1, x2);
    }

}