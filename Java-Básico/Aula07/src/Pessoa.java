
public class Pessoa { // Uma classe é um molde, a partir da qual podemos criar objetos

    String nome;
    int idade;
    float altura;
    String usuario;
    String senha;
    boolean falecido;

    // Nas linhas acima, foram criados os atributos da classe
    public Pessoa() { //Construtor vazio
        falecido = false;
    }

    public Pessoa(String nome, int idade,
            float altura, String usuario, String senha) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.usuario = usuario;
        this.senha = senha;
    }

    /*
     * Nas linhas acima, criamos os métodos construtores, que deverão possuir o mesmo nome da classe;
     * Os métodos construtores são utilizados para criar os objetos da classe, para tarefas de inicialização do objeto
     */
    public void andar() {
        System.out.println("Esta pessoa sabe andar");
    }

    public void tossir() {
        System.out.println("Esta pessoa sabe tossir");
    }

    // 
}
