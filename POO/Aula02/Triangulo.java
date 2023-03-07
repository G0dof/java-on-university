public class Triangulo {
    float base;
    float altura;

    Triangulo(float b, float a){
        base = b;
        altura = a;
    }

    public Float calculoArea(float base, float altura){
        return (base*altura)/2;
    }
}
