package DataAccessObject;

import Connection.ConnectionFactory;
import Model.Login;
import Model.Usuario;
import Servlets.LoginServlet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import static sun.security.jgss.GSSUtil.login;

public class LoginDao {
    
              
        private static final String SQL_FIND_LOGIN = "SELECT email, senha FROM tb_usuario WHERE email=? and senha=?";

    
        public Login PesqUsuarioLogin (String login, String senha) throws SQLException  {

        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement pstm = null;
        ResultSet rs = null;
        
        Login usu = new Login();
        
        try {
            pstm = conn.prepareStatement(SQL_FIND_LOGIN);
            {
                pstm.setString(1, login);
                //usu.setLogin(usuario);
                pstm.setString(2, senha);
                //usu.setSenha(senha);
            }rs = pstm.executeQuery();
            if (rs.next()){
            //cliente.setId(rs.getLong("ID_CLIENTE"));//nome coluna bd
            //usu.setId(rs.getLong("id_usuario"));
            usu.setEmailLogin(rs.getString("email"));
            usu.setSenhaLogin(rs.getString("senha"));

            }} catch (Exception ex) {
            try {
                if (conn != null) {
                    conn.rollback(); //testar se a conexão não está nula                
                }
            } catch (SQLException e1) {
                e1.printStackTrace();
            } finally {
                ConnectionFactory.close(conn, pstm, rs);
            }
            ex.printStackTrace();
        }
        
        
        
            return usu;  
                
    }

}

