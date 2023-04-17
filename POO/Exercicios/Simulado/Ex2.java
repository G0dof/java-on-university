import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Insira o valor de A: ");
        int A = leia.nextInt();
        System.out.print("Insira o valor de B: ");
        int B = leia.nextInt();
        System.out.print("Insira o valor de C: ");
        int C = leia.nextInt();

        System.out.println("Ordem normal: " + A + " " + B + " " + C);

        System.out.print("Ordem crescente: ");
        bubbleSort(A, B, C, 1);
        System.out.print("Ordem decrescente: ");
        bubbleSort(A, B, C, 2);
    }

    public static void bubbleSort(int a, int b, int c, int forma) {
        int vetor[] = new int[3];
        vetor[0] = a;
        vetor[1] = b;
        vetor[2] = c;

        // Crescente
        if (forma == 1) {
            for (int i = 0; i < vetor.length - 1; i++) {
                int tmp;
                for (int j = 0; j < vetor.length - 1; j++) {
                    if (vetor[j] > vetor[j + 1]) {
                        tmp = vetor[j];
                        vetor[j] = vetor[j + 1];
                        vetor[j + 1] = tmp;
                    }
                }
            }
        }

        // Decrescente
        if (forma == 2) {
            for (int i = 0; i < vetor.length - 1; i++) {
                int tmp;
                for (int j = 0; j < vetor.length - 1; j++) {
                    if (vetor[j] < vetor[j + 1]) {
                        tmp = vetor[j];
                        vetor[j] = vetor[j + 1];
                        vetor[j + 1] = tmp;
                    }
                }
            }
        }

        for (int num : vetor) {
            System.out.print(" " + num + " ");
        }
        System.out.println();
    }
}
