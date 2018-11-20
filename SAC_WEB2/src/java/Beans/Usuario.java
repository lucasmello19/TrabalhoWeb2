package Beans;

import java.io.Serializable;

public class Usuario implements Serializable {
    
    private int idUsuario;
    private String nomeUsuario;
    private String cpfUsuario;
    private String emailUsuario;
    private String ruaUsuario;
    private int nrUsuario;
    private String bairroUsuario;
    private String cepUsuario;
    private String complementoUsuario;
    private String telefoneUsuario;
    private String senhaLoginUsuario;
    private int perfilUsuario;
    private int loginIdUsuario;
    private int idCidadeUsuario;
    private int idEstadoUsuario;

    public Usuario() {
    }

    public Usuario(int idUsuario, String nomeUsuario, String cpfUsuario, String emailUsuario, String ruaUsuario, int nrUsuario, String bairroUsuario, String cepUsuario, String complementoUsuario, String telefoneUsuario, String senhaLoginUsuario, int perfilUsuario, int loginIdUsuario, int idCidadeUsuario, int idEstadoUsuario) {
        this.idUsuario = idUsuario;
        this.nomeUsuario = nomeUsuario;
        this.cpfUsuario = cpfUsuario;
        this.emailUsuario = emailUsuario;
        this.ruaUsuario = ruaUsuario;
        this.nrUsuario = nrUsuario;
        this.bairroUsuario = bairroUsuario;
        this.cepUsuario = cepUsuario;
        this.complementoUsuario = complementoUsuario;
        this.telefoneUsuario = telefoneUsuario;
        this.senhaLoginUsuario = senhaLoginUsuario;
        this.perfilUsuario = perfilUsuario;
        this.loginIdUsuario = loginIdUsuario;
        this.idCidadeUsuario = idCidadeUsuario;
        this.idEstadoUsuario = idEstadoUsuario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getCpfUsuario() {
        return cpfUsuario;
    }

    public void setCpfUsuario(String cpfUsuario) {
        this.cpfUsuario = cpfUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getRuaUsuario() {
        return ruaUsuario;
    }

    public void setRuaUsuario(String ruaUsuario) {
        this.ruaUsuario = ruaUsuario;
    }

    public int getNrUsuario() {
        return nrUsuario;
    }

    public void setNrUsuario(int nrUsuario) {
        this.nrUsuario = nrUsuario;
    }

    public String getBairroUsuario() {
        return bairroUsuario;
    }

    public void setBairroUsuario(String bairroUsuario) {
        this.bairroUsuario = bairroUsuario;
    }

    public String getCepUsuario() {
        return cepUsuario;
    }

    public void setCepUsuario(String cepUsuario) {
        this.cepUsuario = cepUsuario;
    }

    public String getComplementoUsuario() {
        return complementoUsuario;
    }

    public void setComplementoUsuario(String complementoUsuario) {
        this.complementoUsuario = complementoUsuario;
    }

    public String getTelefoneUsuario() {
        return telefoneUsuario;
    }

    public void setTelefoneUsuario(String telefoneUsuario) {
        this.telefoneUsuario = telefoneUsuario;
    }

    public String getSenhaLoginUsuario() {
        return senhaLoginUsuario;
    }

    public void setSenhaLoginUsuario(String senhaLoginUsuario) {
        this.senhaLoginUsuario = senhaLoginUsuario;
    }

    public int getPerfilUsuario() {
        return perfilUsuario;
    }

    public void setPerfilUsuario(int perfilUsuario) {
        this.perfilUsuario = perfilUsuario;
    }

    public int getLoginIdUsuario() {
        return loginIdUsuario;
    }

    public void setLoginIdUsuario(int loginIdUsuario) {
        this.loginIdUsuario = loginIdUsuario;
    }

    public int getIdCidadeUsuario() {
        return idCidadeUsuario;
    }

    public void setIdCidadeUsuario(int idCidadeUsuario) {
        this.idCidadeUsuario = idCidadeUsuario;
    }

    public int getIdEstadoUsuario() {
        return idEstadoUsuario;
    }

    public void setIdEstadoUsuario(int idEstadoUsuario) {
        this.idEstadoUsuario = idEstadoUsuario;
    }

    public void setIdPessoa(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setIdCidadeUsuario(String itapetininga) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setIdEstadoUsuario(String são_paulo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
}