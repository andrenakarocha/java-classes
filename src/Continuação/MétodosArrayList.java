package Continuação;

import java.util.ArrayList;
import java.util.List;

public class MétodosArrayList {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        // Adicionando elementos no array
        for (int i = 0; i < 5; i++) {
            names.add("Nome " + i);
            System.out.println(names.get(i));
        }

        // Descobrir o índice  a partir de um elemento
        int index = names.indexOf("Nome 2");
        System.out.println(index);

        // Verifica se a lista está vazia ou não
        System.out.println(names.isEmpty());

        // Verifica se a lista contém algum elemento
        System.out.println(names.contains("Nome 4"));

        // Verifica o tamanho da lista
        System.out.println(names.size());

        // Limpar todos os elementos da lista, sem deletá-la
        names.clear();
        System.out.println(names);
    }
}
