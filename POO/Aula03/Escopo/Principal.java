package Escopo;

public class Principal {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Pedrinho", 125, 100);
        double bolsaFamilia = 0;


        if (p1.renda < 1000){
            bolsaFamilia = p1.renda*0.5;
            p1.renda += bolsaFamilia;
        }
        System.out.printf("Valor da renda de %s é: %f%n", p1.nome, p1.renda);
        System.out.printf("Valor do bolsa família recebida: %f", bolsaFamilia);
    }
}
