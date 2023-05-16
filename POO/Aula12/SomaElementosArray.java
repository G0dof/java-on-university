import java.util.Scanner;

public class SomaElementosArray {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite o tamanho do array: ");
        int n = leia.nextInt(), soma = 0;

        int arr[] = new int[n];

        for(int i =0;i<arr.length;i++){
            System.out.print("Insira um valor do "+(i+1)+"º número: ");
            arr[i] = leia.nextInt();
            soma += arr[i];
        }

        System.out.printf("A soma de todos os elementos do array é: \033[31m%d\033[m%n",soma);
    }
}