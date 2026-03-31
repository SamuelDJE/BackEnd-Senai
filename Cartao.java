public class Cartao extends Pagamento{
    private double limite;

    public Cartao(double limite) {
        this.limite = limite;
    }

    public Cartao(double valor, String destinatario, double limite) {
        super(valor, destinatario);
        this.limite = limite;
    }


    @Override
    public boolean validar() {
        IO.println("Validando cartão");
        if (super.getValor() > limite) {
            IO.println("Limite insuficiente");
            return false;
        }else {
            IO.println("Compra aprovada");
            return true;
        }
    }

    @Override
    public void processar() {
        double taxa = super.getValor() * 0.02; // 2%
        double total = super.getValor() + taxa;

        IO.println("Pagamento no Cartão aprovado!");
        IO.println("Total com taxa: R$ " + total);
    }
}