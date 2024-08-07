package Continuação;

import java.util.Scanner;

public class Algoritmos {
    public static void main(String[] args) {
        // FIBONACCI
        Scanner input = new Scanner(System.in);

        int num1 = 0;
        int num2 = 1;
        int limit = input.nextInt();

        int i = 0;
        while (i < limit) {
            int num3 = num1 + num2;
            System.out.println(num1 + "+" + num2 + "=" + num3);
            num1 = num2;
            num2 = num3;
            i++;
        }
    }
}
