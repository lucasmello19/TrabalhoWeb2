package DataAccessObject;

import Model.Categoria;
import Connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class CategoriaProdDao {
 
    private static final String SQL_FIND_ALL = "SELECT * FROM tb_categoria";
    
     //Pesquisar todos categoria 
    public List<Categoria> findAll() {
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement pstm = null;
        ResultSet rs = null;
        
        //criei um lista do tipo categoria
        List<Categoria> categorias = new ArrayList<Categoria>();
        try {
            pstm = conn.prepareStatement(SQL_FIND_ALL);
            rs = pstm.executeQuery();
            while (rs.next()) {
               
         
                  Categoria categoria = new Categoria();//para cada posição do resultset cria um novo categoria   
                  
                  categoria.setIdCategoria(rs.getInt("categ_id"));
                  categoria.setNomeCategoria(rs.getString("nome"));
               

                categorias.add(categoria);
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
        return categorias;

    }

}
