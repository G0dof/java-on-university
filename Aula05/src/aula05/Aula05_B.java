package aula05;

import java.util.Scanner;

public class Aula05_B {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        float x, r;
        String resp = "sim";

        while(resp.equalsIgnoreCase("sim") || resp.equalsIgnoreCase("s")) {
            System.out.println("Insira o valor de x: ");
            x = leia.nextFloat();
            r = x*3;
            System.out.println(r);

            System.out.println("Deseja continuar (sim/não): ");
            resp = leia.nextLine();
        }
    }
}