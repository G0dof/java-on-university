public class ComparaStrings {

    public static void main(String[] args) {
        /*
            A comparação de strings em Java não pode ser efetuada com ==, devem 
            ser utilizadas funções de comparação como: equals, equalsIgnoreCase, 
            compareTo e compareToIgnoreCase.
        */
        String stra, strb, strc, strd;
        
        //Para comparar se duas strings são iguais.
        //Com ignore case tanto faz se as letras estão em minúsculas ou maiúsculas.
        stra = "São Paulo, Brasil";
        strb = "SÃO PAULO, BRASIL";
        System.out.println("Verificando se '" + stra + "' é igual a '" + strb + "' : " + stra.equals(strb) );
        System.out.println("Verificando se '" + stra + "' é igual a '" + strb + "' : " + stra.equalsIgnoreCase(strb) );
       
       //Com compareTo e compareToIgnoreCase podemos saber se uma string é menor, igual ou maior que outra.
       //A comparação não é por tamanho (para isso usar length) e sim alfabética.
        stra = "A vida é bela, é bom aproveitar cada momento";
        strb = "Praia é tudo de bom";    
        System.out.println("Verificando se '" + stra + "' é maior que '" + strb + "' : " + (stra.compareTo(strb)>0)  );
        System.out.println("Verificando se '" + strb + "' é maior que '" + stra + "' : " + (strb.compareTo(stra)>0)  );
    }
    
}
