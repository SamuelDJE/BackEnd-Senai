//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Mago mago = new Mago();
    mago.setNome("Dumbledor");
    mago.setAtaque(60);
    mago.setDefesa(30);

    Guerreiro guerreiro = new Guerreiro();
    guerreiro.setNome("Arto||");
    guerreiro.setAtaque(50);
    guerreiro.setDefesa(40);

    Arqueiro arqueiro= new Arqueiro();
    arqueiro.setNome("Holi");
    arqueiro.setAtaque(40);
    arqueiro.setDefesa(50);

    IO.println(guerreiro.getNome()+" atacou o "+arqueiro.getNome());
    guerreiro.receberDano(arqueiro.atacar());
    guerreiro.mostrarStatus();


}
