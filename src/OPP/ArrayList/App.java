package OPP.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // Usando o ArrayList, eu não preciso definir os espaçoes, pois ele define os espaços dinamicamente.
        List<User> users = new ArrayList<>();

        // Aqui usarei um while para apenas criar 10 usuários aleatórios, mostrando que o tamanho da lista é dinâmico
        int i = 0;
        while (i < 10) {
            User current = new User("Nome " + i, "Sobrenome" + i);
            users.add(current);
            i++;
        }

        // Ao invés de usar o index para achar o usuário, usamos a função "get()"
        System.out.println(users.get(0).getFirstName());
        System.out.println(users.get(0).getLastName());
    }
}
