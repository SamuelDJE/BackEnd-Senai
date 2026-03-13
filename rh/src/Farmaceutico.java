public class Farmaceutico extends Funcionario{
    private String crf;

    public Farmaceutico() {
    }

    @Override
    public double calcularSalario(double valor) {
        return valor - (valor*0.15);
    }

    public Farmaceutico(String nome, double salario, String RG, String crf) {
        super(nome, salario, RG);
        this.crf = crf;
    }

    public String getCrf() {
        return crf;
    }

    public void setCrf(String crf) {
        this.crf = crf;
    }
}
