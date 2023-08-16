public class Exercicio3 {

    public static void main(String[] args) {
        String paisesA[] = {"Ucrânia", "Turquia", "Suíça", "México", "França", "Espanha", "Chile", "Brasil", "Argentina"};
        String paisesB[] = {"Argentina", "Brasil", "Chile", "Dinamarca", "Espanha", "França", "Inglaterra", "Turquia", "Uruguai"};
        String paisesC[] = {"Canadá", "Áustria", "Chile", "Itália", "Portugal", "Grécia", "Angola", "Moçambique", "Rússia"};

        String alvo = "Brasil";

        System.out.println("------------ Busca sequencial ------------");
        System.out.println("Posição do(a) " + alvo + " no vetor paisesA: " + buscaSequencial(paisesA, alvo));
        System.out.println("Posição do(a) " + alvo + " no vetor paisesB: " + buscaSequencial(paisesB, alvo));
        System.out.println("Posição do(a) " + alvo + " no vetor paisesC: " + buscaSequencial(paisesC, alvo));

        System.out.println("\n------------ Busca binária | Lista crescente ------------");
        System.out.println("Posição do(a) " + alvo + " no vetor paisesB: " + buscaBinariaCrescente(paisesB, alvo));

        alvo = "Nicaragua";

        System.out.println("Posição do(a) " + alvo + " no vetor paisesB: " + buscaBinariaCrescente(paisesB, alvo));

        alvo = "Nova Zelância";

        System.out.println("\n------------ Busca binária | Lista decrescente ------------");
        System.out.println("Posição do(a) " + alvo + " no vetor paisesA: " + buscaBinariaEmListaDecrescente(paisesA, alvo));

        alvo = "Grécia";

        System.out.println("Posição do(a) " + alvo + " no vetor paisesA: " + buscaBinariaEmListaDecrescente(paisesA, alvo));

    }

    public static int buscaSequencial(String vet[], String alvo) {
        for (int i = 0; i < vet.length; i++) {
            if (vet[i].equals(alvo)) {
                return i;
            }
        }
        return -1;
    }

    public static int buscaBinariaCrescente(String vet[], String alvo) {
        int inicio = 0;
        int fim = vet.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            int comparacao = alvo.compareTo(vet[meio]);
            if (comparacao == 0) {
                return meio;
            } else if (comparacao < 0) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }
        return -1;
    }

    public static int buscaBinariaEmListaDecrescente(String vet[], String alvo) {
        int inicio = 0;
        int fim = vet.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (vet[meio].equals(alvo)) {
                return meio;
            } else if (vet[meio].compareTo(alvo) < 0) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }

        return -1;
    }
}
