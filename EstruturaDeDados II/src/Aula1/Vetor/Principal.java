package Aula1.Vetor;

public class Principal {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(5);

        try {
            vetor.adiciona("1");
            vetor.adiciona("4");
            vetor.adiciona("4");
            vetor.adiciona("5");
            vetor.adiciona("5");
        }
        catch(Exception e) {e.printStackTrace();}

        System.out.println(vetor.toString());
    }
}

