public class Gato extends Mamifero{

    @Override
    public void andar() {
        IO.println("Ando sobre quatro patas");
    }

    @Override
    public void comer() {
        IO.println("Comer petisco");
    }
}
