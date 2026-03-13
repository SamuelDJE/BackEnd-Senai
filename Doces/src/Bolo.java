public class Bolo extends Doce{
    public Bolo() {
    }

    public Bolo(String nome, String cor, String peso) {
        super(nome, cor, peso);
    }

    @Override
    public void massa() {
        super.massa();
        IO.println("Molhada de ninho");
    }
    @Override
    public void cobertura() {
        super.cobertura();
        IO.println(" Nutella com Uva");
    }
}
