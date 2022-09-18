package Exercises;

import java.util.Scanner;

/*
 * @author Pedro Ferreira Sudre
 * realizado dia 18/09/2022
 */
public class Ex03 {

    public static void main(String[] args) {
        float largura, altura, profundidade;
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Insira o valor da largura da caixa (em centímetros): ");
        largura = leia.nextFloat();
        System.out.print("Insira o valor da altura da caixa (em centímetros): ");
        altura = leia.nextFloat();
        System.out.print("Insira o valor da profundidade da caixa (em centímetros): ");
        profundidade = leia.nextFloat();
        Volume(largura, altura, profundidade);
    }
    
    public static void Volume(float largura, float altura, float profundidade){
        float volumeM = (altura*profundidade*largura)/100;
        System.out.printf("O volume da caixa é de %.2fm³%n", volumeM);
    }
}
