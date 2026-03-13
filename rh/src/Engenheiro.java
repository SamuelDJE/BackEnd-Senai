public class Engenheiro extends Funcionario{

    private String crea;
    public Engenheiro() {
    }

    @Override
    public double calcularSalario(double valor) {
        return valor - (valor*0.27);
    }

    public Engenheiro(String nome, double salario, String RG, String crea) {
        super(nome, salario, RG);
        this.crea = crea;
    }

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }
}
