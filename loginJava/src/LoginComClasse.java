import javax.swing.*;
import java.util.ArrayList;

void main() {
    // 1. Criando a lista - CORREÇÃO: Usar 'User' com U maiúsculo
    ArrayList<User> usuariosCadastrados = new ArrayList<>();

    JFrame LoginSenai = new JFrame("Sistema SENAI");
    LoginSenai.setSize(400, 600);
    LoginSenai.setLayout(null);

    // --- SEÇÃO USUÁRIO ---
    JLabel labelUser = new JLabel("Usuário:");
    labelUser.setBounds(20, 20, 200, 30);
    LoginSenai.add(labelUser);

    JTextField campoUser = new JTextField();
    campoUser.setBounds(20, 50, 300, 40);
    LoginSenai.add(campoUser);

    // --- SEÇÃO SENHA ---
    JLabel labelSenha = new JLabel("Senha:");
    labelSenha.setBounds(20, 100, 200, 30);
    LoginSenai.add(labelSenha);

    JTextField campoSenha = new JTextField();
    campoSenha.setBounds(20, 130, 300, 40);
    LoginSenai.add(campoSenha);

    // --- BOTÕES ---
    JButton Cadastro = new JButton("Cadastrar");
    Cadastro.setBounds(20, 200, 300, 40);
    LoginSenai.add(Cadastro);

    JButton Login = new JButton("Login");
    Login.setBounds(20, 250, 300, 40);
    LoginSenai.add(Login);

    JButton LimpaCampo = new JButton("Limpar Campos");
    LimpaCampo.setBounds(20, 300, 300, 40);
    LoginSenai.add(LimpaCampo);

    // --- AÇÃO DO BOTÃO CADASTRAR ---
    Cadastro.addActionListener(e -> {
        String nome = campoUser.getText();
        String senha = campoSenha.getText();

        if (nome.isEmpty() || senha.isEmpty()) {
            JOptionPane.showMessageDialog(LoginSenai, "Preencha todos os campos para cadastrar!");
        } else {
            // CORREÇÃO: Usar 'User' para criar o objeto
            User novoUsuario = new User(nome, senha);
            usuariosCadastrados.add(novoUsuario);

            JOptionPane.showMessageDialog(LoginSenai, "Usuário " + nome + " cadastrado!");
            campoUser.setText("");
            campoSenha.setText("");
        }
    });

    // --- AÇÃO DO BOTÃO LOGIN ---
    Login.addActionListener(e -> {
        String nomeDigitado = campoUser.getText();
        String senhaDigitada = campoSenha.getText();
        boolean logado = false;

        // CORREÇÃO: O loop for deve usar 'User'
        for (User u : usuariosCadastrados) {
            if (u.getNomeUser().equals(nomeDigitado) && u.getSenhaUser().equals(senhaDigitada)) {
                logado = true;
                break;
            }
        }

        if (logado) {
            JOptionPane.showMessageDialog(LoginSenai, "Bem-vindo! Login realizado.");
        } else {
            JOptionPane.showMessageDialog(LoginSenai, "Erro: Usuário não encontrado ou senha incorreta.");
        }
    });

    // --- AÇÃO DO BOTÃO LIMPAR ---
    LimpaCampo.addActionListener(e -> {
        campoUser.setText("");
        campoSenha.setText("");
    });

    LoginSenai.setVisible(true);
}
