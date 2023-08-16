package Exercicios.Ex3;

public class Exercicio2 {

    public static void main(String[] args) {
       int numeros [] = { 4, 2, 10, 123, -3, 32, 0, 34, 12, 91, 45, 3, 21, 87, 61};
        selectionSort(numeros);
    }

    public static boolean selectionSort(int vetor[]) {
        if (vetor == null) return false;
        System.out.println("Vetor normal:");
        for(int num : vetor) {
            System.out.print(" "+num+" ");
        }
        for (int i = 0; i < vetor.length; i++) {
            int posMaior = i;
            int maior = vetor[i];
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] > maior) {
                    posMaior = j;
                    maior = vetor[j];
                }
            }
            int temp = vetor[i];
            vetor[i] = maior; 
            vetor[posMaior] = temp;
        }
        System.out.println("\nVetor ordenado (ordem decrescente):");
        for(int num : vetor){
            System.out.print(" "+num+" ");
        }
        return true;
    }
}
