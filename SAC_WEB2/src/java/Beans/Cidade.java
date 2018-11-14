package Beans;

import java.io.Serializable;

public class Cidade implements Serializable{
    
    private int idCidade;
    private String nomeCidade;
    private Estado idEstado;

    public Cidade(int idCidade, String nomeCidade, Estado idEstado) {
        this.idCidade = idCidade;
        this.nomeCidade = nomeCidade;
        this.idEstado = idEstado;
    }

    public Cidade() { }

    
    public int getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(int idCidade) {
        this.idCidade = idCidade;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    public Estado getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Estado idEstado) {
        this.idEstado = idEstado;
    }
    
}
