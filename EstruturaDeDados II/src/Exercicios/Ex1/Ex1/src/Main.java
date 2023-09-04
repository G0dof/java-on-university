import java.util.Scanner;
/*
Minha tarefa foi criar um programa Java que permite ao usuário gerenciar uma biblioteca de filmes.
O programa deve ser capaz de adicionar, remover, listar os filmes presentes na biblioteca.
*/
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Vetor bibliotecaFilmes = new Vetor(1);

        String exemploFilme = "Matrix (Dir: Wachowskis, Gênero: Ficção Científica)";
        bibliotecaFilmes.adiciona(exemploFilme);

        int escolha;
        do {
            System.out.println("\033[36m\n--- Biblioteca de Filmes - Menu ---\033[0m");
            System.out.println("1. \033[1mAdicionar Filme\033[0m");
            System.out.println("2. \033[1mRemover Filme\033[0m");
            System.out.println("3. \033[1mListar Filmes\033[0m");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1 -> {
                    System.out.print("Digite o nome do filme: ");
                    String nomeFilme = scanner.nextLine();
                    System.out.print("Digite o diretor do filme: ");
                    String diretorFilme = scanner.nextLine();
                    System.out.print("Digite o gênero do filme: ");
                    String generoFilme = scanner.nextLine();
                    String filmeInfo = nomeFilme + " (Diretor: " + diretorFilme + ", Gênero: " + generoFilme + ")";
                    try {
                        bibliotecaFilmes.adiciona(filmeInfo);
                        System.out.println("\033[32mFilme adicionado com sucesso!\033[0m");
                    } catch (Exception e) {
                        System.out.println("\033[31mErro ao adicionar o filme: " + e.getMessage() + "\033[0m");
                    }
                }
                case 2 -> {
                    if (bibliotecaFilmes.getTamanho() == 0) {
                        System.out.println("\033[31mA biblioteca de filmes está vazia. Não é possível remover filmes.\033[0m");
                    } else {
                        System.out.println("Biblioteca de Filmes antes da remoção:");
                        listarFilmes(bibliotecaFilmes);

                        System.out.print("Digite a posição do filme a ser removido: ");
                        int posicaoRemover = scanner.nextInt();
                        scanner.nextLine();
                        try {
                            String filmeRemovido = (String) bibliotecaFilmes.busca1(posicaoRemover);
                            bibliotecaFilmes.remove(posicaoRemover);
                            System.out.println("\033[32mFilme removido com sucesso - Índice " + posicaoRemover + ": " + filmeRemovido + "\033[0m");
                        } catch (Exception e) {
                            System.out.println("\033[31mErro ao remover o filme: " + e.getMessage() + "\033[0m");
                        }
                    }
                }
                case 3 -> listarFilmes(bibliotecaFilmes);
                case 4 -> System.out.println("\033[33mSaindo do programa...\033[0m");
                default ->
                        System.out.println("\033[31m\nOpção inválida. Por favor, escolha uma opção válida.\033[0m");
            }
        } while (escolha != 4);
    }

    private static void listarFilmes(Vetor bibliotecaFilmes) throws Exception {
        if (bibliotecaFilmes.getTamanho() == 0) {
            System.out.println("\033[31m\nA biblioteca de filmes está vazia.\033[0m");
        } else {
            System.out.println("\033[36m\n--- Biblioteca de Filmes - Lista ---\033[0m");
            for (int i = 0; i < bibliotecaFilmes.getTamanho(); i++) {
                System.out.println("\033[1mÍndice " + i + ":\033[0m " + bibliotecaFilmes.busca1(i));
            }
        }
    }
}
