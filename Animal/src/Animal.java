public class Animal {
    private String nome;
    private String cor;
    private  double peso;

    public Animal(){}

    public Animal(String nome, String cor, double peso) {
        this.nome = nome;
        this.cor = cor;
        this.peso = peso;
    }

    public void fazerSom(){
        IO.println("o som é: ");
    }

}
