package com.biolab.sistemacontrolemateriais.entities;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_material") // Aponta para a tabela certa
public class Material {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome; // Mudado de nomeMaterial para nome para bater com o banco
    private int quantidade;

    @Column(name = "valor_unitario") // Garante o mapeamento da sublinha
    private double valorUnitario;

    @Enumerated(EnumType.STRING)
    private Categoria categoria;

    // Como é "Um para Muitos", precisa ser uma Lista!
    @OneToMany(mappedBy = "material")
    private List<Movimentacao> movimentacoes;

    public Material() {}

    public Material(String nome, int quantidade, double valorUnitario, Categoria categoria) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
        this.categoria = categoria;
    }

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }
    public double getValorUnitario() { return valorUnitario; }
    public void setValorUnitario(double valorUnitario) { this.valorUnitario = valorUnitario; }
    public Categoria getCategoria() { return categoria; }
    public void setCategoria(Categoria categoria) { this.categoria = categoria; }
    public List<Movimentacao> getMovimentacoes() { return movimentacoes; }
    public void setMovimentacoes(List<Movimentacao> movimentacoes) { this.movimentacoes = movimentacoes; }
}