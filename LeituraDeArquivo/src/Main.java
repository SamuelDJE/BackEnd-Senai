//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() throws IOException {

    Path caminho = Path.of("/home/Biolab/Área de Trabalho/Texto");


    try {
        Files.lines(caminho).forEach(System.out::println);
    } catch (Exception e) {
        IO.println("Erro no caminho");
    }
}
