package com.example.Gerenciamento_Produtos.Produto;

import jakarta.persistence.*;

@Entity
@Table (name = "produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nomeProduto;
    private double valorProduto;
    private int quantidadeProduto;

    public Produto (){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public Produto (String nomeProduto, double valorProduto, int quantidadeProduto){
        this.nomeProduto = nomeProduto;
        this.valorProduto = valorProduto;
        this.quantidadeProduto = quantidadeProduto;




    }
}
