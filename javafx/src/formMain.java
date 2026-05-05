import javax.swing.*; // importa JFrame
import java.util.ArrayList; // importa a Lista // importa classe pessoa

void main() {

    ArrayList<Pessoa> listaPessoasCadastradas = new ArrayList<>();

    // Cria a janela principal
    JFrame formulario = new JFrame("Formulário de Cadastro");
    formulario.setSize(400, 600); // Aumentei um pouco a altura para caber tudo
    formulario.setLayout(null); // Permite que a gente escolha a posição exata (x, y)

    // --- SEÇÃO: NOME ---
    JLabel labelNome = new JLabel("Nome:");
    labelNome.setBounds(20, 20, 200, 40); // Posição no topo

    JTextField campoNome = new JTextField();
    campoNome.setBounds(20, 60, 300, 30); // Caixa logo abaixo do texto "Nome"

    // --- SEÇÃO: E-MAIL ---
    JLabel labelEmail = new JLabel("E-mail:");
    labelEmail.setBounds(20, 110, 200, 40); // Pula um espaço para baixo

    JTextField campoEmail = new JTextField();
    campoEmail.setBounds(20, 150, 300, 30);

    // --- SEÇÃO: TELEFONE ---
    JLabel labelTelefone = new JLabel("Telefone:");
    labelTelefone.setBounds(20, 200, 200, 40); // Começa na posição Y=200

    JTextField campoTelefone = new JTextField();
    campoTelefone.setBounds(20, 240, 300, 30); // Caixa do telefone

    // --- SEÇÃO: BOTÃO ---
    JButton botaoEnviar = new JButton("Cadastrar Dados");
    botaoEnviar.setBounds(20, 300, 150, 40); // Colocado abaixo de todos os campos

    // O que acontece quando clica no botão
    botaoEnviar.addActionListener(e -> {
       //Criando a classe
        Pessoa novaPessoa = new Pessoa(campoNome.getText(),campoEmail.getText(), campoTelefone.getText());
        listaPessoasCadastradas.add(novaPessoa);

        JOptionPane.showMessageDialog(formulario, "Pessoa: " + novaPessoa.getNome() + "\nSalva com sucesso!");

        // Limpa os campos para o próximo
        campoNome.setText("");
        campoEmail.setText("");
        campoTelefone.setText("");

    });
    JButton botaoMostrar = new JButton("Mostrar Lista");
    botaoMostrar.setBounds(180, 300, 150, 40);

    botaoMostrar.addActionListener(e -> {
        String textoLista = "--- PESSOAS CADASTRADAS ---\n";

        // Percorremos a lista usando os GETTERS que você criou na classe
        for (Pessoa p : listaPessoasCadastradas) {
            textoLista += "Nome: " + p.getNome() + " | Tel: " + p.getTelefone() + "\n";
        }

        // Se a lista estiver vazia, avisa o usuário
        if (listaPessoasCadastradas.isEmpty()) {
            textoLista = "Ninguém cadastrado ainda!";
        }

        JOptionPane.showMessageDialog(formulario, textoLista);
    });
    // Adicionando tudo no formulário
    formulario.add(labelNome);
    formulario.add(campoNome);
    formulario.add(labelEmail);
    formulario.add(campoEmail);
    formulario.add(labelTelefone);
    formulario.add(campoTelefone);
    formulario.add(botaoEnviar);
    formulario.add(botaoMostrar);


    // Faz a janela aparecer na tela
    formulario.setVisible(true);
}
