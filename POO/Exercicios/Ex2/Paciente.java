public class Paciente {
    String nome;
    String rg;
    String endereco;
    String telefone;
    String dataNascimento;
    String profissao;

    public Paciente() {

    }

    public Paciente(String nome, String rg, String endereco, String telefone, String dataNascimento, String profissao){
        this.nome = nome;
		this.rg = rg;
		this.endereco = endereco;
		this.telefone = telefone;
		this.dataNascimento = dataNascimento;
		this.profissao = profissao;
    }

    public void mostrarDados(int id, String nome, String rg, String endereco, String telefone, String dataNascimento, String profissao){
        System.out.println("\nDados "+id+"º do paciente:");
        System.out.printf("" +
                "Nome: %s%n" +
                "RG: %s%n" +
                "Endereço: %s%n" +
                "Telefone: %s%n" +
                "Data de nascimento: %s%n" +
                "Profissão: %s%n",
                nome,
                rg,
                endereco,
                telefone,
                dataNascimento,
                profissao);
    }
}
