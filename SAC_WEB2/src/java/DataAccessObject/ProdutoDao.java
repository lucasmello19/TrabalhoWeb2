package DataAccessObject;


import Model.Produto;
import Connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class ProdutoDao {
       
 
    private static final String SQL_INSERT = "INSERT INTO tb_produto (descricao, peso, fk_categ_id, nome) VALUES (?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE tb_produto SET descricao=?, peso=?, fk_categ_id=? WHERE produto_id = ?";
    private static final String SQL_REMOVE = "DELETE FROM tb_produtoWHERE produto_id=?";
    private static final String SQL_FIND_ALL = "SELECT * FROM tb_produto";
    private static final String SQL_FIND_FILTER = "SELECT * FROM tb_produto WHERE descricao LIKE ? OR peso LIKE ? OR nome LIKE ?";
            

    //salvar Produto
    public int save(Produto produto) {
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement pstm = null;
        int result = 0;
        try {
            pstm = conn.prepareStatement(SQL_INSERT);
           
           //descricao, peso, fk_categ_id, nome);
           
            pstm.setString(1, produto.getDescricaoProduto());
            pstm.setInt(2, produto.getPesoProduto());
            pstm.setInt(3, produto.getCategoriaId().getIdCategoria());
            pstm.setString(4, produto.getNomeProduto());

            //retonar um valor int (1 para sucesso e 2 para insucesso) para retornar para a interface gráfica para verificar o sucesso ou na inserção não 
            result = pstm.executeUpdate(); 

        } catch (SQLException ex) {
            try {
                if (conn != null) {
                    conn.rollback(); //testar se a conexão não está nula                
                }
            } catch (SQLException e1) {
                e1.printStackTrace();
            } finally {
                ConnectionFactory.close(conn, pstm, null);
            }
            ex.printStackTrace();
        }
        return result;
    }

    //atualizar produto 
    public int update(Produto produto) {
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement pstm = null;
        int result = 0;

        try {
            pstm = conn.prepareStatement(SQL_UPDATE);
            
          
            pstm.setString(1, produto.getDescricaoProduto());
            pstm.setInt(2, produto.getPesoProduto());
            pstm.setInt(3, produto.getCategoriaId().getIdCategoria());
            pstm.setString(4, produto.getNomeProduto());
    
            //retonar um valor int (1 para sucesso e 2 para insucesso) para retornar para a interface gráfica para verificar o sucesso ou na inserção não 
            result = pstm.executeUpdate(); 

        } catch (SQLException ex) {
            try {
                if (conn != null) {
                    conn.rollback(); //testar se a conexão não está nula                
                }
            } catch (SQLException e1) {
                e1.printStackTrace();
            } finally {
                ConnectionFactory.close(conn, pstm, null);
            }
            ex.printStackTrace();
        }
        return result;
    }
    //remover produto 
    public int remove(int produto_id) {
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement pstm = null;
        int result = 0;

        try {
            pstm = conn.prepareStatement(SQL_REMOVE);

            pstm.setInt(1, produto_id);

            result = pstm.executeUpdate(); //retonar um valor int (1 para sucesso e 2 para insucesso) para retornar para a interface gráfica para verificar o sucesso ou na inserção não 

        } catch (SQLException ex) {
            try {
                if (conn != null) {
                    conn.rollback(); //testar se a conexão não está nula                
                }
            } catch (SQLException e1) {
                e1.printStackTrace();
            } finally {
                ConnectionFactory.close(conn, pstm, null);
            }
            ex.printStackTrace();
        }
        return result;
    }

    //Pesquisar todos produtos 
    public List<Produto> findAll() {
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement pstm = null;
        ResultSet rs = null;
        
        //criei um lista do tipo produto
        List<Produto> produtos = new ArrayList<Produto>();
        try {
            pstm = conn.prepareStatement(SQL_FIND_ALL);
            rs = pstm.executeQuery();
            while (rs.next()) {
                                                
                  Produto produto = new Produto();//para cada posição do resultset cria um novo produto   
                  produto.setIdProduto(rs.getInt("produto_id"));
                  produto.setDescricaoProduto(rs.getString("descricao"));
                  produto.setPesoProduto(rs.getInt("peso"));
                  produto.setNomeProduto(rs.getString("nome"));
                  
                produtos.add(produto);
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
        return produtos;

    }

     //Pesquisar (filtro) produto
    public List<Produto> findByFilter(String filter) {
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement pstm = null;
        ResultSet rs = null;
        
        //criei um lista do tipo produto
        List<Produto> produtos = new ArrayList<Produto>();
        try {
            pstm = conn.prepareStatement(SQL_FIND_FILTER);
          
            pstm.setString(1, '%' + filter + '%');
            pstm.setString(2, '%' + filter + '%');
            pstm.setString(3, '%' + filter + '%');
            pstm.setString(4, '%' + filter + '%');
            

            rs = pstm.executeQuery();
            while (rs.next()) {
                
                Produto produto = new Produto(); //para cada posição do resultset cria um novo produto
                
                
                  produto.setIdProduto(rs.getInt("produto_id"));
                  produto.setDescricaoProduto(rs.getString("descricao"));
                  produto.setPesoProduto(rs.getInt("peso"));
                  produto.setNomeProduto(rs.getString("nome"));
                
                produtos.add(produto);
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
        return produtos;

    }

}

    

