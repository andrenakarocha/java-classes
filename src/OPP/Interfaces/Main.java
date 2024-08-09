package OPP.Interfaces;

// A interface é um pouco diferente de classes abstratas
// As interfaces são mais limitadas, enquanto as classes abstratas podem ser aplicadas outras coisas.

public class Main {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

        rabbit.flee();
        hawk.hunt();

        // O peixe, como tem as duas interfaces implementadas, pode usar os dois métodos.
        fish.flee();
        fish.hunt();
    }
}
