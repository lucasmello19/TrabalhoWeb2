package Beans;

import java.io.Serializable;


public class Produto implements Serializable{
    
    private int idProduto;
    private String descricaoProduto;
    private int pesoProduto;
    private Categoria categoriaId;
    private String nomeProduto;

    public Produto(int idProduto, String descricaoProduto, int pesoProduto, Categoria categoriaId, String nomeProduto) {
        this.idProduto = idProduto;
        this.descricaoProduto = descricaoProduto;
        this.pesoProduto = pesoProduto;
        this.categoriaId = categoriaId;
        this.nomeProduto = nomeProduto;
    }

    public Produto() {
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public int getPesoProduto() {
        return pesoProduto;
    }

    public void setPesoProduto(int pesoProduto) {
        this.pesoProduto = pesoProduto;
    }

    public Categoria getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(Categoria categoriaId) {
        this.categoriaId = categoriaId;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    
}
