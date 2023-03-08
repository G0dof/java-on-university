import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("-------------- PACIENTES --------------");

        Paciente paciente1 = new Paciente();

        System.out.print("Digite o seu nome: ");
        paciente1.nome = leia.nextLine();
        System.out.print("Insira o seu RG: ");
        paciente1.rg = leia.nextLine();
        System.out.print("Informe o seu endereço: ");
        paciente1.endereco = leia.nextLine();
        System.out.print("Insira o seu telefone: ");
        paciente1.telefone = leia.nextLine();
        System.out.print("Qual a sua data de nascimento? ");
        paciente1.dataNascimento = leia.nextLine();
        System.out.print("Qual a sua profissão? ");
        paciente1.profissao = leia.nextLine();

        paciente1.mostrarDados(1, paciente1.nome, paciente1.rg, paciente1.endereco, paciente1.telefone, paciente1.dataNascimento, paciente1.profissao);

        String n = "José";
        String r = "50.325.913-1";
        String e = "Rua Michael Jackson, nº420";
        String t = "+55(11)91235-5121";
        String d = "11/09/2001";
        String p = "Carpinteiro";


        Paciente paciente2 = new Paciente(n, r, e, t, d, p);
        paciente2.mostrarDados(2, n, r, e, t, d, p);

        System.out.println("--------------------------------------");

        System.out.println("-------------- PRODUTOS --------------");

        Produto produto1 = new Produto();

        System.out.print("Digite o nome da marca: ");
        String marca = leia.nextLine();
        System.out.print("Insira o nome da fabricante: ");
        String fabricante = leia.nextLine();
        System.out.print("Digite o código de barras do produto: ");
        String cod_barras = leia.nextLine();
        System.out.print("Insira o preço do produto: ");
        float preco = leia.nextFloat();

        produto1.mostrarDados(1, marca, fabricante, cod_barras, preco);

        Produto produto2 = new Produto("Gigabyte", "GIGABYTE Technologies", "012345678905", 1299.22f);
        produto2.mostrarDados(2, produto2.marca, produto2.fabricante, produto2.cod_barras, produto2.preco);
    }
}
