public abstract class Personagem {
    private String nome;
    private int vida = 100;
    private int ataque;
    private int defesa;

    public Personagem() {}

    public Personagem(String nome, int vida, int ataque, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public  int atacar(){

        return ataque;
    }
    public void receberDano(int dano){
        int danoReal = dano- defesa;
       // int vidaAtual = getVida();
        if(danoReal == 99){
            IO.println("O alvo esta em ponto critico...");
        }
        else if(danoReal == 0){
            IO.println("A defesa absorveu todo o impacto!");

        }
        else if (danoReal >= 0){
            vida = vida - danoReal;
            IO.println("Dano sofrido: "+ danoReal+"%");
            IO.println("vida atual "+vida);
        }
        else{
            IO.println("Alvo eliminado");
            vida = vida - danoReal;
        }


    }
    public abstract void mostrarStatus();
}
