package POO.SettersEGetters;

public class User {
    // Normalmente, no Java, mantemos as propriedades do objeto privadas e utilizamos métodos para mudar essas propriedades.
    // Por exemplo:

    private String firstName;
    private String lastName;

    // Qual a vantagem disso? Poder manipular a string da maneira que eu preferir.
    // SETTER:
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // GETTER:
    public String getFirstName() {
        return firstName;
    }
}
