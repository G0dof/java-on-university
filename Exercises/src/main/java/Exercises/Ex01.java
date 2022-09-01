package Exercises;

import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * @author Pedro Ferreira Sudre
 * realizado dia 31/08/2022
 */

public class Ex01 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double x1, x2, y1, y2, formula;

        /*
        System.out.print("Digite o valor do ponto x1: ");
        x1 = leia.nextDouble();
        System.out.print("Digite o valor do ponto x2: ");
        x2 = leia.nextDouble();
        System.out.print("Digite o valor do ponto y1: ");
        y1 = leia.nextDouble();
        System.out.print("Digite o valor do ponto y2: ");
        y2 = leia.nextDouble();
        */
        // OR
        x1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do ponto x1: ", "Exercício 1", JOptionPane.PLAIN_MESSAGE));
        x2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do ponto x2: ", "Exercício 1", JOptionPane.PLAIN_MESSAGE));
        y1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do ponto y1: ", "Exercício 1", JOptionPane.PLAIN_MESSAGE));
        y2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do ponto y2: ", "Exercício 1", JOptionPane.PLAIN_MESSAGE));
        formula = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        // System.out.printf("A distância entre os pontos P1(%.1f, %.1f) e P2(%.1f, %.1f) é %.2f%n", x1, y1, x2, y2, formula);
        // OR
        JOptionPane.showMessageDialog(null, "A distância entre os pontos P1(" + x1 + ", " + y1 + ") e P2(" + x2 + ", " + y2 + ") é " + formula);

    }
}
