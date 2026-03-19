public class Arqueiro extends Personagem{
    private double ataqueRapido ;
    private String defesaMedia;

    public Arqueiro() {}

    public Arqueiro(String nome, int vida, int ataque, int defesa, double ataqueRapido, String defesaMedia) {
        super(nome, vida, ataque, defesa);
        this.ataqueRapido = ataqueRapido;
        this.defesaMedia = defesaMedia;
    }

    @Override
    public int atacar() {
        return super.atacar()*2;
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
