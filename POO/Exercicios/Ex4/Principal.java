import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Funcionários
        Scanner leia = new Scanner(System.in);
        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario(2, 800, "Aprendiz");

        System.out.print("Insira o número do seu crachá: ");
        int cracha = leia.nextInt();
        funcionario1.setCracha(cracha);

        System.out.print("Insira o seu salário: ");
        float salario = leia.nextFloat();
        funcionario1.setSalario(salario);

        System.out.print("Insira a porcentagem de aumento no salário: ");
        float aumento = leia.nextFloat();
        funcionario1.setSalario(funcionario1.calculaAumento(aumento));

        System.out.println("\n---------- \033[1;31mFuncionário 1\033[m ----------");

        System.out.printf("" +
                        "Crachá: %d%n" +
                        "Salário: R$%.2f%n" +
                        "Cargo: %s%n",
                funcionario1.getCracha(),
                funcionario1.getSalario(),
                funcionario1.getCargo());

        System.out.println("\n---------- \033[1;36mFuncionário 2\033[m ----------");

        System.out.printf("" +
                        "Crachá: %d%n" +
                        "Salário: R$%.2f%n" +
                        "Cargo: %s%n",
                funcionario2.getCracha(),
                funcionario2.calculaAumento(2),
                funcionario2.getCargo());

        System.out.println("------------------------------------");

        //Triângulos
        Triangulo triangulo1 = new Triangulo();
        Triangulo triangulo2 = new Triangulo(3, 4);

        System.out.print("Base: ");
        double base = leia.nextDouble();
        triangulo1.setBase(base);

        System.out.print("Altura: ");
        double altura = leia.nextDouble();
        triangulo1.setAltura(altura);

        System.out.println("\n--------- \033[2;32mTriângulo 1\033[m ---------");
        triangulo1.imprimeDados();

        System.out.println("\n--------- \033[1;34mTriângulo 2\033[m ---------");
        triangulo2.imprimeDados();
    }
}
