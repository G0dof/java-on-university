//Ledón, janeiro/2021

public class Fibonacci {

    public static void main(String args[]) {
        new Fibonacci();
    }

    public Fibonacci() {
        System.out.println("Fibo da posição 5: "   + fibo(5));
        System.out.println("Fibo da posição 10: " + fibo(10));
        System.out.println("Fibo da posição 30: " + fibo(30));
        System.out.println("Fibo da posição 40: " + fibo(40));  //demora aproximadamente uns 2 segundos
        System.out.println("Fibo da posição 47: " + fibo(47)); // demora aprox. uns 26 segundos (depende do hardware)
        //System.out.println("Fibo da posição 50: " + fibo(50)); //este cálculo demora talvez 2 minutos ou mais
    }

    public long fibo(int n) {
        //função fibo em forma recursiva
        if (n < 0) return -1;  // opcional: não definido para valores negativos
        else if (n == 0) return 0;  //1º número da seq. de Fibonacci é zero
        else if (n == 1) return 1;  //2º número da seq. de Fibonacci é 1
        else return (fibo(n - 1) + fibo(n - 2)); //observe que temos duas chamadas recursivas a fibo
    }
    
}

