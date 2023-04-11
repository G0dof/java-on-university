public class Banco {
    Pessoa cliente;
    int numConta;
    double saldo;

    public Banco() {
    }

    public Banco( int numConta, double saldo, Pessoa cliente) {
        this.cliente = cliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

}

