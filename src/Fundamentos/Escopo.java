package Fundamentos;

public class Escopo {
    public static void main(String[] args) {
        if (true){
            int x = 10; // declaração de variável
        }
        // Neste caso, ele não irá printar a variável x, pois a ela é uma variável local, assim que sai de dentro do escopo "IF", a variável é destruída
        // Eu coloquei o x como uma string apenas para o código não ficar com erro, mas o exemplo é tentar printar a variável
        System.out.println("x");

        int x; // declaração de variável
        if (true){
            x = 10; // atribuição de valor
        }
        // Neste caso ele printará, pois o escopo do if apenas muda o valor da variável, porém, o print ainda está no mesmo escopo em que a variável foi declarada.
        System.out.println(x);
    }
}
