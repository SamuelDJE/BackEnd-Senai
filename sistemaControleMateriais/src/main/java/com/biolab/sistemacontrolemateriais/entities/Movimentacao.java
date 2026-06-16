package com.biolab.sistemacontrolemateriais.entities;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_movimentacao") // Aponta para a tabela certa
public class Movimentacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "data_movimentacao")
    private LocalDateTime dataMovimentacao; // Alterado de String para LocalDateTime

    private int quantidade;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_movimentacao")
    private TipoMovimentacao tipoMovimentacao;

    @ManyToOne
    @JoinColumn(name = "material_id") // Nome exato da coluna de FK que está na sua foto
    private Material material;

    public Movimentacao() {}

    public Movimentacao(TipoMovimentacao tipoMovimentacao, LocalDateTime dataMovimentacao, int quantidade, Material material) {
        this.tipoMovimentacao = tipoMovimentacao;
        this.dataMovimentacao = dataMovimentacao;
        this.quantidade = quantidade;
        this.material = material;
    }

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public LocalDateTime getDataMovimentacao() { return dataMovimentacao; }
    public void setDataMovimentacao(LocalDateTime dataMovimentacao) { this.dataMovimentacao = dataMovimentacao; }
    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }
    public TipoMovimentacao getTipoMovimentacao() { return tipoMovimentacao; }
    public void setTipoMovimentacao(TipoMovimentacao tipoMovimentacao) { this.tipoMovimentacao = tipoMovimentacao; }
    public Material getMaterial() { return material; }
    public void setMaterial(Material material) { this.material = material; }
}