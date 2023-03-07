package Exercicios;

public class Principal {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        cliente.nome = "José Bezerra";
        cliente.idade = 27;
        cliente.sexo = "Masculino";
        cliente.email = "jose.bezerra27@uol.com.br";
        cliente.telefone = "+55 (66)94527-4190";
        cliente.cpf = "687.379.821-76";

        System.out.printf("Cliente:%n" +
                        "" +
                        "- Nome: %s%n" +
                        "- Idade: %d%n" +
                        "- Sexo: %s%n" +
                        "- Email: %s%n" +
                        "- Telefone: %s%n" +
                        "- CPF: %s%n",
                cliente.nome,
                cliente.idade,
                cliente.sexo,
                cliente.email,
                cliente.telefone,
                cliente.cpf);

        Curso curso = new Curso("Bacharelado", "Física", "Presencial", "Matutino", 8);

        System.out.printf("%nCurso:%n" +
                        "" +
                        "- Grau acadêmico: %s%n" +
                        "- Curso escolhido: %s%n" +
                        "- Modalidade: %s%n" +
                        "- Período: %s%n" +
                        "- Quantidade de semestres: %d%n",
                curso.grauAcademico,
                curso.cursoEscolhido,
                curso.modalidade,
                curso.periodo,
                curso.qtdSemestres);
    }
}
