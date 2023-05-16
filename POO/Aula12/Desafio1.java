import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite o tamanho do array: ");
        int n = leia.nextInt(), maior = -99999999, menor = 99999999;

        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Insira um valor do " + (i + 1) + "º número: ");
            arr[i] = leia.nextInt();
            if (arr[i] > maior) maior = arr[i];
            if (arr[i] < menor) menor = arr[i];
        }
        System.out.printf("Maior: %d | Menor: %d%n", maior, menor);

        // Bubble Sort
        for (int i = 0; i < arr.length - 1; i++) {
            int tmp;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        System.out.printf("Maior: %d | Menor: %d", arr[n - 1], arr[0]);

    }
}
