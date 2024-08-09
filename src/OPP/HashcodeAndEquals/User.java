package OPP.HashcodeAndEquals;

import java.util.Objects;

public class User {

    private String firstName;
    private String lastName;

    // Esse é o Construtor, o método que executa primeiro quando um objeto "ganha vida"
    // Ao usar o contrutor, podemos já definir propriedades padrões na criação do objeto, não precisando usar os Setters
    public User(String firstName, String lastName) {
        this.firstName = firstName.toUpperCase();
        this.lastName = lastName.toUpperCase();
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName.toUpperCase();
    }

    public void setLastName(String lastName) {
        this.lastName = lastName.toUpperCase();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    // Aqui eu apertei "shift + shift" e ele sobrescreveu os métodos.
    // Agora ele compara as propriedades, não os hashcodes
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
