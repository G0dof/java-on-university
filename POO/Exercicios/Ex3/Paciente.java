import java.util.Scanner;

public class Paciente {
    Scanner leia = new Scanner(System.in);

    String nome;
    String rg;
    String endereco;
    String telefone;
    int anoNascimento;
    String profissao;

    public Paciente() {
    }

    public Paciente(String n, String r, String e, String t, int a, String p) {
        nome = n;
        rg = r;
        endereco = e;
        telefone = t;
        anoNascimento = a;
        profissao = p;
    }

    public void cadastraDados(){
        System.out.print("\nInsira o seu nome: ");
        nome = leia.nextLine();
        System.out.print("Insira o seu RG: ");
        rg = leia.nextLine();
        System.out.print("Insira o seu endereço: ");
        endereco = leia.nextLine();
        System.out.print("Insira o seu telefone: ");
        telefone = leia.nextLine();
        System.out.print("Insira o ano de seu nascimento: ");
        anoNascimento = leia.nextInt();
        System.out.print("Insira a sua profissão: ");
        profissao = leia.next();
    }

    public void imprimeDados(){
        System.out.printf("Nome: %s%n", nome);
        System.out.printf("Idade: %s%n", calculaIdade(2023));
        System.out.printf("RG: %s%n", rg);
        System.out.printf("Endereço: %s%n", endereco);
        System.out.printf("Telefone: %s%n", telefone);
        System.out.printf("Ano de nascimento: %d%n", anoNascimento);
        System.out.printf("Profissão: %s%n", profissao);
    }

    public Integer calculaIdade(int anoAtual) {
        int idade = anoAtual-anoNascimento;
        return idade;
    }
}
