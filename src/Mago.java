public class Mago extends Personagem {
    private double ataqueForte ;
    private String defesaMenor ;

    public Mago() {}

    @Override
    public void mostrarStatus() {
        IO.println("Vida atual de "+ getNome() + " é: " + getVida());
    }

    public Mago(String nome, int vida, int ataque, int defesa, double ataqueForte, String defesaMenor) {
        super(nome, vida, ataque, defesa);
        this.ataqueForte = ataqueForte;
        this.defesaMenor = defesaMenor;
    }

    public void lancarMagia(){
        IO.println("Lançando a Esfera Negra");
        IO.println("Onde havia luz, agora haverá o nada. Onde havia vida, restará apenas o eco do silêncio. Sinta o abraço frio do infinito...");
    }
}
