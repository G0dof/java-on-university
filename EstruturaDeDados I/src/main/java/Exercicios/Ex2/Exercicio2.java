package Exercicios.Ex2;

import java.util.ArrayList;

public class Exercicio2 {

    public static void main(String[] args) {
//		Elabore um método e faça os testes necessários para inverter
//		completamente os elementos guardados em um ArrayList.
//		Visualize o ArrayList depois de invertido.

        ArrayList arr1 = new ArrayList();
        arr1.add(4.3); arr1.add(6.1); arr1.add(0.1);
        arr1.add(1.9); arr1.add(2.4); arr1.add(7.2);
        arr1.add(5.5);

        ArrayList arr2 = new ArrayList();
        arr2.add(67.3); arr2.add(7.9); arr2.add(5.1);
        arr2.add(1.8); arr2.add(11.4); arr2.add(98.2);
        
        inverter(arr1);
        inverter(arr2);
    }

    public static void inverter(ArrayList arr) {
        ArrayList arrInvertida = new ArrayList();

        for(int i  = 0; i < arr.size(); i++) {
            arrInvertida.add(arr.get(arr.size()-i-1));
        }
        
        System.out.println(arrInvertida);
    }
}
