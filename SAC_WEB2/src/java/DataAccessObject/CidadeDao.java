package DataAccessObject;

import Beans.Cidade;
import Connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CidadeDao {
        
 
    private static final String SQL_FIND_ALL = "SELECT * FROM tb_cidade";
    
     //Pesquisar todos cidades
    public List<Cidade> findAll() {
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement pstm = null;
        ResultSet rs = null;
        
        //criei um lista do tipo cidade
        List<Cidade> cidades = new ArrayList<Cidade>();
        try {
            pstm = conn.prepareStatement(SQL_FIND_ALL);
            rs = pstm.executeQuery();
            while (rs.next()) {

                Cidade cidade = new Cidade();//para cada posição do resultset cria um novo cidade   

                cidade.setIdCidade(rs.getInt("cidade_id"));
                cidade.setNomeCidade(rs.getString("nome"));

                cidades.add(cidade);
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
        return cidades;

    }
    
}
