import java.util.Scanner;

public class ESModoTexto {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Insira seu nome: ");
        String nome = leia.nextLine();
        System.out.printf("Olá %S, seja bem vindo!%n", nome);

        System.out.print("Insira um número: ");
        int num1 = leia.nextInt();
        System.out.print("Insira outro número: ");
        int num2 = leia.nextInt();

        System.out.printf("A soma dos números %d e %d inseridos é %d%n", num1, num2, (num1 + num2));
    }
}
