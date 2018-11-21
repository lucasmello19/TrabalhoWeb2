package DataAccessObject;

import Model.Atendimento;
import Connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class AtendimentoDao {
    
    private static final String SQL_INSERT = "INSERT INTO tb_atendimento(dataHora_inicio, fk_tipoAtend_id, fk_user_id, fk_perfil_id, fk_login_id, situacao, fk_produto_id, fk_categ_id, descricao, solucao, dataHora_fim) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE tb_atendimento SET fk_tipoAtend_id=?, fk_user_id=?, fk_perfil_id=?, fk_login_id=?, situacao=?, fk_produto_id=?, fk_categ_id=?, descricao=?, solucao=? WHERE atendimento_id=?";
    private static final String SQL_REMOVE = "DELETE FROM tb_atendimento WHERE atendimento_id=?";
    private static final String SQL_FIND_ALL = "SELECT * FROM tb_atendimento";
    private static final String SQL_FIND_FILTER = "SELECT * FROM tb_atendimento WHERE dataHora_inicio LIKE ? OR situacao LIKE ? OR descricao LIKE ? OR solucao LIKE ? OR dataHora_fim LIKE ?";
    

    //salvar Atendimento 
    public int save(Atendimento atendimento) {
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement pstm = null;
        int result = 0;
        try {
            pstm = conn.prepareStatement(SQL_INSERT);
            
            //dataHora_inicio, fk_tipoAtend_id, fk_user_id, fk_perfil_id, fk_login_id, situacao, fk_produto_id, fk_categ_id, descricao, solucao, dataHora_fim
           
              pstm.setTimestamp(1, atendimento.getDtHoraInicioAtendimento());
              pstm.setInt(2, atendimento.getIdTipoAtendimento().getIdTipoAtendimento());
              pstm.setInt(3, atendimento.getIdUsuAtendimento().getIdUsuario());
              pstm.setInt(4, atendimento.getIdPerfilUsuAtendimento().getIdPerfil());
              pstm.setInt(5, atendimento.getIdLoginUsuAtendimento().getIdLogin());
              pstm.setString(6, atendimento.getSituacaoAtendimento());
              pstm.setInt(7, atendimento.getIdProdAtendimento().getIdProduto());
              pstm.setInt(8, atendimento.getIdCategoriaAtendimento().getIdCategoria());
              pstm.setString(9, atendimento.getDescAtendimento());
              pstm.setString(10, atendimento.getSolucaoAtendimento());
              pstm.setTimestamp(11, atendimento.getDtHoraFimAtendimento());
                      
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

    //atualizar Atendimento 
    public int update(Atendimento atendimento) {
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement pstm = null;
        int result = 0;

        try {
            pstm = conn.prepareStatement(SQL_UPDATE);
            
              pstm.setInt(2, atendimento.getIdTipoAtendimento().getIdTipoAtendimento());
              pstm.setInt(3, atendimento.getIdUsuAtendimento().getIdUsuario());
              pstm.setInt(4, atendimento.getIdPerfilUsuAtendimento().getIdPerfil());
              pstm.setInt(5, atendimento.getIdLoginUsuAtendimento().getIdLogin());
              pstm.setString(6, atendimento.getSituacaoAtendimento());
              pstm.setInt(7, atendimento.getIdProdAtendimento().getIdProduto());
              pstm.setInt(8, atendimento.getIdCategoriaAtendimento().getIdCategoria());
              pstm.setString(9, atendimento.getDescAtendimento());
              pstm.setString(10, atendimento.getSolucaoAtendimento());
              
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
    //remover Atendimento 
    public int remove(int atendimento_id) {
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement pstm = null;
        int result = 0;

        try {
            pstm = conn.prepareStatement(SQL_REMOVE);

            pstm.setInt(1, atendimento_id);

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

    //Pesquisar todos Atendimentos 
    public List<Atendimento> findAll() {
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement pstm = null;
        ResultSet rs = null;
        
        //criei um lista do tipo atendimento
        List<Atendimento> atendimentos = new ArrayList<Atendimento>();
        try {
            pstm = conn.prepareStatement(SQL_FIND_ALL);
            rs = pstm.executeQuery();
            while (rs.next()) {
               
            //dataHora_inicio, fk_tipoAtend_id, fk_user_id, fk_perfil_id, fk_login_id, situacao, fk_produto_id, fk_categ_id, descricao, solucao, dataHora_fim
           
                  Atendimento atendimento = new Atendimento();//para cada posição do resultset cria um novo atendimento   
                  
                 
                  atendimento.setDtHoraInicioAtendimento(rs.getTimestamp("dataHora_inicio"));
                  atendimento.setSituacaoAtendimento(rs.getString("situacao"));
                  atendimento.setDescAtendimento(rs.getString("descricao"));
                  atendimento.setSolucaoAtendimento(rs.getString("solucao"));
                  atendimento.setDtHoraFimAtendimento(rs.getTimestamp("dataHora_fim"));

                atendimentos.add(atendimento);
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
        return atendimentos;

    }

     //Pesquisar (filtro) atendimento
    public List<Atendimento> findByFilter(String filter) {
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement pstm = null;
        ResultSet rs = null;
        
        //criei um lista do tipo atendimento
        List<Atendimento> atendimentos = new ArrayList<Atendimento>();
        try {
            pstm = conn.prepareStatement(SQL_FIND_FILTER);
          
            pstm.setString(1, '%' + filter + '%');
            pstm.setString(2, '%' + filter + '%');
            pstm.setString(3, '%' + filter + '%');
            pstm.setString(4, '%' + filter + '%');
            pstm.setString(5, '%' + filter + '%');

            rs = pstm.executeQuery();
            while (rs.next()) {
                
                Atendimento atendimento = new Atendimento(); //para cada posição do resultset cria um novo atendimento
                
                
                  atendimento.setDtHoraInicioAtendimento(rs.getTimestamp("dataHora_inicio"));
                  atendimento.setSituacaoAtendimento(rs.getString("situacao"));
                  atendimento.setDescAtendimento(rs.getString("descricao"));
                  atendimento.setSolucaoAtendimento(rs.getString("solucao"));
                  atendimento.setDtHoraFimAtendimento(rs.getTimestamp("dataHora_fim"));
                  
                atendimentos.add(atendimento);
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
        return atendimentos;

    }

}

    

