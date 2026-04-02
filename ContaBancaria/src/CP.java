public class CP  extends Conta{
    public CP() {
    }

    public CP(int numero, int agencia, double saldo, String titular) {
        super(numero, agencia, saldo, titular);
    }

    @Override
    public void calcularTarafiaMensal() {
        IO.println("Conta isenta de tarifa mensal");
        exibirSaldo();
    }
}
