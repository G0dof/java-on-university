package Exercises;

import java.util.Scanner;

/*
 * @author Pedro Ferreira Sudre
 * realizado dia 18/09/2022
 */
public class Ex04 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int num1, num2;
        char operador;

        System.out.print("Digite um número: ");
        num1 = leia.nextInt();
        System.out.print("Digite outro número: ");
        num2 = leia.nextInt();
        System.out.print("Digite a operação a ser realizada: \n\n(+) Soma\n(-) Subtração\n(*) Multiplicação\n(/) Divisão\n(%) Módulo\n\n-> ");
        operador = leia.next().charAt(0);

        switch (operador) {
            case '+':
                System.out.printf("A soma entre os números %d e %d é %d%n", num1, num2, num1 + num2);
                break;

            case '-':
                System.out.printf("A subtração entre os números %d e %d é %d%n", num1, num2, num1 - num2);
                break;

            case '*':
                System.out.printf("A multiplicação entre os números %d e %d é %d%n", num1, num2, num1 * num2);
                break;

            case '/':
                System.out.printf("A divisão entre os números %d e %d é %d%n", num1, num2, num1 / num2);
                break;

            case '%':
                System.out.printf("O resto da divisão entre os números %d e %d é %d%n", num1, num2, num1 % num2);
                break;

            default:
                System.out.println("Opção inválida!");
        }
    }
}
