import java.util.Scanner;

public class Teste2 {
	public static void main(String[] args){
		Scanner leia = new Scanner(System.in);
		int n = leia.nextInt();
		int k = 0, i = n;
		System.out.println("---------------------------");
		System.out.println("n    k    i");
		while(i>0){
			k+=1;
			i/=10;
			System.out.println(n+"    "+k+"    "+i);
		}
		System.out.println("---------------------------");
		System.out.printf("Ao final do loop, k vale %d%n", k);
	}
}
