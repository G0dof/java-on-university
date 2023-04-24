import java.util.Scanner;

/*
 * NOME: PEDRO FERREIRA SUDRE
 */

public class Ex1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int impar = 0, somaImp = 0, somaPar = 0, num, qtdNum = 0;
        do {
            System.out.print("Insira um número: ");
            num = leia.nextInt();
            qtdNum++;

            if(num % 2 != 0) {
                somaImp += num;
                impar++;
            }
            else somaPar += num;

        } while (impar != 3);

        System.out.println("Soma de todos os números pares: "+somaPar);
        System.out.println("Soma dos números ímpares: "+somaImp);
        System.out.println("Soma de todos os números pares: "+(somaPar+somaImp));
        System.out.println("Quantidade de números inseridos: "+qtdNum);
    }
}