public class Produto {
    String marca;
    String fabricante;
    String cod_barras;
    float preco;

    public Produto() {
        
    }

    public Produto(String m, String f, String c, float p) {
        marca = m;
        fabricante = f;
        cod_barras = c;
        preco = p;
    }

    public void mostrarDados(int id, String marca, String fabricante, String cod_barras, float preco){
        System.out.println("\nDados do "+id+"º produto:");
        System.out.printf("" +
                        "Marca: %s%n" +
                        "Fabricante: %s%n" +
                        "Código de barras: %s%n" +
                        "Telefone: %s%n%n",
                marca,
                fabricante,
                cod_barras,
                preco);
    }
}
