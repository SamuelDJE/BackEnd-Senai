public class Farmaceutico extends Funcionario {
    private int crf;

    public Farmaceutico() {
    }

    public Farmaceutico(String nome, double salario, String cpf, int crf) {
        super(nome, salario, cpf);
        this.crf = crf;
    }

}
