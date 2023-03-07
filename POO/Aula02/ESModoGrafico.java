import javax.swing.*;

public class ESModoGrafico {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "DELETING SYSTEM32...","ERROR", JOptionPane.ERROR_MESSAGE);

        String nome = JOptionPane.showInputDialog(null, "Digite seu nome: ", "NOME", JOptionPane.PLAIN_MESSAGE);
        int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua idade: ", "IDADE", JOptionPane.PLAIN_MESSAGE));

        JOptionPane.showMessageDialog(null, "Olá "+nome+", você tem "+idade+" anos de idade", "DADOS INFORMADOS", JOptionPane.PLAIN_MESSAGE);
    }
}
