package DataAccessObject;

import Model.TipoAtendimento;
import Connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TipoAtendimentoDao {
 
    private static final String SQL_FIND_ALL = "SELECT * FROM tb_tipo_atendimento";
    private static final String SQL_FIND_FILTER = "SELECT * FROM tb_tipo_atendimento WHERE nome LIKE ? ";
    
    
     //Pesquisar todos tipos de atendimento 
    public List<TipoAtendimento> findAll() {
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement pstm = null;
        ResultSet rs = null;
        
        //criei um lista do tipo tipoAtendimento
        List<TipoAtendimento> tipoAtendimentos = new ArrayList<TipoAtendimento>();
        try {
            pstm = conn.prepareStatement(SQL_FIND_ALL);
            rs = pstm.executeQuery();
            while (rs.next()) {
               
         
                TipoAtendimento tipoAtendimento = new TipoAtendimento();//para cada posição do resultset cria um novo tipo de atendimento   

                tipoAtendimento.setIdTipoAtendimento(rs.getInt("tipo_atend_id"));
                tipoAtendimento.setNomeAtendimento(rs.getString("nome"));

                tipoAtendimentos.add(tipoAtendimento);
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
        return tipoAtendimentos;

    }

     //Pesquisar (filtro) tipoAtendimentos
    public List<TipoAtendimento> findByFilter(String filter) {
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement pstm = null;
        ResultSet rs = null;
        
        //criei um lista do tipo tipoAtendimentos
        List<TipoAtendimento> tipoAtendimentos = new ArrayList<TipoAtendimento>();
        try {
            pstm = conn.prepareStatement(SQL_FIND_FILTER);
          
            pstm.setString(1, '%' + filter + '%');
            pstm.setString(2, '%' + filter + '%');


            rs = pstm.executeQuery();
            while (rs.next()) {
                
                TipoAtendimento tipoAtendimento = new TipoAtendimento(); //para cada posição do resultset cria um novo tipoAtendimentos

                tipoAtendimento.setIdTipoAtendimento(rs.getInt("tipo_atend_id"));
                tipoAtendimento.setNomeAtendimento(rs.getString("nome"));

                tipoAtendimentos.add(tipoAtendimento);
                
            }

        }catch (SQLException ex) {
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
        return tipoAtendimentos;

    }
    
    
}
