package OPP.Construtor;

public class App {

    public static void main(String[] args) {
        // Essa é uma diferente forma de criar uma array de usuários
        // Usando o método Construtor, posso criar os objetos e passar propriedades logo ao criá-los
        User[] users = new User[] {
                new User("André", "Rocha"),
                new User("João", "Rodriguez"),
                new User("Joaquim", "Silva")
        };
    }

}
