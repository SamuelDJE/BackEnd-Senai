public abstract class Conta {
//    Atributos
    private int numero;
    private int agencia;
    private String titular;
    private double saldo;

//    Construtores
    public Conta() {}

    public Conta(int numero, int agencia, String titular, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.titular = titular;
        this.saldo = saldo;
    }

//    Métodos
    public void depositar(double valor){
        IO.println("Você pode depositar 20, 40, 60, 80, 100, 150 ou 200");
    }
    public void sacar(double valor){
        IO.println("Você pode sacar 20, 40, 60, 80, 100, 150 ou 200");

    }
    public void exibirSaldo(){
        IO.println("Seu saldo atual é "+ saldo);
    }
    public abstract void calcularTarifaMensal();

//    Getters e Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
