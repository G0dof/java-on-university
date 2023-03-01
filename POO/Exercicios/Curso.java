package Exercicios;

public class Curso {

    String grauAcademico;
    String cursoEscolhido;
    String modalidade;
    String periodo;
    int qtdSemestres;

    public Curso() {

    }

    public Curso(String grauAcademico, String cursoEscolhido, String modalidade, String periodo, int qtdSemestres) {
        this.grauAcademico = grauAcademico;
        this.cursoEscolhido = cursoEscolhido;
        this.modalidade = modalidade;
        this.periodo = periodo;
        this.qtdSemestres = qtdSemestres;
    }
}
