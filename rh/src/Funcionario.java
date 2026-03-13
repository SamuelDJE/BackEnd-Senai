public abstract class Funcionario {
    private String nome;
    private double salario;
    private String RG;

    public Funcionario(){}

    public Funcionario(String nome, double salario, String RG) {
        this.nome = nome;
        this.salario = salario;
        this.RG = RG;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }
    public abstract double calcularSalario(double valor);



    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }
}
