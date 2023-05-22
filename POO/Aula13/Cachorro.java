// Subclasse
class Cachorro extends Animal{

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }
    @Override // Sobrescreve o método da class Animal
    public void emitirSom(){
        System.out.println("O cachorro está latindo");
    }
}
