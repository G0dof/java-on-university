package Calculadora;

public class CalculadoraSimples {
    float v1, v2;

    public String adicao(float v1, float v2) {
        return String.format("O resultado da adição (%f + %f) é %f", v1, v2, v1 + v2);
    }
    public String subtracao(float v1, float v2) {
        return String.format("O resultado da adição (%f - %f) é %f", v1, v2, v1 - v2);
    }
    public String multiplicacao(float v1, float v2) {
        return String.format("O resultado da adição (%f * %f) é %f", v1, v2, v1 * v2);
    }
    public String divisao(float v1, float v2) {
        return String.format("O resultado da adição (%f / %f) é %f", v1, v2, v1 / v2);
    }
}
