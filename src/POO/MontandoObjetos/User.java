package POO.MontandoObjetos;

public class User {
    // Só consigo alterar as propriedades do objeto, caso a variável seja public
    // Caso seja private, ela só pode ser alterada dentro do objeto User
    public String firstName;
    public String lastName;
    private String fullName;

    // Também posso usar objetos, dentro de outros objetos, para melhor organização
    public Address address;

    public String getFullName() {
        return firstName + " " + lastName;
    }

    // Neste caso, a váriavel isLogged está definida como privada, pois não quero que NADA além do objeto consiga alterar o valor dela.
    private boolean isLogged;

    // Agora, por meio de um MÉTODO, eu consigo mudar o valor da variável isLogged, usando outros métodos fora do objeto.
    public void setLogged (boolean logged) {
        isLogged = logged;
    }
}
