package Fundamentos;

import java.util.Scanner;

public class Casting {
    public static void main(String[] args) {
        // Convertendo tipos primitivos

        double dd = 10.10;
        short ss = 32;

        // Neste caso eu converto do meu número de double para float após a divisão
        float x = (float) dd / ss;
        // Posso também converter para um inteiro, neste caso, ficará apenas 0
        int y = (int) dd / ss;

        // Posso também converter um input de usuário, como neste caso:
        Scanner scanner = new Scanner(System.in);
        int z = (int) scanner.nextDouble();
        // Nesse caso, estou esperando um Double do usuário, porém,convertendo o mesmo para int
        System.out.println(z);
    }
}
