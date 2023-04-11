import java.util.ArrayList;
import java.util.Scanner;

/*
 * Nome: Pedro Ferreira Sudre
 * RGM: 5829372437
 */

public class Principal {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        ArrayList<Banco> contas = new ArrayList<>();
        ArrayList<Pessoa> clientes = new ArrayList<>();

        int opcao = 0;

        do {
            exibirMenu();
            opcao = leia.nextInt();
            int cont = 0;
            
            switch (opcao) {
                case 1:
                    System.out.print("Informe o seu nome: ");
                    String nome = leia.next();
                    System.out.print("Informe o seu CPF: ");
                    String cpf = leia.next();
                    Pessoa cliente = new Pessoa(nome, cpf);
                    clientes.add(cliente);
                    System.out.println("\nCliente cadastrado com sucesso\n");
                    break;
                case 2:
                    System.out.print("Digite o número da conta: ");
                    int numeroConta = leia.nextInt();
                    System.out.print("Digite o saldo inicial da conta: R$");
                    double saldo = leia.nextDouble();
                    System.out.print("Digite o CPF do titular da conta: ");
                    cpf = leia.next();
                    Pessoa titular = null;

                    for (Pessoa c : clientes) {
                        if (c.getCpf().equals(cpf)) {
                            titular = c;
                            break;
                        }
                    }
                    if (titular != null) {
                        Banco conta = new Banco(numeroConta, saldo, titular);
                        contas.add(conta);
                        System.out.println("\nConta cadastrado com sucesso\n");
                    }
                    else {
                        System.out.println("\nCliente não encontrado\n");
                    }
                    break;
                case 3:
                    System.out.print("Insira o número da conta: ");
                    numeroConta = leia.nextInt();

                    for (Banco b : contas) {
                        if (b.numConta == numeroConta) {
                            System.out.printf("\nO saldo do %s é R$%.2f%n\n", b.cliente.nome, b.saldo);
                            break;
                        } else {
                            cont += 1;
                        }
                    }
                    if (cont == contas.size()-1){
                        System.out.println("\nA conta informada não existe\n");
                    }
                    break;
                case 4:
                    for (Banco b : contas) {
                        System.out.printf("\nConta: %d%nSaldo: R$%.2f%nCliente: %s%n\n",
                                b.numConta,
                                b.saldo,
                                b.cliente.nome);
                    }
                    break;
                case 5:
                    System.out.print("Insira o número da conta: ");
                    numeroConta = leia.nextInt();

                    for (Banco b : contas) {
                        if (b.numConta == numeroConta) {
                            System.out.print("Insira o valor de saque: ");
                            double saque = leia.nextDouble();

                            if (saque > b.saldo) {
                                System.out.println("\nSaldo insuficiente\n");
                            } else {
                                
                                System.out.printf("\nSaldo atual: R$%.2f%n", b.saldo);
                                b.saldo -= saque;
                                System.out.printf("Saldo após o saque: R$%.2f%n\n", b.saldo);
                            }
                            break;
                        }
                        else {
                            cont += 1;
                        }
                            
                    }
                    if (cont == contas.size()-1) {
                        System.out.println("\nA conta informada não existe\n");
                    }
                    break;
                case 6:
                    System.out.print("Informe número da conta: ");
                    numeroConta = leia.nextInt();
                    for (Banco b : contas) {
                        if (b.numConta == numeroConta) {
                            System.out.print("Insira o valor de saque: ");
                            double deposito = leia.nextDouble();

                            System.out.printf("\nSaldo atual: R$%.2f%n", b.saldo);
                            b.saldo += deposito;
                            System.out.printf("Saldo após o depósito: R$%.2f%n\n", b.saldo);
                            break;
                        } else {
                            System.out.println("\nA conta informada não existe\n");
                            continue;
                        }
                    }
                    break;
                case 7:
                    System.out.println("\nObrigado por utilizar nosso sistema\n");
                    break;
                default:
                    System.out.println("\nTente Novamente\n");
            }
        } while (opcao != 7);
    }

    public static void exibirMenu() {
        System.out.println("1 - Cadastrar cliente");
        System.out.println("2 - Cadastrar conta");
        System.out.println("3 - Consultar saldo");
        System.out.println("4 - Exibir contas");
        System.out.println("5 - Sacar dinheiro");
        System.out.println("6 - Depositar dinheiro");
        System.out.println("7 - Sair");
        System.out.print("======> ");
    }
}
