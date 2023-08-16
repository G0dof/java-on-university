import java.util.Arrays;

public class Exercicio5 {

        public static void main(String[] args) {
            int[] arr = {3, 5, -12, 34, 91, 81, 91, 2, 0, 180, 21, 76, 22, 20, 19, 43, -15, 1, 65};
            quickSort(arr, 0, arr.length-1);
            System.out.println(Arrays.toString(arr));
        }

        public static void quickSort(int[] arr, int esq, int dir) {
            if (esq < dir) {
                int pivot = medianoDeTres(arr, esq, dir);
                int particaoPos = particao(arr, esq, dir, pivot);
                quickSort(arr, esq, particaoPos-1);
                quickSort(arr, particaoPos+1, dir);
            }
        }

        public static int particao(int[] arr, int esq, int dir, int pivot) {
            int valorPivot = arr[pivot];
            trocar(arr, pivot, dir);
            int pos = esq;
            for (int i = esq; i < dir; i++) {
                if (arr[i] > valorPivot) {
                    trocar(arr, i, pos);
                    pos++;
                }
            }
            trocar(arr, pos, dir);
            return pos;
        }

        public static int medianoDeTres(int[] arr, int esq, int dir) {
            int meio = esq + (dir - esq) / 2;
            if (arr[esq] > arr[meio])
                trocar(arr, esq, meio);
            if (arr[esq] > arr[dir])
                trocar(arr, esq, dir);
            if (arr[meio] > arr[dir])
                trocar(arr, meio, dir);
            return meio;
        }

        public static void trocar(int[] arr, int i, int j) {
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
    }

