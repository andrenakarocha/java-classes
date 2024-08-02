package Aulas;

import java.util.Scanner;

public class Interação {
    public static void main(String[] args) {
        // O scanner é usado para pedir o input de um usuário
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva o seu nome: ");
        // Esse é o pedido do input:
        String nome = scanner.nextLine();
        System.out.println("Olá " + nome);
    }
}
