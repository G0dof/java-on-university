import java.util.Scanner;
public class Curso {
    Scanner leia = new Scanner(System.in);
    String nome;
    int quantidadeAlunos;
    String turma;
    float mensalidade;

    public Curso() {}

    public Curso(String n, int q, String t, float m) {
        nome = n;
        quantidadeAlunos = q;
        turma = t;
        mensalidade = m;
    }

    public void cadastraCurso(){
        nome = leia.next();
        quantidadeAlunos = leia.nextInt();
        turma = leia.next();
        mensalidade = leia.nextFloat();
    }
    public void imprimeDados(){

    }

    public Float calculaTotalMensalidade(){
        if (quantidadeAlunos >= 50){
            return  mensalidade+(mensalidade*0.5f);
        }
        return mensalidade;
    }
}
