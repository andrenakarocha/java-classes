package OPP.Polimorfismo;

public class Dog extends Animal{
    // Usando o @Override, eu posso mudar o método pai, apenas para essa classe filho, no caso, o cachorro
    @Override
    public void eat() {
        System.out.println("chomp chomp");
    }

    // Diferente do primeiro tipo de polimorfismo, Override, aqui eu estou usando o Overload.
    // Onde eu mudo os parametros do método para ele fazer algo um pouco diferente, que encaixa melhor na classe.
    public void eat(int numberOfTimes) {
        for (int i = 0; i < numberOfTimes; i++){
            System.out.println("chomp chomp");
        }
    }
}
