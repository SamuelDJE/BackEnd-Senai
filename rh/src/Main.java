//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Farmaceutico farmaceutico = new Farmaceutico();
    IO.println(farmaceutico.calcularSalario(7000));

    Engenheiro engenheiro = new Engenheiro();
    IO.println(engenheiro.calcularSalario(7000));

}
