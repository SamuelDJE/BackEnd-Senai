public class Gerente extends Funcionario implements Login {
    public Gerente() {}

    public Gerente(String nome, int idade, double salario, String senha) {
        super(nome, idade, salario, senha);
    }

    @Override
    public void login() {
        if(super.getNome() == "adm" && super.getSenha() == "123"){
            IO.println("Bem vindo ao sistema do Suporte de domingo");
        }
        else {
            IO.println("Acesso negado");
        }
    }
    public void gerenciaTarefa(){
        IO.println("Gerencia as demandas");
    }

}
