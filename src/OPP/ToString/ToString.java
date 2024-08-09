package OPP.ToString;

public class ToString {
    public static void main(String[] args) {
        // Usei o user de uma aula de POO para não criar outro
        User userA = new User("André", "Rocha");

        // Todos os objetos possuem uma função toString()
        // Aqui a função já está formatada da minha forma:
        System.out.println(userA.toString());
    }
}
