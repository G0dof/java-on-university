package Exercises;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        float valorProduto, valorTotal, prestacao;
        int parcelas;

        System.out.print("Insira o valor do produto: ");
        valorProduto = leia.nextFloat();
        System.out.print("Insira a quantidade desejada de parcelas: \n\n"
                + "- Se o pagamento for parcelado em 2 ou 3 vezes  será dado um acréscimo de 10% no total a ser pago\n" + ""
                + "- Se for parcelado em 4 ou mais vezes, o acréscimo será de 20%.\n\n-> ");
        parcelas = leia.nextInt();

        if (parcelas == 1) {
            System.out.printf("O valor total de seu produto será de R$%.2f à vista", valorProduto);
        } else {
            if (parcelas <= 3) {
                valorTotal = (float) (valorProduto + (valorProduto * 0.1));
                prestacao = valorTotal / parcelas;
            } else {
                valorTotal = (float) (valorProduto + (valorProduto * 0.2));
                prestacao = valorTotal / parcelas;
            }
            System.out.printf("O valor total de seu produto será de R$%.2f, e a prestação mensal, "
                    + "referente ao pagamento parcelado, será de R$%.2f", valorTotal, prestacao);
        }
    }
}
