package Fundamentos;

// Criando números aleatórios com LOOP
import java.util.Random;

public class Loops {
    public static void main(String[] args) {
        var generate = new Random();

        var i = 0;
        while (i < 6) {
            var number = generate.nextInt(60);
            System.out.println(number);
            i++;
        }

//        Mesma lógica, usando o for
//        for (var i = 0; i < 6; i++){
//            var number = generate.nextInt(60);
//            System.out.println(number);
//        }
    }
}
