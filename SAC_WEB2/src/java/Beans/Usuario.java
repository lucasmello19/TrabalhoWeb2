package Beans;

import java.io.Serializable;

public class Usuario implements Serializable {
    
    private int idPessoa;
    private String nomePessoa;
    private String cpfPessoa;
    private String emailPessoa;
    private String ruaPessoa;
    private int nrPessoa;
    private String bairroPessoa;
    private String cepPessoa;
    private String complementoPessoa;
    private String telefonePessoa;
    private String senhaLoginPessoa;
    private Perfil perfilPessoa;
    private Login loginIdPessoa;
    private Cidade idCidadePessoa;
    private Estado idEstadoPessoa;

    public Usuario() {
    }

    public Usuario(int idPessoa, String nomePessoa, String cpfPessoa, String emailPessoa, String ruaPessoa, int nrPessoa, String bairroPessoa, String cepPessoa, String complementoPessoa, String telefonePessoa, String senhaLoginPessoa, Perfil perfilPessoa, Login loginIdPessoa, Cidade idCidadePessoa, Estado idEstadoPessoa) {
        this.idPessoa = idPessoa;
        this.nomePessoa = nomePessoa;
        this.cpfPessoa = cpfPessoa;
        this.emailPessoa = emailPessoa;
        this.ruaPessoa = ruaPessoa;
        this.nrPessoa = nrPessoa;
        this.bairroPessoa = bairroPessoa;
        this.cepPessoa = cepPessoa;
        this.complementoPessoa = complementoPessoa;
        this.telefonePessoa = telefonePessoa;
        this.senhaLoginPessoa = senhaLoginPessoa;
        this.perfilPessoa = perfilPessoa;
        this.loginIdPessoa = loginIdPessoa;
        this.idCidadePessoa = idCidadePessoa;
        this.idEstadoPessoa = idEstadoPessoa;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public String getCpfPessoa() {
        return cpfPessoa;
    }

    public void setCpfPessoa(String cpfPessoa) {
        this.cpfPessoa = cpfPessoa;
    }

    public String getEmailPessoa() {
        return emailPessoa;
    }

    public void setEmailPessoa(String emailPessoa) {
        this.emailPessoa = emailPessoa;
    }

    public String getRuaPessoa() {
        return ruaPessoa;
    }

    public void setRuaPessoa(String ruaPessoa) {
        this.ruaPessoa = ruaPessoa;
    }

    public int getNrPessoa() {
        return nrPessoa;
    }

    public void setNrPessoa(int nrPessoa) {
        this.nrPessoa = nrPessoa;
    }

    public String getBairroPessoa() {
        return bairroPessoa;
    }

    public void setBairroPessoa(String bairroPessoa) {
        this.bairroPessoa = bairroPessoa;
    }

    public String getCepPessoa() {
        return cepPessoa;
    }

    public void setCepPessoa(String cepPessoa) {
        this.cepPessoa = cepPessoa;
    }

    public String getComplementoPessoa() {
        return complementoPessoa;
    }

    public void setComplementoPessoa(String complementoPessoa) {
        this.complementoPessoa = complementoPessoa;
    }

    public String getTelefonePessoa() {
        return telefonePessoa;
    }

    public void setTelefonePessoa(String telefonePessoa) {
        this.telefonePessoa = telefonePessoa;
    }

    public String getSenhaLoginPessoa() {
        return senhaLoginPessoa;
    }

    public void setSenhaLoginPessoa(String senhaLoginPessoa) {
        this.senhaLoginPessoa = senhaLoginPessoa;
    }

    public Perfil getPerfilPessoa() {
        return perfilPessoa;
    }

    public void setPerfilPessoa(Perfil perfilPessoa) {
        this.perfilPessoa = perfilPessoa;
    }

    public Login getLoginIdPessoa() {
        return loginIdPessoa;
    }

    public void setLoginIdPessoa(Login loginIdPessoa) {
        this.loginIdPessoa = loginIdPessoa;
    }

    public Cidade getIdCidadePessoa() {
        return idCidadePessoa;
    }

    public void setIdCidadePessoa(Cidade idCidadePessoa) {
        this.idCidadePessoa = idCidadePessoa;
    }

    public Estado getIdEstadoPessoa() {
        return idEstadoPessoa;
    }

    public void setIdEstadoPessoa(Estado idEstadoPessoa) {
        this.idEstadoPessoa = idEstadoPessoa;
    }

    
    
}
