package DataAccessObject;


import Model.Estado;
import Connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class EstadoDao {
    
 
    private static final String SQL_FIND_ALL = "SELECT * FROM tb_estado";
    
     //Pesquisar todos estados
    public List<Estado> findAll() {
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement pstm = null;
        ResultSet rs = null;
        
        //criei um lista do tipo estado
        List<Estado> estados = new ArrayList<Estado>();
        try {
            pstm = conn.prepareStatement(SQL_FIND_ALL);
            rs = pstm.executeQuery();
            while (rs.next()) {
         
                    Estado estado = new Estado();//para cada posição do resultset cria um novo estado   

                estado.setIdEstado(rs.getInt("estado_id"));
                estado.setNomeEstado(rs.getString("nome"));
                estado.setSiglaEstado(rs.getString("sigla"));

                estados.add(estado);
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
        return estados;

    }
    
}
