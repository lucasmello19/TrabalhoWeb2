package Model;

public class Login {
    
    private int idLogin;
    private String emailLogin;
    private String senhaLogin;

    public Login() {
    }

    public Login(int idLogin, String emailLogin, String senhaLogin) {
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

    public String getEmailLogin() {
        return emailLogin;
    }

    public void setEmailLogin(String emailLogin) {
        this.emailLogin = emailLogin;
    }

    public String getSenhaLogin() {
        return senhaLogin;
    }

    public void setSenhaLogin(String senhaLogin) {
        this.senhaLogin = senhaLogin;
    }


    
}