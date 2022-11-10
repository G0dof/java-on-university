
public class Pessoa {
        String nome;
        int idade;
        float altura;
        String usuario;
        String senha;
        boolean falecido;
        
        public Pessoa(){ //Construtor vazio
            falecido=false;
        }
    public Pessoa (String nome, int idade, 
            float altura, String usuario, String senha ){
        this.nome=nome;
        this.idade=idade;
        this.altura=altura;
        this.usuario=usuario;
        this.senha=senha;
    }
    public void andar(){
        System.out.println("Esta pessoa sabe andar");
    }
    public void tossir(){
        System.out.println("Esta pessoa sabe tossir");
    }
    
}
