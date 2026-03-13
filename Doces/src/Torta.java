public class Torta extends Doce{
    public Torta() {
    }

    public Torta(String nome, String cor, String peso) {
        super(nome, cor, peso);
    }

    @Override
    public void massa() {
        super.massa();
        IO.println("Salgada");
    }

    @Override
    public void cobertura() {
        super.cobertura();
        IO.println("Catupiry");
    }
}
