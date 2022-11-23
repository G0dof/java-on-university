
public class Aula07_A {

    public static void main(String[] args) {
        Pessoa goiabinha = new Pessoa(); // Criação de um objeto, a Instância da classe Pessoa || Construtor sem parâmetros
        System.out.println("Valores inseridos no objeto goiabinha");
        System.out.println("Nome: " + goiabinha.nome + " Idade: " + goiabinha.idade + " Altura: " + goiabinha.altura);
        System.out.println(goiabinha.falecido == false ? goiabinha.nome + " está morto" : goiabinha.nome + " está vivo");
        Pessoa roberwando = new Pessoa("Roberwando", 51, 1.74f, "rober", "123"); // Construtor com parâmetros
        System.out.println("\n Valores inseridos no objeto roberwaldo");
        System.out.println("\nNome: " + roberwando.nome
                + "\nIdade: " + roberwando.idade
                + "\nAltura: " + roberwando.altura);
        System.out.println(roberwando.falecido == false ? roberwando.nome + " está morto" : roberwando.nome + " está vivo");

        roberwando.andar();
        roberwando.tossir();
    }
}
