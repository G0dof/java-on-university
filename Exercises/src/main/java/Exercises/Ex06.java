package Exercises;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        float espaco, velocidade;
        int tempo;

        System.out.print("Insira a distância (em Km): ");
        espaco = leia.nextFloat();
        if (espaco < 0) {
            System.out.println("Valor da distância inválido. Tente Novamente");
        } else {
            System.out.print("Insira o tempo (em horas): ");
            tempo = leia.nextInt();
            if (tempo < 0) {
                System.out.println("Valor do tempo inválido. Tente Novamente");
            } else {
                velocidade = espaco / tempo;
                System.out.printf("A velocidade média do veículo é de %.1fKm/h", velocidade);
            }
        }

    }
}
