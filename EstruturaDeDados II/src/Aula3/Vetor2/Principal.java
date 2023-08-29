package Aula3.Vetor2;

public class Principal {
    public static void main(String[] args) throws Exception {
        Vetor2 vetor = new Vetor2(5);

        try {
            vetor.adiciona("elemento 1");
            vetor.adiciona("elemento 2");
            vetor.adiciona("elemento 3");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Quantidade de informações no vetor: " + vetor.getTamanho());

        System.out.println("Conteúdo do vetor: " + vetor.toString());

        System.out.println("Posição 2 = " + vetor.buscaPaia(2));

        System.out.println("Encontrado na posição "+vetor.buscaLinear("elemento 3"));

        vetor.adicionaInicio(0, "teste");
        vetor.remove(1);

        System.out.println("Conteúdo do vetor: " + vetor.toString());
    }
}

