import javax.swing.*;

public class Principal {
    //Armazenaremos os dados dos trabalhadores da empresa em um vetor:
    private Trabalhador trab[];
    private int N;
    
public static void main(String[] args) {
    Principal principal = new Principal();
}

public Principal () {
    simulacaoLeituraDeDados() ;
    mostraTrabalhadoresCadastrados();
}

public void simulacaoLeituraDeDados() {
    //para efetuar testes rápidos, criamos um vetor de objetos com dados fixos:
    N = 7;
    trab = new Trabalhador[N];
    trab[0] = new Trabalhador("Julio",  2000f, 'M');
    trab[1] = new Trabalhador("Mariana",  1000, 'F');
    trab[2] = new Trabalhador("Renata",  800, 'F');
    trab[3] = new Trabalhador("Pedro",  1500f, 'M');
    trab[4] = new Trabalhador("Amilton",  6000f, 'M');
    trab[5] = new Trabalhador("Jorge",  2200f, 'M');
    trab[6] = new Trabalhador("Carlos",  3500f, 'M');

    quickSortNome(trab, 0, 6);
    quickSortSalario(trab, 0, 6);
}

public void leituraDeDados() {
        String umNome;
        float umSalario;
        char umSexo;
        N = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de trabalhadores:"));
        trab = new Trabalhador[N];   //aloca memória para o vetor

        for (int i = 0; i < N; i++) {
            umNome = JOptionPane.showInputDialog("Digite o nome do trabalhador " + (i + 1) + ": ");
            umSalario = Float.parseFloat(JOptionPane.showInputDialog("Digite o salário de " + umNome + ": "));
            umSexo = JOptionPane.showInputDialog("Digite o sexo deste trabalhador: ").charAt(0);
            umSexo = Character.toUpperCase(umSexo);
            trab[i] = new Trabalhador(umNome, umSalario, umSexo); //aloca memória para o objeto (e executa o método construtor com parâmetros)
            // a inicialização anterior do objeto poderia ser em etapas:
            //	trab[i] = new Trabalhador();  //usando o construtor sem parâmetros
            //	trab[i].setNome(umNome);
            //	trab[i].setSalario(umSalario);
            //	trab[i].setSexo(umSexo);
        }
}

public void mostraTrabalhadoresCadastrados () {
    String cad = "";
    for (int i=0; i<N; i++) {
      cad +=  trab[i].toString()+ "\n";
    }    
    JTextArea outputArea = new JTextArea(15,40);  //15 linhas e 40 colunas
    outputArea.setText(cad);
	JScrollPane rolagem = new JScrollPane(outputArea);
	JOptionPane.showMessageDialog(null,rolagem,"Dados dos trabalhadores cadastrados",
	                    JOptionPane.INFORMATION_MESSAGE);
}

//  Os métodos 'quickSort' e 'separar' a seguir ordenam um vetor de elementos de tipo double.
//  Crie  métodos para ordenar o vetor de objetos Trabalhador trab[]:
//  1) em ordem decrescente pelos salários, 2) em ordem crescente considerando o atributo nome.

    // 1 - Uma lógica para ordenar em ordem decrescente os dados do vetor de objetos de trabalhadores pelos salários dos trabalhadores
    public boolean quickSortSalario (Trabalhador vetor[], int inicio, int fim) {

        if (vetor == null) return false;
        if (inicio < fim) {
            int posicaoPivo = separarSalario(vetor, inicio, fim);
            quickSortSalario(vetor, inicio, posicaoPivo - 1);
            quickSortSalario(vetor, posicaoPivo + 1, fim);
        }
        return true;
    }

    private int separarSalario (Trabalhador vetor [], int inicio, int fim) {
        Trabalhador pivo = vetor[inicio];
        int i = inicio + 1, f = fim;
        while (i <= f) {
            if ( vetor[i].getSalario() >= pivo.getSalario()) i++;
            else if ( pivo.getSalario() > vetor[f].getSalario()) f--;
            else {
                Trabalhador troca = vetor[i];
                vetor[i] = vetor[f];
                vetor[f] = troca;
                i++;
                f--;
            }
        }
        vetor[inicio] = vetor[f];
        vetor[f] = pivo;
        return f;
    }

    // 2 - Uma lógica para ordenar em ordem crescente os dados do vetor de objetos de trabalhadores pelos nomes dos trabalhadores, ou seja, ordenação em ordem alfabética
 public boolean quickSortNome (Trabalhador vetor[], int inicio, int fim) {

        if (vetor == null) return false;
        if (inicio < fim) {
           int posicaoPivo = separarNome(vetor, inicio, fim);
            quickSortNome(vetor, inicio, posicaoPivo - 1);
            quickSortNome(vetor, posicaoPivo + 1, fim);
        }
        return true;
    }

    private int separarNome (Trabalhador vetor [], int inicio, int fim) {
        Trabalhador pivo = vetor[inicio];
        int i = inicio + 1, f = fim;
        while (i <= f) {
            if ( vetor[i].getNome().compareToIgnoreCase(pivo.getNome()) <= 0 ) i++;
            else if ( pivo.getNome().compareToIgnoreCase(vetor[f].getNome()) < 0 ) f--;
            else {
                Trabalhador troca = vetor[i];
                vetor[i] = vetor[f];
                vetor[f] = troca;
                i++;
                f--;
            }
        }
        vetor[inicio] = vetor[f];
        vetor[f] = pivo;
        return f;
    }


}
