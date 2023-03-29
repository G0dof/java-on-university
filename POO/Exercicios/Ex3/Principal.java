public class Principal {
    public static void main(String[] args) {
        // Cursos
        Curso curso1 = new Curso();
        curso1.cadastraCurso();
        System.out.println("\n----------- Curso 1 -----------\n");
        curso1.imprimeDados();

        Curso curso2 = new Curso("Medicina", 100, "MED1", 4000);
        System.out.println("\n----------- Curso 2 -----------\n");
        curso2.imprimeDados();

        // Pacientes

        Paciente paciente1 = new Paciente();
        paciente1.cadastraDados();
        System.out.println("\n----------- 1º Paciente -----------\n");
        paciente1.imprimeDados();

        Paciente paciente2 = new Paciente();

        paciente2.nome  = "Joana";
        paciente2.rg = "98.312.043-5";
        paciente2.endereco = "Rua Juninho Gamepl        ays, nº123";
        paciente2.telefone = "+69(11)94002-8922";
        paciente2.anoNascimento = 2003;
        paciente2.profissao = "Autônomo";

        System.out.println("\n----------- 2º Paciente -----------\n");
        paciente2.imprimeDados();
    }
}
