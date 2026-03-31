import java.time.LocalDate;

public class Boleto extends Pagamento{

    private String codigoBarras;
    private LocalDate dataVencimento;

    public Boleto(double valor, String codigoBarras, LocalDate dataVencimento) {
        super(valor," ");
        this.codigoBarras = codigoBarras;
        this.dataVencimento = dataVencimento;
    }

    @Override
    public boolean validar() {

        if (super.getValor() <= 0) {
            IO.println("Valor inválido");
            return false;
        } else if (codigoBarras == null || codigoBarras.length() < 10) {

            IO.println("Código de barras inválido");
            return false;
        }
        else if (dataVencimento.isBefore(LocalDate.now())) {
            IO.println("Boleto vencido");
            return false;
        }

        return true;
    }

    @Override
    public void processar() {
        IO.println("Boleto gerado com sucesso!");
    }

}