package Aula05;

import java.util.Scanner;

public class Aula05_A {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        float nota1, nota2, media;
        int cont = 1;

        while(cont <=10) {
            System.out.printf("Digite a primeira nota do %dº aluno: ",cont);
            nota1 = leia.nextFloat();

            System.out.printf("Digite a segunda nota do %dº aluno: ",cont);
            nota2 = leia.nextFloat();

            media = (nota1 + nota2) / 2;
    
            System.out.printf("%nA média do %dº aluno é %.2f%n%n", cont, media);
            cont++;
        }
    }
}
