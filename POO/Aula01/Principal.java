public class Principal {
    public static void main(String[] args) {
        /* Pessoa */

        Pessoa pessoa1 = new Pessoa();

        pessoa1.nome = "João";
        pessoa1.cpf = "123.456.789-10";
        pessoa1.idade = 76;

        Pessoa pessoa2 = new Pessoa("Maria", 21, "987.654.321-00");

        System.out.printf("Nome: %s| CPF: %s| Idade: %d%n", pessoa1.nome, pessoa1.cpf, pessoa1.idade);
        System.out.printf("%nNome: %s| CPF: %s| Idade: %d%n", pessoa2.nome, pessoa2.cpf, pessoa2.idade);

        /* Cão */

        Cao cao1 = new Cao();

        cao1.nome = "Rex";
        cao1.raca = "Beagle";
        cao1.idade = 50;
        cao1.porte = "Médio";
        cao1.tipoPelo = "Brilhante";
        cao1.sexo = "Masculino";
        cao1.vacinado = true;

        Cao cao2 = new Cao("Lassie", "Pastor Alemão", 10, "Grande", "Liso", "Feminino", false);

        System.out.printf("%nNome: %s %nRaça: %s %nIdade: %d %nPorte: %s %nTipo de pelo: %s %nSexo: %s %nVacinado: %b%n", cao1.nome, cao1.raca, cao1.idade, cao1.porte, cao1.tipoPelo, cao1.sexo, cao1.vacinado);
        System.out.printf("%nNome: %s %nRaça: %s %nIdade: %d %nPorte: %s %nTipo de pelo: %s %nSexo: %s %nVacinado: %b%n", cao2.nome, cao2.raca, cao2.idade, cao2.porte, cao2.tipoPelo, cao2.sexo, cao2.vacinado);
    }
}
