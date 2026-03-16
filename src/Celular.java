public class Celular extends Marcas {
    public Celular() {}

    public Celular(String anoLançamento, String modelo, String cor) {
        super(anoLançamento, modelo, cor);
    }

    @Override
    public void qualidadeCamera() {
        System.out.println("Exelente");
    }

    @Override
    public void som() {
        System.out.println("Zumzum");
    }
}