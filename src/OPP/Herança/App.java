package OPP.Herança;

public class App {
    public static void main(String[] args) {
        Car car = new Car();
        // Mesmo sem nada escrito no objeto, ele ainda sim consegue usar o método herdado do pai
        car.go();

        Bicicle bike = new Bicicle();
        bike.stop();

        // Esses atributos são únicos da classe.
        System.out.println(car.doors);
        System.out.println(bike.pedals);
  }
}
