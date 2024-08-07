package Continuação;

import java.util.Arrays;

public class PreenchendoArrays {
    public static void main(String[] args) {
        // Uma array com 10 espaços de memória
        String[] names = new String[10];

        // Ao invés de usar um for ou while para encher o array, podemos usar o Arrays.fill()
        // Isso enche o array com um valor padrão
        Arrays.fill(names, "Desconhecido");
        System.out.println(Arrays.toString(names));
    }
}
