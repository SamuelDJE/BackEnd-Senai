public class main {
    static void main() {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Jorge");
        IO.println(funcionario.getNome());
        funcionario.setCargo("Jovem aprendiz");
        IO.println(funcionario.getCargo());
        funcionario.setSalario(853);
        IO.println(funcionario.getSalario());
        funcionario.setSetor("Telemarkting");
        IO.println(funcionario.getSetor());

    }
}