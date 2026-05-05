import javax.swing.*;

void main() {
    JFrame janela = new JFrame("exemplo");
    janela.setSize(300,200);
    janela.setLayout(null);
//button
    JButton button = new JButton("Clique aqui");
    button.setBounds(20, 20, 150, 40);

    JLabel label = new JLabel("texto");
    label.setBounds(20, 50, 150, 40);

//input
    JTextField input = new JTextField();
    input.setBounds(20,80,150,40);

//ação para o botão
    button.addActionListener(e-> {
        String texto = input.getText();
        JOptionPane.showConfirmDialog( null ,"Você digitou: "+texto);

    });

//Ativando o comando
    janela.add(input);
    janela.add(button);


    janela.setVisible(true);
}
