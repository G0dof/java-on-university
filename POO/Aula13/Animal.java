// Superclasse
public class Animal{
    public String nome;
    public int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void emitirSom(){
        System.out.println("O animal está emitindo um som.");
    }

    public void mover(){
        System.out.println("O animal está se movendo.");
    }
}
