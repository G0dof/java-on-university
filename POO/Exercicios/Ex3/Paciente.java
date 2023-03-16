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
        nome = leia.next();
        rg = leia.next();
        endereco = leia.next();
        telefone = leia.next();
        anoNascimento = leia.nextInt();
        profissao = leia.next();
    }

    public void imprimeDados(){

    }

    public Integer calculaIdade(int anoAtual) {
        int idade = anoAtual-anoNascimento;
        return idade;
    }
}
