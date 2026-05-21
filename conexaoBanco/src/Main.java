import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Main {

  public static void main(String[] args) {

    JFrame tela = new JFrame("Tela cadastro");
    tela.setSize(500,1000);
    tela.setLayout(null);

    // Nome
    JLabel nome = new JLabel("Nome");
    nome.setBounds(20, 30, 200, 30);

    JTextField campoNome = new JTextField();
    campoNome.setBounds(20, 50, 300, 40);

    //Email
    JLabel Email = new JLabel("Email");
    Email.setBounds(20, 90, 200, 30);

    JTextField campoEmail = new JTextField();
    campoEmail.setBounds(20, 110, 300, 40);

    JButton enviar = new JButton("Enviar");
    enviar.setBounds(70,200,150,30);

    enviar.addActionListener(e -> {

      String sql =
              "INSERT INTO usuario(nome, email) VALUES(?,?)";

      String nomeCompleto = campoNome.getText();
      String emailUsuario = campoEmail.getText();

      try {

        //Conexão do banco
        Connection conexao = Conexao.conectar();

        PreparedStatement ps =
                conexao.prepareStatement(sql);

        ps.setString(1, nomeCompleto);
        ps.setString(2, emailUsuario);

        ps.executeUpdate();

        JOptionPane.showMessageDialog(
                tela,
                "Usuário salvo com sucesso"
        );

        ps.close();
        conexao.close();

      } catch (Exception ex) {

        throw new RuntimeException(ex);
      }
    });

    tela.add(nome);
    tela.add(campoNome);

    tela.add(Email);
    tela.add(campoEmail);

    tela.add(enviar);

    tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    tela.setVisible(true);
  }
}