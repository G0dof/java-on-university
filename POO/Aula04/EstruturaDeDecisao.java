import java.util.Scanner;

public class EstruturaDeDecisao {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
//        int hora = 4;
//
//        if (hora >= 0 && hora <= 5) System.out.println("Boa madrugada!");
//        else if (hora <= 12) System.out.println("Bom dia!");
//        else if (hora <= 18) System.out.println("Boa tarde!");
//        else System.out.println("Boa noite!");

//        int idade = 17;
//
//        if(idade >= 18) System.out.println("Pode entrar");
//        else System.out.println("Não pode entrar!");
//
//        String mensagem = (idade >= 18 ? "Pode entrar" : "Não pode entrar!");
//        System.out.println(mensagem);

        System.out.print("Idade: ");
        int idade = leia.nextInt();
        System.out.print("Sexo: ");
        char sexo = leia.next().toUpperCase().charAt(0);
        System.out.print("Anos de contribuição: ");
        int contribuicao = leia.nextInt();

        try {
            if (sexo != 'M' || sexo != 'F'){
                throw new Exception("Sexo não identificado. Tente novamente!");
            }else {
                if ((sexo == 'M' && idade >= 65 && contribuicao >= 15) || (sexo == 'F' && idade >= 62 && contribuicao >= 15)) {
                    System.out.println("Você obteve a aposentadoria por idade");
                } else if ((sexo == 'M' && idade >= 60 && contribuicao >= 35) || (sexo == 'F' && idade >= 57 && contribuicao >= 30)) {
                    System.out.println("Você obteve a aposentadoria por serviço");
                } else System.out.println("Você NÃO tem direito a aposentadoria");
            }
        }catch (Exception e){
            e.printStackTrace();
        }



    }
}
