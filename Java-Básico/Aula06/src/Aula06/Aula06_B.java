package Aula06;

import java.util.Scanner;

public class Aula06_B {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String nomes[], nome, resp = "sim";
        int n, controle = 0;

        System.out.print("Digite o tamanho do vetor: ");
        n = leia.nextInt();

        nomes = new String[n];
        do {
            for (int i = 0; i < n; i++) {
                System.out.printf("Digite o %dº nome: ", i + 1);
                nomes[i] = leia.next();
            }

            System.out.print("\nDigite o nome do aluno a ser localizado: ");
            nome = leia.next();
            for (int i = 0; i < nomes.length; i++) {
                if (nomes[i].equalsIgnoreCase(nome)) {
                    System.out.printf("O aluno %s foi localizado%n", nome);
                    controle = 1;
                }
            }
            if (controle == 0)
                System.out.printf("O aluno %s não foi localizado%n", nome);
            System.out.print("Deseja continuar o código: ");
            resp = leia.next();
        } while (resp.equalsIgnoreCase("sim"));
    }
}
