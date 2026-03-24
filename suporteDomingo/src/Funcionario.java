public class Funcionario{
    private String nome;
    private int idade;
    private double salario;
    private String senha;

    public Funcionario() {}

    public Funcionario(String nome, int idade, double salario, String senha) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
