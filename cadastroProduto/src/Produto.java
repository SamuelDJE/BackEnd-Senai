public class Produto {
    private String Nome;
    private double Preco;
    private int quantidade;

    public Produto() {}

    public Produto(String nome, double preco, int quantidade) {
        Nome = nome;
        Preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public double getPreco() {
        return Preco;
    }

    public void setPreco(double preco) {
        Preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
