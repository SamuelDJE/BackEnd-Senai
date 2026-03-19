public class Guerreiro extends Personagem{
    private double ataqueMedio ;
    private String defesaMaior ;

    public Guerreiro() {}

    public Guerreiro(String nome, int vida, int ataque, int defesa, double ataqueMedio, String defesaMaior) {
        super(nome, vida, ataque, defesa);
        this.ataqueMedio = ataqueMedio;
        this.defesaMaior = defesaMaior;
    }

    public void golpePesado(int poder){
        IO.println("Golpe pesado ativado");
        if (getVida()>= 40) {
            golpePesado(70);
        }else {
            IO.println("");
        }
    }

    @Override
    public int atacar() {

        return 0;
    }

    @Override
    public void receberDano(int dano) {

        super.receberDano(dano);
    }

    @Override
    public void mostrarStatus() {
        IO.println("Vida atual de "+ getNome() + " é: " + getVida());
    }
}
