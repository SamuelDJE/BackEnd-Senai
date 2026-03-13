public class AAPM {
    private String unidade;
    private String cnpj;
    private Double saldoCaixa;


    public AAPM(String unidade, String cnpj, Double saldoCaixa) {
        this.unidade = unidade;
        this.cnpj = cnpj;
        this.saldoCaixa = saldoCaixa;

    }

    public Double getSaldoCaixa() {
        return saldoCaixa;
    }

    public String setSaldoCaixa(Double saldoCaixa) {
        if (this.saldoCaixa <= 500) {
         return   "Não podemos libera mais verbo por conta do limite de seguração";
        }
        else {
            return "nada";
        }
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getUnidade() {
        return unidade;
    }
}
