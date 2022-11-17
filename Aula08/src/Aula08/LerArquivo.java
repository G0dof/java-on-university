package Aula08;

import java.io.*;
import javax.swing.*;

public class LerArquivo {

  public static void main( String [] args ) {
       JFileChooser qarquivo = new JFileChooser();
       qarquivo.setDialogTitle("Abrir o arquivo");

       int opcao = qarquivo.showOpenDialog(new JFrame());

       if (opcao == JFileChooser.APPROVE_OPTION) {
          try
          {
          FileReader leitor  = new FileReader( qarquivo.getSelectedFile() );
          BufferedReader leitorBuffer = new BufferedReader( leitor );

          String linha = "";
          String texto = "";
          while( linha != null ) {
                linha = leitorBuffer.readLine( );  // ler a próxima linha
                if(linha!=null) texto += linha + "\n";
          }
          leitorBuffer.close( );
          leitor.close();
          JOptionPane.showMessageDialog(null,texto);
          }
          catch(FileNotFoundException arquivo_nao_encontrado) {
            JOptionPane.showMessageDialog(null, "O arquivo " + qarquivo.getSelectedFile() + " não existe.", "Erro fatal",JOptionPane.ERROR_MESSAGE );
          }
          catch (IOException erro_de_io) { //caso haja problemas na leitura do arquivo...
            JOptionPane.showMessageDialog(null, "Outro erro.", "Erro", JOptionPane.ERROR_MESSAGE );
          }
    }
    System.exit(0);
  }

}