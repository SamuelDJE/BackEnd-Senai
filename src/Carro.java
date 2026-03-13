public  class Carro {
    private String modelo;
    private int velocidade;

    public Carro(String modelo, int velocidade) {
        this.modelo = modelo;
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", velocidade=" + velocidade +
                '}';
    }

    public String acelerar(){
        velocidade = velocidade + 10;
        return "Sua velocidade atual é "+velocidade +"km/h";
    }
}