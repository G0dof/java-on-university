import Escopo.Pessoa;

public class ValorReferencia {
    public static void main(String[] args) {
        int valor1 = 10;
        int valor2 = valor1;

        System.out.printf("Somando 5 ao valor1: %d%n", (valor1+5));
        System.out.printf("Somando 5 ao valor2: %d%n", (valor2+5));

        int v1 = 3;
        int v2 = v1;
        int v3 = v1 + v2;
        System.out.println(v3);

        Pessoa p1 = new Pessoa("Josefino", 37, 2500.00);
        Pessoa p2 = p1;

        System.out.println(p1.nome+" - "+p1.idade);
        System.out.println(p2.nome+" - "+p2.idade);

        p2.nome = "Clayton";

        System.out.println(p1.nome+" - "+p1.idade);
        System.out.println(p2.nome+" - "+p2.idade);
    }
}
