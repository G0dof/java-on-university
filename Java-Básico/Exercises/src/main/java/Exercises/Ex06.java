package Exercises;

import java.util.Scanner;

/*
 * @author Pedro Ferreira Sudre
 * realizado dia 22/09/2022
 */

public class Ex06 {

    public static void main(String[] args) {
        /* Algoritmo realizado no Portugol Studio
        
        programa {
    
            funcao inicio() {
                real espaco, velocidade
                inteiro tempo

                escreva("Insira a distância (em Km): ")
                leia(espaco)
                
                se (espaco < 0) {
                    escreva("Valor da distância inválido. Tente Novamente")
                } senao {
                    escreva("Insira o tempo (em horas): ")
                    leia(tempo)
                    se (tempo < 0) {
                        escreva("Valor do tempo inválido. Tente Novamente")
                    } senao {
                        velocidade = espaco / tempo
                        escreva("A velocidade média do veículo é de "+velocidade+"Km/h")
                    }
                }
            }
        }
        
        */
        
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
