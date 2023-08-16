public class Exercicio4 {
    private String veta[] = {"Angola", "Chile", "Grécia", "Itália", "Moçambique", "Portugal", "Rússia", "Suécia"};
    private String vetb[] = {"Argentina", "Brasil", "Chile", "Dinamarca", "Espanha", "França", "Inglaterra", "Turquia", "Uruguai", "Venezuela", "Zimbabwe"};

    public static void main(String args[]) {
        Ex4 exercicio4 = new Ex4();
        String resultado[] = new String[exercicio4.veta.length + exercicio4.vetb.length];
        mergePaises(exercicio4.veta, exercicio4.vetb, resultado);

        for (String pais : resultado) {
            System.out.print(" "+pais+" ");
        }
    }

    public static void mergePaises(String a[], String b[], String res[]) {
        int i = 0, j = 0, k = 0;
        int n = a.length, m = b.length;

        while (i < n && j < m) {
            if (a[i].compareTo(b[j]) < 0) {
                res[k] = a[i];
                i++;
            } else {
                res[k] = b[j];
                j++;
            }
            k++;
        }

        while (i < n) {
            res[k] = a[i];
            i++;
            k++;
        }

        while (j < m) {
            res[k] = b[j];
            j++;
            k++;
        }
    }

}
