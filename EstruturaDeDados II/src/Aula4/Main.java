public class Main {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<Integer>();

        System.out.println(pilha.estaVazia());

        for(int i=1;i<=10;i++) pilha.empilha(i);

        System.out.println(pilha.estaVazia());

        pilha.empilha(1);
        System.out.println(pilha.topo());

        System.out.println("Desempilhar elemento: "+pilha.desempilha());
        System.out.println(pilha);

        pilha.empilha(6);
        System.out.println(pilha.topo());

        System.out.println(pilha);
        System.out.println(pilha.tamanho);
    }
}
