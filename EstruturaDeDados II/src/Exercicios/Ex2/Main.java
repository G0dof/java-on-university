import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fila fila = new Fila(20);
        int senhaNormal = 1, senhaPreferencial = 1, escolha;

        do {
            System.out.println("\n\033[1m=== Laboratório de Coleta de Sangue ===\033[0m");
            System.out.println("1. \033[1mSolicitar senha de atendimento\033[0m");
            System.out.println("2. \033[1mVisualizar a Fila\033[0m");
            System.out.println("3. \033[1mVisualizar o tamanho da Fila\033[0m");
            System.out.println("4. \033[1mVerificar se a Fila está vazia\033[0m");
            System.out.println("5. \033[1mVisualizar o primeiro da fila\033[0m");
            System.out.println("6. \033[1mChamar paciente para o atendimento\033[0m");
            System.out.println("7. \033[1mSair\033[0m");

            escolha = scanner.nextInt();

            switch (escolha) {
                case 1 -> {
                    System.out.println("\nInforme o tipo de senha "+
                            "(\033[92m1 para normal\033[0m | \033[91m2 para preferencial\033[0m):");
                    int tipoFila = scanner.nextInt();
                    String senha = (tipoFila == 1) ?
                            "\033[92mN" + String.format("%03d", senhaNormal) + "\033[0m"
                            :
                            "\033[91mP" + String.format("%03d", senhaPreferencial) + "\033[0m";
                    fila.enfileira(tipoFila, senha);
                    if (tipoFila == 1) {
                        senhaNormal++;
                    } else if (tipoFila == 2) {
                        senhaPreferencial++;
                    }
                }
                case 2 -> {
                    System.out.println("\nInforme o tipo de fila para visualizar "+
                            "(\033[92m1 para normal\033[0m | \033[91m2 para preferencial\033[0m):");
                    int tipoFila = scanner.nextInt();
                    fila.espiar(tipoFila);
                }
                case 3 -> {
                    System.out.println("\nInforme o tipo de fila para verificar o tamanho "+
                            "(\033[92m1 para normal\033[0m | \033[91m2 para preferencial\033[0m):");
                    int tipoFila = scanner.nextInt();
                    int tamanho = fila.getTamanho(tipoFila);
                    if (tamanho >= 0) {
                        System.out.println("Tamanho da Fila: " + tamanho);
                    }
                }
                case 4 -> {
                    System.out.println("\nInforme o tipo de fila para verificar se está vazia "+
                            "(\033[92m1 para normal\033[0m | \033[91m2 para preferencial\033[0m):");
                    int tipoFila = scanner.nextInt();
                    boolean vazia = fila.estaVazia(tipoFila);
                    if (vazia) {
                        System.out.println("A Fila está vazia.");
                    } else {
                        System.out.println("A Fila não está vazia.");
                    }
                }
                case 5 -> {
                    System.out.println("\nInforme o tipo de fila para visualizar o primeiro "+
                            "(\033[92m1 para normal\033[0m | \033[91m2 para preferencial\033[0m):");
                    int tipoFila = scanner.nextInt();
                    String primeiro = fila.peek(tipoFila);
                    if (primeiro != null) {
                        System.out.println("Primeiro da Fila: " + primeiro);
                    }
                }
                case 6 -> {
                    System.out.println("\nInforme o tipo de fila para chamar o paciente "+
                            "(\033[92m1 para normal\033[0m | \033[91m2 para preferencial\033[0m):");
                    int tipoFila = scanner.nextInt();
                    String pacienteChamado = fila.desenfileira(tipoFila);
                    if (pacienteChamado != null) {
                        System.out.println("Paciente chamado para atendimento: " + pacienteChamado);
                    }
                }
                case 7 -> {
                    System.out.println("\033[1mSaindo do sistema.\033[0m");
                }
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        } while (escolha != 7);
    }
}
