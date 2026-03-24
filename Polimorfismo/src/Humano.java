public class Humano extends Mamifero{

    @Override
    public void andar() {
        IO.println("Ando sobre duas pernas");
    }

    @Override
    public void comer() {
        IO.println("Comer cachorro quente amo!");
    }
}
