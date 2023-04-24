import java.util.Scanner;

/*
 * NOME: PEDRO FERREIRA SUDRE
 * RGM: 5829372437
 */


public class Ex2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String sexo, resp = "s";
        int idade, man80 = 0, wom20 = 0;

        do {
            System.out.print("Insira o sexo da pessoa (F - Feminino | M - Masculino): ");
            sexo = leia.next().toLowerCase();

            System.out.print("Insira a idade da pessoa: ");
            idade = leia.nextInt();

            if(sexo.charAt(0) == 'm') {
                if(idade > 80) man80++;
            }
            else if(sexo.charAt(0) == 'f'){
                if(idade < 20) wom20++;
            }else {
                System.out.println("Não possuímos pessoas com os parâmetros exigidos");
            }

            System.out.print("\nDeseja continuar? (Sim | Não): ");
            resp = leia.next().toLowerCase();
        }while(resp.charAt(0) == 's');

        System.out.println("\nHomens com mais de 80 anos: "+man80);
        System.out.println("Mulheres com menos de 20 anos: "+wom20);

    }
}