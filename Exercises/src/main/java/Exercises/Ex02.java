package Exercises;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        int hora, minutos, resultado;
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite um valor de hora: ");
        hora = leia.nextInt();
        System.out.print("Digite um valor de minutos: ");
        minutos = leia.nextInt();
        resultado = (hora * 60) + minutos;
        System.out.printf("Já se passaram %d minutos desde o início do dia", resultado);
    }
}
