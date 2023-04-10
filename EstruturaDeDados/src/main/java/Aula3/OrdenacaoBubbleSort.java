
import javax.annotation.processing.FilerException;

public class OrdenacaoBubbleSort {

    public static void main(String[] args) {
        new OrdenacaoBubbleSort();
    }

    public OrdenacaoBubbleSort() {
        double vetnulo[] = null;

        if (!bubbleSort_v01(vetnulo)) {  //se retorna falso houve problemas:
            System.out.println("O vetor nulo 'vetnulo' n�o pode ser ordenado em bubbleSort_v01.");
        }

        //veja como poderíamos executar o método void (que lança uma exception se houver erro):
        try {   //vamos tentar (try) executar os comandos a seguir
            bubbleSort_v02(vetnulo);
        } catch (Exception ex) {  // capturamos um possível erro e executamos os comandos a seguir
            System.out.println("O vetor nulo 'vetnulo' n�o pode ser ordenado em bubbleSort_v02.\n");
        }

        //declaramos um vetor desordenado:
        double vet[] = {4.5, 6.3, 1.2, 78.3, 0.5, 4.3};

        System.out.println("Vetor desordenado:");
        visualizar(vet);

        bubbleSort_v05(vet); //ou executar as outras versões disponíveis

        System.out.println("Vetor ordenado em ordem crescente:");
        visualizar(vet);
    }

    public boolean bubbleSort_v01(double vetor[]) {
        if (vetor == null) {
            return false;
        }
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    double tmp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = tmp;
                }
            } // fim do for j
        } //fim do for i
        return true;
    }

    public void bubbleSort_v02(double vetor[]) throws Exception {
        if (vetor == null) {
            throw new Exception();
        }
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    double tmp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = tmp;
                }
            }
        }
    }

    public boolean bubbleSort_v03(double vetor[]) {
        if (vetor == null) {
            return false;
        }
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    troca(vetor, j, j + 1);
                }
            }
        }
        return true;
    }

    public void troca(double vetor[], int posa, int posb) {
        double temp = vetor[posa];
        vetor[posa] = vetor[posb];
        vetor[posb] = temp;
    }

    public boolean bubbleSort_v04(double vetor[]) {
        if (vetor == null) {
            return false;
        }
        for (int i = 0; i < vetor.length - 1; i++) {
            int trocas = 0;
            for (int j = 0; j < vetor.length - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    double tmp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = tmp;
                    trocas++;
                }
            }
            if (trocas == 0) {
                break;
            }
        }
        return true;
    }

    public boolean bubbleSort_v05(double vetor[]) {
        if (vetor == null) {
            return false;
        }
        boolean trocou;
        int i = 0;
        do {
            trocou = false;
            for (int j = 0; j < vetor.length - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    troca(vetor, j, j + 1);
                    trocou = true;
                }
            }
            i++;
        } while (trocou && i < vetor.length - 1);
        return true;
    }

    public void visualizar(double vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + "   ");
        }
        System.out.println();
    }

}
