package OPP.Arrays;

public class App {

    public static void main(String[] args) {
        // Isso é uma array de 10 users
        User[] users = new User[10];

        // Aqui usamos o for para criar um loop e criar esses 10 usuários
        for (int i = 0; i < users.length; i++){
            User actual = new User();
            actual.setFirstName("Nome " + i);
            actual.setLastName("Sobrenome " + i);
            users[i] = actual;
        }

        System.out.println(users[2].getFirstName());
        System.out.println(users[2].getLastName());
    }
}
