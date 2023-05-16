import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite o tamanho do array: ");
        int n = leia.nextInt(), media = 0;

        int arr[] = new int[n];

        for(int i =0;i<arr.length;i++){
            System.out.print("Insira um valor do "+(i+1)+"º número: ");
            arr[i] = leia.nextInt();
            media += arr[i];
        }
        media /= n;

        System.out.printf("A média dos elementos do array é %d%n", media);
    }
}
