package Beans;

import java.sql.Timestamp;

public class Atendimento {
    
    private Atendimento idAtendimento;
    private Timestamp dtHoraInicioAtendimento;
    private Timestamp dtHoraFimAtendimento;
    private TipoAtendimento idTipoAtendimento;
    private Usuario idUsuAtendimento;
    private Perfil idPerfilUsuAtendimento;
    private Login idLoginUsuAtendimento; 
    private Produto idProdAtendimento;
    private Categoria idCategoriaAtendimento;
    private String situacaoAtendimento;          
    private String descAtendimento;
    private String solucaoAtendimento;

    public Atendimento() {
    }

    public Atendimento(Atendimento idAtendimento, Timestamp dtHoraInicioAtendimento, Timestamp dtHoraFimAtendimento, TipoAtendimento idTipoAtendimento, Usuario idUsuAtendimento, Perfil idPerfilUsuAtendimento, Login idLoginUsuAtendimento, Produto idProdAtendimento, Categoria idCategoriaAtendimento, String situacaoAtendimento, String descAtendimento, String solucaoAtendimento) {
        this.idAtendimento = idAtendimento;
        this.dtHoraInicioAtendimento = dtHoraInicioAtendimento;
        this.dtHoraFimAtendimento = dtHoraFimAtendimento;
        this.idTipoAtendimento = idTipoAtendimento;
        this.idUsuAtendimento = idUsuAtendimento;
        this.idPerfilUsuAtendimento = idPerfilUsuAtendimento;
        this.idLoginUsuAtendimento = idLoginUsuAtendimento;
        this.idProdAtendimento = idProdAtendimento;
        this.idCategoriaAtendimento = idCategoriaAtendimento;
        this.situacaoAtendimento = situacaoAtendimento;
        this.descAtendimento = descAtendimento;
        this.solucaoAtendimento = solucaoAtendimento;
    }

    public Atendimento getIdAtendimento() {
        return idAtendimento;
    }

    public void setIdAtendimento(Atendimento idAtendimento) {
        this.idAtendimento = idAtendimento;
    }

    public Timestamp getDtHoraInicioAtendimento() {
        return dtHoraInicioAtendimento;
    }

    public void setDtHoraInicioAtendimento(Timestamp dtHoraInicioAtendimento) {
        this.dtHoraInicioAtendimento = dtHoraInicioAtendimento;
    }

    public Timestamp getDtHoraFimAtendimento() {
        return dtHoraFimAtendimento;
    }

    public void setDtHoraFimAtendimento(Timestamp dtHoraFimAtendimento) {
        this.dtHoraFimAtendimento = dtHoraFimAtendimento;
    }

    public TipoAtendimento getIdTipoAtendimento() {
        return idTipoAtendimento;
    }

    public void setIdTipoAtendimento(TipoAtendimento idTipoAtendimento) {
        this.idTipoAtendimento = idTipoAtendimento;
    }

    public Usuario getIdUsuAtendimento() {
        return idUsuAtendimento;
    }

    public void setIdUsuAtendimento(Usuario idUsuAtendimento) {
        this.idUsuAtendimento = idUsuAtendimento;
    }

    public Perfil getIdPerfilUsuAtendimento() {
        return idPerfilUsuAtendimento;
    }

    public void setIdPerfilUsuAtendimento(Perfil idPerfilUsuAtendimento) {
        this.idPerfilUsuAtendimento = idPerfilUsuAtendimento;
    }

    public Login getIdLoginUsuAtendimento() {
        return idLoginUsuAtendimento;
    }

    public void setIdLoginUsuAtendimento(Login idLoginUsuAtendimento) {
        this.idLoginUsuAtendimento = idLoginUsuAtendimento;
    }

    public Produto getIdProdAtendimento() {
        return idProdAtendimento;
    }

    public void setIdProdAtendimento(Produto idProdAtendimento) {
        this.idProdAtendimento = idProdAtendimento;
    }

    public Categoria getIdCategoriaAtendimento() {
        return idCategoriaAtendimento;
    }

    public void setIdCategoriaAtendimento(Categoria idCategoriaAtendimento) {
        this.idCategoriaAtendimento = idCategoriaAtendimento;
    }

    public String getSituacaoAtendimento() {
        return situacaoAtendimento;
    }

    public void setSituacaoAtendimento(String situacaoAtendimento) {
        this.situacaoAtendimento = situacaoAtendimento;
    }

    public String getDescAtendimento() {
        return descAtendimento;
    }

    public void setDescAtendimento(String descAtendimento) {
        this.descAtendimento = descAtendimento;
    }

    public String getSolucaoAtendimento() {
        return solucaoAtendimento;
    }

    public void setSolucaoAtendimento(String solucaoAtendimento) {
        this.solucaoAtendimento = solucaoAtendimento;
    }
    
    
    
    
}