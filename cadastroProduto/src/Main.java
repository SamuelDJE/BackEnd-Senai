import javax.swing.*;
import java.util.ArrayList;

void main() {
    //criando o JFrame
    JFrame janelaProduto = new JFrame("Cadastro Produtos");
    janelaProduto.setSize(500, 900);
    janelaProduto.setLayout(null);

    // Criando lista
    ArrayList<Produto> produtosCadastrados = new ArrayList<>();


    //Criando Produto
    JLabel nomeProduto = new JLabel("Nome do Produto");
    nomeProduto.setBounds(20, 20, 200, 30);
    JTextField campoNomeProduto = new JTextField();
    campoNomeProduto.setBounds(20, 50, 300, 40);

    //Criando Preço
    JLabel precoProduto = new JLabel("Preço");
    precoProduto.setBounds(20, 100, 200, 30);
    JTextField campoPrecoProduto = new JTextField();
    campoPrecoProduto.setBounds(20, 130, 300, 40);

    //Criando Quantidade
    JLabel quantidadeProduto = new JLabel("Quantidade");
    quantidadeProduto.setBounds(20, 180, 200, 30);
    JTextField campoQuantidadeProduto = new JTextField();
    campoQuantidadeProduto.setBounds(20, 210, 300, 40);

    //Criando Botão cadastro
    JButton cadastro = new JButton("cadastrar");
    cadastro.setBounds(20, 300, 130, 30);

    //Criando Botão limpar
    JButton limpar = new JButton("Limpar");
    limpar.setBounds(180, 300, 100, 30);

    // Criando Botão exibir resultado
    JTextArea areaResultado = new JTextArea();
    areaResultado.setBounds(20, 350, 440, 200);
    areaResultado.setEditable(false);
    areaResultado.setBorder(BorderFactory.createTitledBorder("Resultado do Cadastro"));



    //Dando ação para os botão cadastro
    cadastro.addActionListener(e -> {
        String nomeP = campoNomeProduto.getText();
        String precoProdutoText = campoPrecoProduto.getText();
        String quantidadeProdutoText = campoQuantidadeProduto.getText();

        if (nomeP.equals("") || precoProdutoText.equals("") || quantidadeProdutoText.equals("")) {
            JOptionPane.showMessageDialog(janelaProduto, "Prencha todos os campos, por favor!");
        } else {
            //Convertente o texto em numeros
            double precoP = Double.parseDouble(campoPrecoProduto.getText());
            int quantidadeP = Integer.parseInt(campoQuantidadeProduto.getText());
            if (precoP <= 0 || quantidadeP <= 0) {
                JOptionPane.showMessageDialog(janelaProduto, "Preço e quantidade devem ser maiores que zero.");
            } else {
                //Criando classe
                Produto produto = new Produto(nomeP, precoP, quantidadeP);
                produtosCadastrados.add(produto);
                double total = precoP * quantidadeP;
                String mensagem = "Produto cadastrado com sucesso!\n\n" + "Nome: " + nomeP + "\n" + "Preço: R$ " + precoP + "\n" + "Quantidade: " + quantidadeP + "\n" + "Valor total em estoque: R$ " + total;

                areaResultado.setText(mensagem);
            }
        }
    });
    //Dando ação para os botão limpar
    limpar.addActionListener(e -> {
        campoNomeProduto.setText("");
        campoPrecoProduto.setText("");
        campoQuantidadeProduto.setText("");
        areaResultado.setText("");
    });


    //Adicionando elementos
    janelaProduto.add(nomeProduto);
    janelaProduto.add(campoNomeProduto);
    janelaProduto.add(precoProduto);
    janelaProduto.add(campoPrecoProduto);
    janelaProduto.add(quantidadeProduto);
    janelaProduto.add(campoQuantidadeProduto);
    janelaProduto.add(cadastro);
    janelaProduto.add(limpar);
    janelaProduto.add(areaResultado);

    //visibilidade da janela
    janelaProduto.setVisible(true);
}
