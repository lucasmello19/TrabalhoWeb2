package Model;

import java.io.Serializable;


public class TipoAtendimento implements Serializable {
    
    private int idTipoAtendimento;
    private String nomeAtendimento;

    
    public int getIdTipoAtendimento() {
        return idTipoAtendimento;
    }

    public void setIdTipoAtendimento(int idTipoAtendimento) {
        this.idTipoAtendimento = idTipoAtendimento;
    }

    public String getNomeAtendimento() {
        return nomeAtendimento;
    }

    public void setNomeAtendimento(String nomeAtendimento) {
        this.nomeAtendimento = nomeAtendimento;
    }

    public TipoAtendimento() { }

    public TipoAtendimento(int idTipoAtendimento, String nomeAtendimento) {
        this.idTipoAtendimento = idTipoAtendimento;
        this.nomeAtendimento = nomeAtendimento;
    }
}
