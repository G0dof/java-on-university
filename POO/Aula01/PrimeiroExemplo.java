import java.util.Scanner;

public class PrimeiroExemplo {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String palavra = leia.nextLine();
        for (int i = 0; i < 10; i++) {
            System.out.println(palavra);
        }
    }
}
