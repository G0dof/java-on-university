import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
//        String tipoCabelo = "branco";
//
//        switch (tipoCabelo) {
//            case "amarelo" -> System.out.println("Seu cabelo é branco");
//            case "preto" -> System.out.println("Seu cabelo é preto");
//            case "vermelho" -> System.out.println("Seu cabelo é vermelho");
//            case "ruivo" -> System.out.println("Seu cabelo é ruivo");
//            case "branco" -> System.out.println("Você é velho!");
//            default -> System.out.println("Você é calvo ou careca");
//        }

        System.out.print("\033[1mNota: ");
        int nota = leia.nextInt();

        switch (nota) {
            case 0,1,2:
                System.out.println("\033[31mReprovado direto");
                break;
            case 3,4,5:
                System.out.println("\033[33mVocê deve fazer o exame");
                break;
            case 6,7:
                System.out.println("\033[34mNão fez mais que a obrigação: Aprovado!");
                break;
            case 8,9,10:
                System.out.println("\033[32mExcelente!");
                break;
            default:
                System.out.println("\033[36mInválido!");
        }
    }
}
