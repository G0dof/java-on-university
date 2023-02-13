package Aula08;

import java.util.Scanner;
import javax.swing.*;
import java.io.*;

public class Exercicio {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        JFileChooser seletorDeArquivo = new JFileChooser();
        int numeros[] = new int[10];
        
        seletorDeArquivo.setDialogTitle("Selecione o arquivo para salvar...");
        int opcSelecionada = seletorDeArquivo.showSaveDialog(new JFrame());
        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o "+(i+1)+"º valor:", "Valores", JOptionPane.PLAIN_MESSAGE));
        }

        if (opcSelecionada == JFileChooser.APPROVE_OPTION) {
            try {
                FileWriter gravador = new FileWriter(seletorDeArquivo.getSelectedFile(), true);

                BufferedWriter bufGravador = new BufferedWriter(gravador);

                bufGravador.write("Você inseriu os seguintes valores:");
                bufGravador.newLine();
                for(int numero : numeros) {
                    bufGravador.write(""+numero);
                    bufGravador.newLine();
                }

                bufGravador.close();
                gravador.close();

                JOptionPane.showMessageDialog(null, "Gravação ok...");
            } catch (Exception erro) {
                JOptionPane.showMessageDialog(null, "Erro na gravação..." + erro.getMessage());
            }
        }

        System.exit(0);
    }
}
