package Exercises;

import java.util.Scanner;
import javax.swing.*;
import java.io.*;

public class Ex21 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numeros[] = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite o %dº número inteiro: ", i + 1);
            numeros[i] = leia.nextInt();
        }

        JFileChooser seletorDeArquivo = new JFileChooser();
        seletorDeArquivo.setDialogTitle("Selecione o arquivo para salvar...");

        int opcSelecionada = seletorDeArquivo.showSaveDialog(new JFrame());

        if (opcSelecionada == JFileChooser.APPROVE_OPTION) {
            try {
                FileWriter gravador = new FileWriter(seletorDeArquivo.getSelectedFile(), false);
                //falso: significa que vamos criar um arquivo, este será deletado caso exista
                //true: será usado se desejamos escrever no final do arquivo

                BufferedWriter bufGravador = new BufferedWriter(gravador);

                //vamos gravar algumas linhas no arquivo...
                bufGravador.write("Estas são várias linhas de texto. Esta é a primeira.");
                bufGravador.newLine();
                
                for(int numero : numeros) {
                    bufGravador.write(numero);
                    bufGravador.newLine();
                }

                //fechamos o arquivo:
                bufGravador.close();
                gravador.close();

                JOptionPane.showMessageDialog(null, "Gravação Ok...");
            } catch (Exception erro) {
                JOptionPane.showMessageDialog(null, "Erro na gravação..." + erro.getMessage());
            }
        }

        System.exit(0);
    }
}
