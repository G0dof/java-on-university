//Ledón, Jan/2021

public class ContagemInstrucoes {

    public static void main(String[] args) {
        int n = 128;
        int k = 0, i = n;
        while (i > 1) {
            k = k + 1;   //contador de vezes que o ciclo será executado
            i = i / 2;   // controle do ciclo
        }
        System.out.println("Contagem de instruções k = " + k);   
        //com n=128 o resultado será 7, porque log2(128) = 7
        //teste com estes outros valores: n=16, n=32, n=64, n=256
    }

}
