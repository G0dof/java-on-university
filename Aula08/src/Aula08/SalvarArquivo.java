package Aula08;

import javax.swing.*;
import java.io.*;

public class SalvarArquivo {

    public static void main(String[] args) {
        JFileChooser seletorDeArquivo = new JFileChooser(); //
        seletorDeArquivo.setDialogTitle("Selecione o arquivo para salvar...");

        int opcSelecionada = seletorDeArquivo.showSaveDialog(new JFrame());

        if (opcSelecionada == JFileChooser.APPROVE_OPTION) {
            try {
                FileWriter gravador = new FileWriter(seletorDeArquivo.getSelectedFile(), false);
                // Cria o objeto leitor da classe FileReader, e possui o parâmetro para gravar um arquivo

                //falso: significa que vamos criar um arquivo, este será deletado caso exista
                //true: será usado se desejamos escrever no final do arquivo
                BufferedWriter bufGravador = new BufferedWriter(gravador);
                // Servem para escrever em arquivos de texto

                // Vamos gravar algumas linhas no arquivo...
                bufGravador.write("Estas são várias linhas de texto. Esta é a primeira.");
                bufGravador.newLine();
                bufGravador.write("Agora gravamos a segunda linha de texto.");
                bufGravador.newLine();
                bufGravador.write("Esta será a terceira linha gravada.");
                bufGravador.newLine();
                bufGravador.newLine();
                bufGravador.write("E, finalmente, gravamos uma quarta linha.");
                bufGravador.newLine();

                //fechamos o arquivo:
                bufGravador.close();
                gravador.close();

                JOptionPane.showMessageDialog(null, "Gravação Ok...");
            } catch (Exception erro) { //caso haja problemas na leitura do arquivo...
                JOptionPane.showMessageDialog(null, "Erro na gravação..." + erro.getMessage());
            }
        }

        System.exit(0);
    }

}
