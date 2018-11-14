package Beans;

public class Login {
    
    private int idLogin;
    private Usuario emailLogin;
    private Usuario senhaLogin;

    public Login() {
    }

    public Login(int idLogin, Usuario emailLogin, Usuario senhaLogin) {
        this.idLogin = idLogin;
        this.emailLogin = emailLogin;
        this.senhaLogin = senhaLogin;
    }

    public int getIdLogin() {
        return idLogin;
    }

    public void setIdLogin(int idLogin) {
        this.idLogin = idLogin;
    }

    public Usuario getEmailLogin() {
        return emailLogin;
    }

    public void setEmailLogin(Usuario emailLogin) {
        this.emailLogin = emailLogin;
    }

    public Usuario getSenhaLogin() {
        return senhaLogin;
    }

    public void setSenhaLogin(Usuario senhaLogin) {
        this.senhaLogin = senhaLogin;
    }


    
}