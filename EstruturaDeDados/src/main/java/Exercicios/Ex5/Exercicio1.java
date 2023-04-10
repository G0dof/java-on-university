import java.util.Random;

public class Exercicio1 {

    public static void main(String args[]){
        double[] vet = {99,5,7,2,9,23,6,8,1,12,14};
        aleatorizarVetor(vet);
    }

    public static void aleatorizarVetor(double[] vet) {
        Random rnd = new Random();
        for (int i = vet.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            double temp = vet[index];
            vet[index] = vet[i];
            vet[i] = temp;
        }
        for(double n : vet){
            System.out.print(" "+n+" ");
        }
    }

}
