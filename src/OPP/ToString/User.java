package OPP.ToString;

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

    // Aqui eu posso mudar o método toString da forma que eu quiser, por exemplo, imprimindo a estrutura do User:
    public String toString() {
        return "User {" + "firstName=" + firstName + "," + "lastName=" + lastName + "}";
    }
}
