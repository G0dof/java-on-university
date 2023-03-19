package Exercicios.Ex3;

public class Exercicio1 {

    public static void main(String[] args) {
        String paises[] = {"México", "Brasil", "Cuba", "Chile", "Argentina", "Espanha", "Nova Zelândia", "Estados Unidos"};

        bubbleSort(paises);
    }

    public static void bubbleSort(String vet[]) {
        System.out.println("Vetor normal:");
        for(String pais: vet) {
            System.out.print(" "+pais+" ");
        }
        for (int i = 0; i < vet.length - 1; i++) {
            for (int j = 0; j < vet.length - 1 - i; j++) {
                if (vet[j].compareToIgnoreCase(vet[j + 1]) > vet[j + 1].compareToIgnoreCase(vet[j])) {
                    String tmp = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = tmp;
                }
            }
        }
        System.out.println("\nVetor ordenado (alfabeticamente):");
        for (String pais : vet) {
            System.out.print(" " + pais + " ");
        }
    }
}
