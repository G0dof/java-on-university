import java.util.Scanner;

public class Curso {
    Scanner leia = new Scanner(System.in);
    String nome;
    int quantidadeAlunos;
    String turma;
    float mensalidade;

    public Curso() {
    }

    public Curso(String n, int q, String t, float m) {
        nome = n;
        quantidadeAlunos = q;
        turma = t;
        mensalidade = m;
    }

    public void cadastraCurso() {
        System.out.print("\nInsira o nome do curso: ");
        nome = leia.nextLine();
        System.out.print("Insira a quantidade de alunos: ");
        quantidadeAlunos = leia.nextInt();
        System.out.print("Insira qual a turma: ");
        turma = leia.next();
        System.out.print("Insira o valor da mensalidade: ");
        mensalidade = leia.nextFloat();
    }

    public void imprimeDados() {
        System.out.printf("Nome do curso: %s%n", nome);
        System.out.printf("Quantidade de alunos: %d%n", quantidadeAlunos);
        System.out.printf("Turma: %s%n", turma);
        System.out.printf("Valor da mensalidade: R$%f%n", calculaTotalMensalidade());
    }

    public Float calculaTotalMensalidade() {
        if (mensalidade > 350) {
            return mensalidade + (mensalidade * 0.3f);
        }
        return mensalidade;
    }
}
