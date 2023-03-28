public class Media {
    public String calculaMedia(float a, float b) {
        return "A média é: " + (a + b);
    }

    public void calculaMedia(double a, double b) {
        System.out.println("A média é: " + (a + b));
    }

    public String calculaMedia(float a, float b, float c, float d, float e){
        return "A média é: "+((a+b+c+d+e)/5);
    }
}
