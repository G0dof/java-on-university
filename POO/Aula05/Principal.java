public class Principal {
    public static void main(String[] args) {
        Media m = new Media();
        int a = 0, b = 0, c = 0, d = 0, e = 0;

        m.calculaMedia(a, b, c, d, e);

        System.out.println(soma(1, 2, 3, 345, 453, 4355, 34534, 543, 543));
        System.out.println(media(10, 5, 2, 5, 6, 15, 2000));
    }

    public static int soma(int... a) {
        int somaTotal = 0;
        for (int num : a) {
            somaTotal += num;
        }
        return somaTotal;
    }

    public static double media(double... b) {
        double media = 0;
        int cont = 0;

        for (double num : b) {
            media += num;
            cont++;
        }

        return media / cont;
    }

}
