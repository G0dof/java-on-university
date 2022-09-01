package Aula02;

import javax.swing.JOptionPane;

public class Aula03_C {

    public static void main(String[] args) {
        float altura, raio, volume;
        
        altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a altura do cilindro:", "Volume", JOptionPane.PLAIN_MESSAGE));
        raio = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a raio do cilindro:", "Volume", JOptionPane.PLAIN_MESSAGE));
        volume = (float) (Math.PI * Math.pow(raio, 2) * altura);
        
        JOptionPane.showMessageDialog(null, "O volume da lata é: "+volume, "Resultado", JOptionPane.PLAIN_MESSAGE);
    }
}
