public class ConversaoDeTipos {
    public static void main(String[] args) {
        String converter = "65";

        int inteiro = Integer.parseInt(converter);
        System.out.println(inteiro + 15);

        double pontoFlutuante = Double.parseDouble(converter);
        System.out.println(pontoFlutuante + 15);

        int caractere = converter.charAt(0); // Código alt = Alt + 54 = 6
        System.out.println(caractere);

        String nome = "Carlos";
        System.out.println(nome.charAt(2));
    }
}