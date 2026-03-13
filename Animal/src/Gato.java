public class Gato extends Animal{
    public Gato(String nome, String cor, double peso) {
        super(nome, cor, peso);
    }

    public Gato() {

    }

    @Override
    public void fazerSom() {
        super.fazerSom();
        IO.println("Miuu");
    }
}
