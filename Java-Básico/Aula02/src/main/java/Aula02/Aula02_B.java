package Aula02;

import javax.swing.JOptionPane;

public class Aula02_B {

    public static void main(String[] args) {
        float peso, estatura, imc;

        peso = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite seu peso (em kilos):", "Índice de massa corporal", JOptionPane.PLAIN_MESSAGE));
        estatura = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite sua estatura (em metros):", "Índice de massa corporal", JOptionPane.PLAIN_MESSAGE));
        imc = peso / (float) Math.pow(estatura, 2);

        JOptionPane.showMessageDialog(null, "O seu IMC: " + imc + "Kg/m2", "Resultado", JOptionPane.PLAIN_MESSAGE);
    }
}
