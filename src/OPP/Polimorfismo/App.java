package OPP.Polimorfismo;

public class App {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Dog myDog = new Dog();
        Cat myCat = new Cat();

        // O polimorfismo é o ato de fazer a MESMA coisa, de formas diferentes.
        myAnimal.eat();
        // Usando o polimorfismo, eu mudei o método eat() para a classe dog apenas.
        myDog.eat();
        // Posso fazer a mesma coisa com a classe cat
        myCat.eat();


        // Como o cachorro agora tem um outro tipo de método eat com parâmetros, caso eu passe, eles são atendidos.
        myDog.eat(3);
        // Mas caso eu não passe nada, ele continua usando o método padrão
        myDog.eat();
    }
}
