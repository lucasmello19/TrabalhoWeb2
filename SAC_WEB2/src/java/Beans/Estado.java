
package Beans;

import java.io.Serializable;


public class Estado implements Serializable {
    
    private int idEstado;
    private String siglaEstado;
    private String nomeEstado;

    public Estado(int idEstado, String siglaEstado, String nomeEstado) {
        this.idEstado = idEstado;
        this.siglaEstado = siglaEstado;
        this.nomeEstado = nomeEstado;
    }

    public Estado() { }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public String getSiglaEstado() {
        return siglaEstado;
    }

    public void setSiglaEstado(String siglaEstado) {
        this.siglaEstado = siglaEstado;
    }

    public String getNomeEstado() {
        return nomeEstado;
    }

    public void setNomeEstado(String nomeEstado) {
        this.nomeEstado = nomeEstado;
    }

}
