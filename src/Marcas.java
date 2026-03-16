public abstract class Marcas {
    private String anoLançamento;
    private String modelo;
    private String cor;

    public Marcas(){}

    public Marcas(String anoLançamento, String modelo, String cor) {
        this.anoLançamento = anoLançamento;
        this.modelo = modelo;
        this.cor = cor;
    }

    public abstract void qualidadeCamera();
    public abstract void som();
}
