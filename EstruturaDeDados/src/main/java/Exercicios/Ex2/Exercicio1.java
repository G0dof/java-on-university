package Exercicios.Ex2;

public class Exercicio1 {

    public static void main(String[] args) {
//        Elabore um método (e os testes necessários) para inverter
//        completamente os elementos guardados em um vetor.
//        Considere uma variável N que armazena a quantidade de
//        elementos reais do vetor e não seu tamanho alocado. Visualize
//        o vetor depois de invertido.

        double vet[] = {4.3, 6.1, 0.1, 1.9, 2.4, 7.2, 5.5};
        int n = vet.length;
        
        inverter(vet, n);
    }

    public static void inverter(double vet[], int n) {
        double vetIntertido[] = new double[n];
        double ultimoValorVet = vet[0];
        
        for(int i = 1; i < n; i++){
            vetIntertido[i-1] = vet[n-i];
        }
        vetIntertido[vetIntertido.length-1] = ultimoValorVet;
        
        for (double number : vetIntertido) {
            System.out.print(" "+number+" ");
        }
    }
}

