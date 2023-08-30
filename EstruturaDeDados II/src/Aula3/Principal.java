package Aula3;

public class Principal {
    public static void main(String[] args) throws Exception {
        Vetor2 vetor = new Vetor2(5);

        Contato c1 = new Contato("Claudio", "9999-1234", "example@example.com");
        Contato c2 = new Contato("Pedro", "9999-4321", "example@example.com");
        Contato c3 = new Contato("Jorge", "9999-6789", "example@example.com");

        try {
            vetor.adiciona(c1);
            vetor.adiciona(c2);
            vetor.adiciona(c3);
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("Tamanho do vetor " + vetor.getTamanho());
        System.out.println(vetor);
    }
}
