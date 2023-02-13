package Aula03;

public class Aula03_A {
    
    public static void exibirMensagem1(){
        System.out.println("Chamando o procedimento");
    }
    
    public static void exibirMensagem2(){
        System.out.println("Olá, tudo bem?");
    }
    
    public static void exibirMensagem3(){
        System.out.println("Meu nome é Pedro");
    }
    
    public static void main(String[] args) {
        exibirMensagem1();
        System.out.println("Estou no método principal (main)");
        exibirMensagem2();
        exibirMensagem3();
    }
    
}
