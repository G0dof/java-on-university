public class Principal {
    public static void main(String[] args) {
        // Cursos
        System.out.println();
        Curso curso1 = new Curso();
        curso1.cadastraCurso();
        System.out.println("\n------- Curso 1 -------\n");
        curso1.imprimeDados();

        Curso curso2 = new Curso("Medicina", 100, "MED1", 4000);
        System.out.println("\n------- Curso 2 -------\n");
        curso2.imprimeDados();

        // Pacientes
    }
}
