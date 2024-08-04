package Fundamentos;

import java.util.Scanner;

public class ComparandoStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = "12345";
        System.out.println("Digite a sua senha: ");
        String pass = scanner.nextLine();

        // "==" não compara o conteúdo, mas sim, o local onde foi armazenado:
        // System.out.println(password == pass);
        System.out.println(password.equals(pass));
    }
}
