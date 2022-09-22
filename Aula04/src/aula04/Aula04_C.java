package aula04;

import java.util.Scanner;

class Aula04_C {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int parcelas;
        float valorTotal;

        System.out.print("Insira o valor total da compra: ");
        valorTotal = leia.nextFloat();

        System.out.print("Insira quantas parcelas deseja fazer o pagamento: \n\n1 parcela (0% de juros)\n2 parcela (2% de juros)\n4 parcela (5% de juros)\n6 parcela (10% de juros)\n12 parcela (18% de juros)\n24 parcela (26% de juros)\n\n-> ");
        parcelas = leia.nextInt();

        switch (parcelas) {
            case 1:
                System.out.printf("%nVocê pagará R$%.2f á vista", valorTotal);
                break;

            case 2:
                System.out.printf("%nO valor valor das prestações será R$%.2f nas 2 parcelas", (valorTotal + (valorTotal * 0.02))/parcelas);
                break;

            case 4:
                System.out.printf("%nO valor valor das prestações será R$%.2f nas 4 parcelas", (valorTotal + (valorTotal * 0.05))/parcelas);
                break;

            case 6:
                System.out.printf("%nO valor valor das prestações será R$%.2f nas 6 parcelas", (valorTotal + (valorTotal * 0.10))/parcelas);
                break;

            case 12:
                System.out.printf("%nO valor valor das prestações será R$%.2f nas 12 parcelas", (valorTotal + (valorTotal * 0.18))/parcelas);
                break;

            case 24:
                System.out.printf("%nO valor valor das prestações será R$%.2f nas 24 parcelas", (valorTotal + (valorTotal * 0.26))/parcelas);
                break;

            default:
                System.out.printf("Parcela inválida!");
                break;
        }

    }
}