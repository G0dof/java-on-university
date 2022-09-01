package Aula01;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Aula01_B {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        float num1, num2, soma, sub, mult, resto;

        /*
        System.out.print("Digite um número: ");
        num1 = leia.nextFloat();
        
        System.out.print("Digite outro número: ");
        num2 = leia.nextFloat();
         */
        
        num1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite um número"));
        num2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite outro número"));

        soma = num1 + num2;
        sub = num1 - num2;
        mult = num1 * num2;
        resto = num1 % num2;
        System.out.println("A partir dos números " + num1 + " e " + num2 + ", podemos efetuar as seguintes operações:");
        System.out.println("SOMA: " + soma + " | SUBTRAÇÃO: " + sub + " | MULTIPLICAÇÃO: " + mult + " | MÓDULO: " + resto);
        // OR
        JOptionPane.showMessageDialog(null, "SOMA: " + soma + " | SUBTRAÇÃO: " + sub + " | MULTIPLICAÇÃO: " + mult + " | MÓDULO: " + resto);
    }
}
