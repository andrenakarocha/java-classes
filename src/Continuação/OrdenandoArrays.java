package Continuação;

import java.util.Arrays;

public class OrdenandoArrays {
    public static void main(String[] args) {
        int[] numbers = new int[]{10, 30, 20, 40, 60, 120, 869, 39009, 100};
        Arrays.sort(numbers);

        // Quando você printa direto, ele imprime o hashcode, não a lista real.
        System.out.println(numbers);

        // Agora sim, ele imprime o objeto convertido para uma String.
        System.out.println(Arrays.toString(numbers));
    }
}
