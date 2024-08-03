package Fundamentos;

public class Visibilidade {
    //VISIBILIDADE DE ESCOPO

    // Visibilidade default
    static int x;

    // Visibilidade pública, ou seja, posso acessar a propriedade de OUTROS packages.
    public static int y;

    // Visibilidade privada, ou seja, NÃO posso acessar a propriedade de outros packages. Somente a classe atual pode acessar essa variável
    private static int z;

    public static void main(String[] args) {

    }
}
