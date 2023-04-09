public class Triangulo {
    private double base;
    private double altura;

    Triangulo() {
    }

    Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calculaArea() {
        return getBase() * getAltura() / 2;
    }

    public void imprimeDados() {
        System.out.printf("A área do triângulo com base %.1f e %.1f é igual a %.1f%n",
                getBase(), getAltura(), calculaArea());
    }

    // Getters e setters

    public double getAltura() { return altura; }

    public void setAltura(double altura) { this.altura = altura; }

    public double getBase() { return base; }

    public void setBase(double base) { this.base = base; }
}