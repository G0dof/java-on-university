## <center style="width:700px;margin:auto">Aplicação para controlar a fila de atendimento de um laboratório de coleta de sangue</center>

* ## Main

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fila fila = new Fila(2);
        int senhaNormal = 1;
        int senhaPreferencial = 1;

        while (true) {
            System.out.println("\n\033[1m=== Laboratório de Coleta de Sangue ===\033[0m");
            System.out.println("1. \033[1mSolicitar senha de atendimento\033[0m");
            System.out.println("2. \033[1mVisualizar a Fila\033[0m");
            System.out.println("3. \033[1mVisualizar o tamanho da Fila\033[0m");
            System.out.println("4. \033[1mVerificar se a Fila está vazia\033[0m");
            System.out.println("5. \033[1mVisualizar o primeiro da fila\033[0m");
            System.out.println("6. \033[1mChamar paciente para o atendimento\033[0m");
            System.out.println("7. \033[1mSair\033[0m");

            int escolha = scanner.nextInt();

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
                    System.out.println("\nInforme o tipo de fila para chamar paciente "+
                            "(\033[92m1 para normal\033[0m | \033[91m2 para preferencial\033[0m):");
                    int tipoFila = scanner.nextInt();
                    String pacienteChamado = fila.desenfileira(tipoFila);
                    if (pacienteChamado != null) {
                        System.out.println("Paciente chamado para atendimento: " + pacienteChamado);
                    }
                }
                case 7 -> {
                    System.out.println("\033[1mSaindo do sistema. Obrigado!\033[0m");
                    scanner.close();
                    System.exit(0);
                }
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
```

* ## Fila

```java
public class Fila {
    private String[][] filas;
    private int[] indices;
    private int capacidade;

    public Fila(int capacidade) {
        this.capacidade = capacidade;
        this.filas = new String[2][capacidade];
        this.indices = new int[]{0, 0};
    }

    public void enfileira(int tipoFila, String senha) {
        if (tipoFila == 1 || tipoFila == 2) {
            int filaIndex = tipoFila - 1;
            int index = indices[filaIndex];

            if (index < capacidade) {
                filas[filaIndex][index] = senha;
                indices[filaIndex]++;

                System.out.println("\033[92mSenha gerada com sucesso: " + senha + "\033[0m");
                System.out.println("\033[96mSenha adicionada à fila " + (tipoFila == 1 ? "normal" : "preferencial") + "\033[0m");
            } else {
                System.out.println("\033[91mA Fila " + (tipoFila == 1 ?
                        "Normal"
                        :
                        "Preferencial") + " está cheia. Não é possível adicionar mais senhas.\033[0m");
            }
        } else {
            System.out.println("\033[91mOpção de fila inválida.\033[0m");
        }
    }

    public void espiar(int tipoFila) {
        int filaIndex = tipoFila - 1;

        if (filaIndex >= 0 && filaIndex < 2) {
            String filaTipo = (filaIndex == 0) ? "Normal" : "Preferencial";
            System.out.println("\033[96mFila " + filaTipo + ":\033[0m");
            for (int i = 0; i < indices[filaIndex]; i++) {
                System.out.println(filas[filaIndex][i]);
            }
        } else {
            System.out.println("\033[91mOpção de fila inválida.\033[0m");
        }
    }

    public int getTamanho(int tipoFila) {
        int filaIndex = tipoFila - 1;

        if (filaIndex >= 0 && filaIndex < 2) {
            return indices[filaIndex];
        } else {
            System.out.println("\033[91mOpção de fila inválida.\033[0m");
            return -1;
        }
    }

    public boolean estaVazia(int tipoFila) {
        int filaIndex = tipoFila - 1;

        if (filaIndex >= 0 && filaIndex < 2) {
            return indices[filaIndex] == 0;
        } else {
            System.out.println("\033[91mOpção de fila inválida.\033[0m");
            return false;
        }
    }

    public String peek(int tipoFila) {
        int filaIndex = tipoFila - 1;

        if (filaIndex >= 0 && filaIndex < 2 && indices[filaIndex] > 0) {
            return filas[filaIndex][0];
        } else {
            System.out.println("\033[91mA Fila está vazia ou a opção de fila é inválida.\033[0m");
            return null;
        }
    }

    public String desenfileira(int tipoFila) {
        int filaIndex = tipoFila - 1;

        if (filaIndex >= 0 && filaIndex < 2 && indices[filaIndex] > 0) {
            String senhaChamada = filas[filaIndex][0];

            for (int i = 0; i < indices[filaIndex] - 1; i++) {
                filas[filaIndex][i] = filas[filaIndex][i + 1];
            }

            indices[filaIndex]--;
            return senhaChamada;
        } else {
            System.out.println("\033[91mA Fila está vazia. Não há pacientes para chamar.\033[0m");
            return null;
        }
    }
}
```