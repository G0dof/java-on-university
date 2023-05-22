public class ExemploHeranca {
    public static void main(String[] args) {
        Animal animal = new Animal("Ari Aster", 50);
        System.out.printf("\033[31mNome:\033[m %s%n\033[33mIdade:\033[m %d%n", animal.nome, animal.idade);
        animal.emitirSom();
        animal.mover();
        System.out.println("------------------------------------------------");
        Cachorro cachorro = new Cachorro("Rex El Roses", 50);
        System.out.printf("\033[31mNome:\033[m %s%n\033[33mIdade:\033[m %d%n", cachorro.nome, cachorro.idade);
        cachorro.emitirSom();
        cachorro.mover();
    }
}
