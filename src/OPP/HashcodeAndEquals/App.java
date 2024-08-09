package OPP.HashcodeAndEquals;

public class App {
    public static void main(String[] args) {
        User userA = new User("André", "Rocha");
        User userB = new User("André", "Rocha");

        // Isso será false, por que mesmo sendo iguais, o equals compara os Hashcodes
        // Porém com os métodos sobrescrevidos no user, ele da verdadeiro, comparando as propriedades.
        System.out.println(userA.equals(userB));
    }
}
