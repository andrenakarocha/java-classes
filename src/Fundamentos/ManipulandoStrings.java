package Fundamentos;

public class ManipulandoStrings {
    public static void main(String[] args) {
        String x = "   Salve rapaziada rapaziada   ";
        // Tamanho de caracteres da string
        System.out.println(x.length());
        // Concatenar
        System.out.println(x + "concatenada!");
        // Verificar se contém:
        System.out.println(x.contains("rapaziada"));
        // Retornar o index de alguma palavra ou letras
        System.out.println(x.indexOf("Salve"));
        // Retorna a última sentença de uma palavra
        System.out.println(x.lastIndexOf("rapaziada"));
        // Deixar tudo em CAPS
        System.out.println(x.toUpperCase());
        // Deixar tudo em minúsculo
        System.out.println(x.toLowerCase());
        // Remove os espaços em branco da string
        System.out.println(x.trim());
        // Começa a frase a partir do index especificado
        System.out.println(x.substring(9));
        // Comparar frases, números e etc
        System.out.println(x.equals("Olá!"));
    }
}
