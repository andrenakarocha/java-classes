package OPP.MontandoObjetos;

public class App {
    public static void main(String[] args) {
        User user1 = new User();
        user1.firstName = "André";
        user1.lastName = "Rocha";

        // Usando um método para pegar o nome inteiro de um usuário
        String fullname = user1.getFullName();
        System.out.println(fullname);

        // Usando o método, posso alterar o valor da variável caso identifique que o usuário está logado.
        user1.setLogged(true);
    }
}
