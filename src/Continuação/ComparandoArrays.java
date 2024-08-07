package Continuação;

import java.util.Arrays;

public class ComparandoArrays {
    public static void main(String[] args) {
        int[] numbersA = new int[]{1, 2, 3};
        int[] numbersB = new int[]{1, 2, 3};

        // Nesse caso, caso eu use o equals(), não funcionará
        System.out.println(numbersA.equals(numbersB));

        // Para comparar o conteúdo dos arrays, usa-se o Arrays.equals()
        System.out.println(Arrays.equals(numbersA, numbersB));
    }
}
