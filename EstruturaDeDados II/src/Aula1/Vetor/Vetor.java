package Aula1.Vetor;

import java.util.Arrays;

public class Vetor {
    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public void adiciona(String elemento) throws Exception {
        if (this.tamanho > this.elementos.length)
            throw new Exception("O vetor já está cheio, não é possível  adicionar novos elementos");

        this.elementos[this.tamanho] = elemento;
        this.tamanho++;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public String toString(){
        return Arrays.toString(elementos);
    }
}