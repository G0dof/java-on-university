package Desafio;

import java.util.Scanner;

public class Tabuada3 {
    public void calcularTabuada() {
        Scanner leia = new Scanner(System.in);
        String resp = "s";

        while (resp.toLowerCase().charAt(0) == 's') {
            System.out.print("\033[1;36mInsira um número para realizar a tabuada: ");
            int num = leia.nextInt();
            System.out.print("\033[36mInsira quantas vezes deseja multiplicar: ");
            int _final = leia.nextInt();
            int cont = 1;

            while (cont <= _final) {
                System.out.printf("\033[34m%d x %d = \033[33m%d%n", num, cont, num * cont);
                cont++;
            }
            System.out.print("\033[32mDeseja continuar? (sim | não): ");
            resp = leia.next();
        }

        System.out.println("\033[31mLoop finalizado!");
    }
}
