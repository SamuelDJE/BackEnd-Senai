import javax.swing.*;


void main() {
    //criando JFrame/Janela principal
    JFrame telaLogin = new JFrame();
    telaLogin.setSize(400,700);
    telaLogin.setLayout(null);

    //Criando seção email
    JLabel labelEmail = new JLabel("Email");
    labelEmail.setBounds(20, 20, 200, 30);

    //Criando caixa em volta de email
    JTextField campoEmail = new JTextField();
    campoEmail.setBounds(20, 50, 300, 40);


    //Criando seção senha
    JLabel labelSenha = new JLabel("Senha");
    labelSenha.setBounds(20, 100, 200, 30);

    //Criando caixa em volta de senha
    JTextField campoSenha = new JTextField();
    campoSenha.setBounds(20, 130, 300, 40);

    //Criando botão login
    JButton login = new JButton("Login");
    login.setBounds(20, 200, 300, 40);

    //Criando botão limpar campos
    JButton limpaCampo = new JButton("Limpar Campos");
    limpaCampo.setBounds(20, 250, 300, 40);

    //Ação do botão login
    login.addActionListener(e-> {
        String email = campoEmail.getText();
        String senha = campoSenha.getText();
        if(email.equals("admin@senai.com") && senha.equals("123456")){
            JOptionPane.showMessageDialog(telaLogin,"Login realizado com sucesso");
        } else if (email.equals("") && senha.equals("")) {
            JOptionPane.showMessageDialog(telaLogin,"Por favor digite um usuário e uma senha");
        } else if (email.isEmpty() || senha.isEmpty()) {
            JOptionPane.showMessageDialog(telaLogin,"Preench todos os campos ");
        } else{
            JOptionPane.showMessageDialog(telaLogin,"Usuário ou senha estão errados");
        }

    });



    //Ação do botão limpar campos
    limpaCampo.addActionListener(e->{
        campoEmail.setText("");
        campoSenha.setText("");
    });


    //adicionando os elementos na tela de login
    telaLogin.add(labelEmail);
    telaLogin.add(labelSenha);
    telaLogin.add(campoEmail);
    telaLogin.add(campoSenha);
    telaLogin.add(login);
    telaLogin.add(limpaCampo);
    //Tela para ver está ativa
    telaLogin.setVisible(true);
}
