package OPP.Encapsulamento;

public class User {

    // Encapsulamento é o ato de deixar as propriedades privadas e acessá-las por métodos getters e setters
    private String firstName;
    private String lastName;


    public User(String firstName, String lastName) {
        this.firstName = firstName.toUpperCase();
        this.lastName = lastName.toUpperCase();
    }

    // Por essa propriedade, posso mudar o primeiro nome
    public void setFirstName(String firstName) {
        this.firstName = firstName.toUpperCase();
    }

    public void setLastName(String lastName) {
        this.lastName = lastName.toUpperCase();
    }

    // Por esse propriedade, posso printar o primeiro nome
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

}
