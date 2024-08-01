package Aulas;

public class Condições {

    public static void main(String[] args) {
        var calculo = args[0];
        var x = Integer.parseInt(args[1]);
        var y = Integer.parseInt(args[2]);

        // podemos também usar if e else if, porém, estou usando o mais prático para a situação.
        switch (calculo) {
            case "somar" -> somar(x, y);
            case "subtrair" -> subtrair(x, y);
            case "multiplicar" -> multiplicar(x, y);
            case "dividir" -> dividir(x, y);
            default -> System.out.println("Essa não é uma opção válida!");
        }
    }

    static void somar(int x, int y) {
        System.out.println(x + y);
    }

    static void subtrair(int x, int y) {
        System.out.println(x - y);
    }

    static void multiplicar(int x, int y){
        System.out.println(x * y);
    }

    static void dividir(int x, int y){
        System.out.println(x / y);
    }
}
