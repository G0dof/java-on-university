package Aula04;

import java.util.Scanner;

public class Aula04_B {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int mes;

        System.out.print("Digite o número do mês: ");
        mes = leia.nextInt();

        switch (mes) {
            case 1:
                System.out.println("Você está no mês de Janeiro");
                break;
            case 2:
                System.out.println("Você está no mês de Fevereiro");
                break;
            case 3:
                System.out.println("Você está no mês de Março");
                break;
            case 4:
                System.out.println("Você está no mês de Abril");
                break;
            case 5:
                System.out.println("Você está no mês de Maio");
                break;
            case 6:
                System.out.println("Você está no mês de Junho");
                break;
            case 7:
                System.out.println("Você está no mês de Julho");
                break;
            case 8:
                System.out.println("Você está no mês de Agosto");
                break;
            case 9:
                System.out.println("Você está no mês de Setembro");
                break;
            case 10:
                System.out.println("Você está no mês de Outubro");
                break;
            case 11:
                System.out.println("Você está no mês de Novembro");
                break;
            case 12:
                System.out.println("Você está no mês de Dezembro");
                break;
        
            default:
                System.out.println("Mês inexistente");
                break;
        }
    }
}
