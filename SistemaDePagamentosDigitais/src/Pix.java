public class Pix extends Pagamento{

    public Pix() {
    }

    public Pix(double valor, String destinatario) {
        super(valor, destinatario);
    }

    public boolean validar(double valor, double conta) {
        IO.println("Pix validadado");
        IO.println("Validando compra");
        if (valor >=  conta) {
            IO.println("Pix Realizado no valor de R$"+valor);
            return true;
        }
        else  {
            IO.println("Pix Invalido");
            return false;
        }
    }

    @Override
    public boolean validar() {
        IO.println("Validando Pix");
        IO.println("Pix de R$"+super.getValor()+" enviado para "+super.getDestinatario());
        return true;
    }



    @Override
    public void processar() {
        IO.println("Pix Realizado no valor de R$"+super.getValor());
    }
}