public class Aula07_A {
    public static void main(String[] args) {
        Pessoa goiabinha= new Pessoa();
        System.out.println("Valores inseridos no objeto goiabinha");
        System.out.println("Nome: "+goiabinha.nome+"idade: "+goiabinha.idade+"Altura:"+goiabinha.altura);
        Pessoa roberwando = new Pessoa("Roberwando",51,1.74f,"rober","123");
        System.out.println("\n Valores inseridos no objeto roberwaldo");
        System.out.println("\nNome: "+roberwando.nome+ 
                           "\nIdade: "+ roberwando.idade+ 
                           "\nAltura: "+roberwando.altura);
    }
}
