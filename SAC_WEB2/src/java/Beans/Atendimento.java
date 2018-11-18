package Beans;

import java.sql.Timestamp;

public class Atendimento {
    
    private Integer idAtendimento;
    private Timestamp dtHoraInicioAtendimento;
    private Timestamp dtHoraFimAtendimento;
    private Integer idTipoAtendimento;
    private Integer idUsuAtendimento;
    private Integer idPerfilUsuAtendimento;
    private Integer idLoginUsuAtendimento; 
    private Integer idProdAtendimento;
    private Integer idCategoriaAtendimento;
    private String situacaoAtendimento;          
    private String descAtendimento;
    private String solucaoAtendimento;

    public Atendimento() {
    }

    public Atendimento(Integer idAtendimento, Timestamp dtHoraInicioAtendimento, Timestamp dtHoraFimAtendimento, Integer idTipoAtendimento, Integer idUsuAtendimento, Integer idPerfilUsuAtendimento, Integer idLoginUsuAtendimento, Integer idProdAtendimento, Integer idCategoriaAtendimento, String situacaoAtendimento, String descAtendimento, String solucaoAtendimento) {
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

    public Integer getIdAtendimento() {
        return idAtendimento;
    }

    public void setIdAtendimento(Integer idAtendimento) {
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

    public Integer getIdTipoAtendimento() {
        return idTipoAtendimento;
    }

    public void setIdTipoAtendimento(Integer idTipoAtendimento) {
        this.idTipoAtendimento = idTipoAtendimento;
    }

    public Integer getIdUsuAtendimento() {
        return idUsuAtendimento;
    }

    public void setIdUsuAtendimento(Integer idUsuAtendimento) {
        this.idUsuAtendimento = idUsuAtendimento;
    }

    public Integer getIdPerfilUsuAtendimento() {
        return idPerfilUsuAtendimento;
    }

    public void setIdPerfilUsuAtendimento(Integer idPerfilUsuAtendimento) {
        this.idPerfilUsuAtendimento = idPerfilUsuAtendimento;
    }

    public Integer getIdLoginUsuAtendimento() {
        return idLoginUsuAtendimento;
    }

    public void setIdLoginUsuAtendimento(Integer idLoginUsuAtendimento) {
        this.idLoginUsuAtendimento = idLoginUsuAtendimento;
    }

    public Integer getIdProdAtendimento() {
        return idProdAtendimento;
    }

    public void setIdProdAtendimento(Integer idProdAtendimento) {
        this.idProdAtendimento = idProdAtendimento;
    }

    public Integer getIdCategoriaAtendimento() {
        return idCategoriaAtendimento;
    }

    public void setIdCategoriaAtendimento(Integer idCategoriaAtendimento) {
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