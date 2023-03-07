public class Principal {
    public static void main(String[] args) {
        Data d1 = new Data();
        System.out.printf("%d/%d/%d%n", d1.dia, d1.mes, d1.ano);
        d1.dia = 30;
        d1.mes = 7;
        d1.ano = 2023;

        System.out.printf("%d/%d/%d%n", d1.dia, d1.mes, d1.ano);

        Data d2 = new Data(6, 3, 2023);
        System.out.printf("%d/%d/%d%n", d2.dia, d2.mes, d2.ano);

        System.out.println("-----------------------------------------");

        Triangulo t = new Triangulo(2.5f, 3f);
        System.out.printf("Base: %f | Altura: %f%n", t.base, t.altura);
        System.out.printf("Área: %f%n", t.calculoArea(t.base, t.altura));

    }
}
