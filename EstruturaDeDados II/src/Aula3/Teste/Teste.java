package Aula3.Teste;

import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("Elemento A");
        arrayList.add("Elemento B");

        System.out.println(arrayList);

        arrayList.add(1, "Elemento C");

        System.out.println(arrayList);
    }
}
