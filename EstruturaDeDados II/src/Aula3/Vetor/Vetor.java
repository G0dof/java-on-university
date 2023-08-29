package Aula1_2.Vetor;

public class Vetor {
    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public void adiciona(String elemento) throws Exception {
        this.aumentaCapacidade();
        this.elementos[this.tamanho] = elemento;
        this.tamanho++;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }

        s.append("]");

        return s.toString();
    }

    public String buscaPaia(int posicao) throws Exception {
        if (posicao >= 0 && posicao < tamanho) return elementos[posicao];
        else throw new Exception("Posição Inválida!");
    }

    public int buscaLinear(String buscado) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equalsIgnoreCase(buscado)) return i;
        }
        return -1;
    }

    public boolean adicionaInicio(int posicao, String elemento) throws Exception {
        if (!(posicao >= 0 && posicao < tamanho)) throw new Exception("Posição Inválida!");
        for (int i = this.tamanho - 1; i >= posicao; i--) this.elementos[i + 1] = this.elementos[i];
        this.elementos[posicao] = elemento;
        this.tamanho++;

        return true;
    }

    public void aumentaCapacidade() {
        if (this.tamanho != this.elementos.length) return;

        String[] elementosNovos = new String[this.elementos.length * 2];
        for (int i = 0; i < this.elementos.length; i++) elementosNovos[i] = this.elementos[i];
        this.elementos = elementosNovos;
    }

    public void remove(int posicao) throws Exception {
        if (!(posicao >= 0 && posicao < tamanho)) throw new Exception("Posição Inválida!");
        for (int i = posicao; i < this.tamanho - 1; i++) this.elementos[i] = this.elementos[i + 1];
        this.tamanho--;
    }
}