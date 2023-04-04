package Desafio;

import java.util.Scanner;

public class Alunos {
    Scanner sc = new Scanner(System.in);
    String melhores = "";
    String[] alunosNome = new String[3];
    double[] alunosNota = new double[3];


    Alunos() {

    }

    public void melhorAluno() {
        for (int i = 0; i <= alunosNome.length - 1; i++) {
            double media = 0;

            System.out.printf("Qual a nome do %dº aluno? ", i + 1);
            String nome = sc.next();
            alunosNome[i] = nome;

            for (int j = 0; j <= alunosNota.length - 1; j++) {
                System.out.printf("Qual a %dª nota do %s? ", j + 1, alunosNome[i]);
                double nota = sc.nextDouble();
                alunosNota[j] = nota;

                media += alunosNota[j];
            }
            media /= alunosNota.length;

            if (media > 6) {
                melhores += " " + alunosNome[i] + " ";
            }

            System.out.println();
        }
        System.out.print("Parabéns!");
        System.out.println(melhores);
    }
}
