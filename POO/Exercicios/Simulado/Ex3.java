import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int num, pos = 0, neg = 0;
        String resp = "s";

        do {
            System.out.print("Insira um número positivo ou negativo: ");
            num = leia.nextInt();

            if (num >= 0) {
                pos += num;
            } else neg += num;

            System.out.print("Deseja continuar? (Sim ou Não): ");
            resp = leia.next().toLowerCase();
        } while (resp.toLowerCase().charAt(0) == 's');

        System.out.printf("A soma dos números positivos é %d%n", pos);
        System.out.printf("A soma dos números negativos é %d%n", neg);
        System.out.printf("A soma dos números parciais é %d%n", pos + (neg));
    }
}
