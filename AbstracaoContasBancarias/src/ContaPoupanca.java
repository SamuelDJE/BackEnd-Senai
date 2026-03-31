public class ContaPoupanca extends Conta {
    // Atributos
    private String titular;
    private double saldo;

    //    Construtores
    public ContaPoupanca() {}

    public ContaPoupanca(int numero, int agencia, String titular, double saldo, String titular1, double saldo1) {
        super(numero, agencia, titular, saldo);
        this.titular = titular1;
        this.saldo = saldo1;
    }
//    Getters e Setters


    @Override
    public String getTitular() {
        return titular;
    }

    @Override
    public void setTitular(String titular) {
        this.titular = titular;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

    @Override
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //    MétodoAbistrato
    @Override
    public void calcularTarifaMensal() {
        IO.println("Está conta esta isenta de tarifa");
        IO.println("Seu saldo final é"+ saldo);
    }
}
