import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int sexMasc = 0, sexFem = 0, pessoasSim = 0, pessoasMax = 10;
        String sexo, resp;
        for (int i = 0; i < pessoasMax; i++) {
            System.out.print("Por favor. insira seu sexo: ");
            sexo = leia.next().toLowerCase();
            System.out.println("Qual a sua resposta? (Sim ou Não): ");
            resp = leia.next().toLowerCase();

            if (resp.charAt(0) == 's') {
                pessoasSim += 1;
                if (sexo.charAt(0) == 'm') {
                    sexMasc += 1;
                }

            } else {
                if (sexo.charAt(0) == 'f') {
                    sexFem += 1;
                }
            }

        }
        System.out.printf("%d pessoas do sexo masculino responderam sim%n", sexMasc);
        System.out.printf("%d pessoas do sexo feminino responderam não%n", sexFem);
        System.out.printf("%d pessoas responderam sim%n", pessoasSim);
        System.out.printf("%d pessoas responderam não%n", pessoasMax - pessoasSim);
    }
}
