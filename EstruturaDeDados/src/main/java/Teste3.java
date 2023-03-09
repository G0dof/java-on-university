import java.util.Scanner;

public class Teste3 {
	public static void main(String[] args){
		Scanner leia = new Scanner(System.in);
		int q = 0;
		int n = leia.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n; j++) {
				for (int k = 0; k < n; k++) {
					q = q + 1;
				}
			}
		}
		System.out.println("q foi executado "+q+" vezes");
		System.out.println("E o valor de q utilizando a fórmula é: "+ (n*(n-1))*n );
	}
}

