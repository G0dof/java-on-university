
public class OrdenacaoSelectionSort {

    public static void main(String[] args) {
        new OrdenacaoSelectionSort();
    }
    
    public OrdenacaoSelectionSort() {
        double vetnulo[] = null;
        
        if (!selectionSort_v01(vetnulo) ) {
           System.out.println("O vetor nulo 'vetnulo' não pode ser ordenado em selectionSort_v01."); 
        }
        
        try {
          selectionSort_v02(vetnulo);
        }
        catch(Exception ex ){
          System.out.println("O vetor nulo 'vetnulo' não pode ser ordenado em selectionSort_v02.\n");  
        }

        double v[] = {4.5, 45.8, 2.2, 99.9, 6.3, 2.3, -5.6, 1.2, 78.3, 39.4, 0.5, 4.3, 0.1, 54.7};       
        System.out.println("Vetor desordenado v[]:");
        visualizar(v);        
        selectionSort_v01(v); 
        System.out.println("Vetor ordenado v[] (usando a versão v01):");
        visualizar(v);
        
        double vet[] = {4.5, 99.9, 6.3, 2.3, 1.2, 78.3, 39.4, 0.5, 4.3};       
        System.out.println("\nVetor desordenado vet[]:");
        visualizar(vet);        
        selectionSort_v03(vet); 
        System.out.println("Vetor ordenado vet[] (usando a versão v03):");
        visualizar(vet);
    }
    
    public boolean selectionSort_v01(double vetor []) {
        if (vetor == null) return false;   
        for (int i = 0; i < vetor.length - 1; i++) {
            int min = i;
            for (int j = i+1; j < vetor.length; j++) {
                if ( vetor[j] < vetor[min] ) min = j;  //guardo a 'posição' do menor valor
            }            
            //troca o menor valor (que está na posição min) pelo vetor[i]
            double temp = vetor[i];
            vetor[i] = vetor[min];
            vetor[min] = temp;
        }
        return true;
    }
    
    public void selectionSort_v02(double vetor []) throws Exception {
        if (vetor == null) throw new Exception();     
        for (int i = 0; i < vetor.length - 1; i++) {
            //determina a posição min do menor valor encontrado  
            //entre as posições i+1 e vetor.length
            int min = i;
            for (int j = i+1 ; j < vetor.length; j++) {
                if ( vetor[j] < vetor[min] ) min = j;
            }
            //troca os valores do vetor:
            double temp = vetor[i];
            vetor[i] = vetor[min];
            vetor[min] = temp;
        }
    }
    
    public boolean selectionSort_v03(double vetor []) {
        if (vetor == null) return false;   
        for (int i = 0; i < vetor.length - 1; i++) {
            int posMenor = i; 
            double menor = vetor[i];
            for (int j = i+1; j < vetor.length; j++) {
                if ( vetor[j] < menor ) {
                    posMenor = j;
                    menor = vetor[j];  
                }
            }
            //troca os valores vetor[i] com vetor[posMenor]:
            double temp = vetor[i];
            vetor[i] = menor;   //ou vetor[i] = vetor[posMenor];
            vetor[posMenor] = temp;
        }
        return true;
    }

    public void visualizar(double vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + "   ");
        }
        System.out.println();
    }
    
}
