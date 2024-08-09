package OPP.ClassesAbstratas;

public class Car extends Vehicle{

    // Sou forçado a implementar essa função, pois vem da classe abstrata pai
    @Override
    void go() {
        System.out.println("The car is moving");
    }
}
