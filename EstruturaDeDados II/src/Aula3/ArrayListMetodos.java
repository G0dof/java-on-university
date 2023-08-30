package Aula3;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMetodos {
    public static void main(String[] args) {
        // Criando uma ArrayList e adicionando elementos
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Maçã");
        lista.add("Banana");
        lista.add("Laranja");

        // Acessando elementos pelo índice
        String primeiraFruta = lista.get(0); // Retorna "Maçã"

        // Alterando um elemento
        lista.set(1, "Uva"); // Agora a lista contém ["Maçã", "Uva", "Laranja"]

        // Removendo um elemento pelo índice
        lista.remove(2); // Agora a lista contém ["Maçã", "Uva"]

        // Verificando o tamanho da lista
        int tamanho = lista.size(); // Retorna 2

        // Verificando se a lista está vazia
        boolean vazia = lista.isEmpty(); // Retorna false

        // Verificando se a lista contém um elemento
        boolean contemUva = lista.contains("Uva"); // Retorna true

        // Obtendo o índice de um elemento
        int indiceUva = lista.indexOf("Uva"); // Retorna 1

        // Criando uma sublista
        ArrayList<String> subLista = new ArrayList<>(lista.subList(0, 1)); // Contém ["Maçã"]

        // Convertendo a lista em um array
        String[] array = lista.toArray(new String[0]);

        // Adicionando todos os elementos de outra coleção
        ArrayList<String> outraLista = new ArrayList<>(Arrays.asList("Pera", "Manga"));
        lista.addAll(outraLista); // Agora a lista contém ["Maçã", "Uva", "Pera", "Manga"]

        // Removendo todos os elementos de uma coleção
        lista.removeAll(outraLista); // Agora a lista contém ["Maçã", "Uva"]

        // Ordenando a lista
        lista.sort(null); // Ordena alfabeticamente: ["Maçã", "Uva"]

        // Percorrendo a lista com forEach
        lista.forEach(fruta -> System.out.println(fruta));

        // Substituindo todos os elementos com replaceAll
        lista.replaceAll(fruta -> fruta.toUpperCase()); // ["MAÇÃ", "UVA"]

        // Removendo elementos com base em uma condição com removeIf
        lista.removeIf(fruta -> fruta.startsWith("M")); // Agora a lista contém ["UVA"]
    }
}
