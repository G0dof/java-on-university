package Exercises;

import java.util.Scanner;

/*
 * @author Pedro Ferreira Sudre
 * realizado dia 22/09/2022
 */

public class Ex05 {
    public static void main(String[] args) {
        /* Algoritmo realizado no Portugol Studio
        
        programa {
    
                inclua biblioteca Matematica --> mat
    
                funcao inicio() {
                inteiro a, b, c, delta

                escreva("Insira o valor a: ")
                leia(a)
                escreva("Insira o valor b: ")
                leia(b)
                escreva("Insira o valor c: ")
                leia(c)

                delta = (mat.potencia(b, 2)) - (4 * a * c)
                se (delta <= 0) escreva("Não será possível calcular as raízes pois o delta "+delta+" é negativo")
                senao Bhaskara(a, b, c, delta)

            }

            funcao vazio Bhaskara(inteiro a, inteiro b, inteiro c, inteiro delta){
                real x1 = (-b + mat.raiz(delta, 2.0))/(2*a)
                real x2 = (-b - mat.raiz(delta, 2.0))/(2*a)
                escreva("Delta: "+delta+"\nRaiz x1: "+x1+"\nRaiz x2: "+x2)
            }
        }
        
        */
        
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