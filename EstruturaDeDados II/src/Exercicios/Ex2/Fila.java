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
