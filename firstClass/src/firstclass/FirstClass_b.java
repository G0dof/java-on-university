package firstclass;
import java.util.Scanner;

public class FirstClass_b {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        float num1, num2, soma, sub, mult, resto;
        
        System.out.print("Digite um número: ");
        num1 = leia.nextFloat();
        System.out.print("Digite outro número: ");
        num2 = leia.nextFloat();
        
        soma = num1+num2;
        sub = num1-num2;
        mult = num1*num2;
        resto = num1%num2;
        System.out.println("A partir dos números "+num1+" e "+num2+", podemos efetuar as seguintes operações:");
        System.out.println("SOMA: "+soma+" | SUBTRAÇÃO: "+sub+" | MULTIPLICAÇÃO: "+mult+" | MÓDULO: "+resto);

    }
}
