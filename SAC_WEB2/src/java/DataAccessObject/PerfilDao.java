package DataAccessObject;

import Beans.Perfil;
import Connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PerfilDao {
        
 
    private static final String SQL_FIND_ALL = "SELECT * FROM tb_perfil";
    
     //Pesquisar todos perfil
    public List<Perfil> findAll() {
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement pstm = null;
        ResultSet rs = null;
        
        //criei um lista do tipo perfil
        List<Perfil> perfis = new ArrayList<Perfil>();
        try {
            pstm = conn.prepareStatement(SQL_FIND_ALL);
            rs = pstm.executeQuery();
            while (rs.next()) {
         
                Perfil perfil = new Perfil();//para cada posição do resultset cria um novo perfil   

                perfil.setIdPerfil(rs.getInt("perfil_id"));
                perfil.setDescricaoPerfil(rs.getString("descricao"));

                perfis.add(perfil);
            }

        } catch (SQLException ex) {
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
        return perfis;

    }
    
}
