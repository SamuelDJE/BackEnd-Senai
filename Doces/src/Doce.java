public abstract class Doce {
    private String nome;
    private String cor;
    private String peso;

    public Doce(){}

    public Doce(String nome, String cor, String peso) {
        this.nome = nome;
        this.cor = cor;
        this.peso = peso;
    }
     public abstract void massa();
     public abstract void cobertura();
}
