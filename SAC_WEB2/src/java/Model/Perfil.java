package Model;

import java.io.Serializable;

public class Perfil implements Serializable {
    
    private int idPerfil;
    private String descricaoPerfil;

    public Perfil(int idPerfil, String descricaoPerfil) {
        this.idPerfil = idPerfil;
        this.descricaoPerfil = descricaoPerfil;
    }

    public Perfil() { }
    
    public int getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(int idPerfil) {
        this.idPerfil = idPerfil;
    }

    public String getDescricaoPerfil() {
        return descricaoPerfil;
    }

    public void setDescricaoPerfil(String descricaoPerfil) {
        this.descricaoPerfil = descricaoPerfil;
    }
    
}
