/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessObject;

import Beans.Atendimento;
import Beans.Categoria;
import Beans.Login;
import Beans.Perfil;
import Beans.Produto;
import Beans.TipoAtendimento;
import Beans.Usuario;
import Connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author LucasMello
 */
public class AtendimentoDao {
    private Atendimento idAtendimento;
    private Timestamp dtHoraInicioAtendimento;
    private Timestamp dtHoraFimAtendimento;
    private TipoAtendimento idTipoAtendimento;
    private Usuario idUsuAtendimento;
    private Perfil idPerfilUsuAtendimento;
    private Login idLoginUsuAtendimento; 
    private Produto idProdAtendimento;
    private Categoria idCategoriaAtendimento;
    private String situacaoAtendimento;          
    private String descAtendimento;
    private String solucaoAtendimento;
    

    private static final String SQL_FIND_ALL = "SELECT * FROM tb_atendimento";
    private static final String SQL_INSERT = "INSERT INTO `mydb`.`tb_atendimento` (`atendimento_id`, `dataHora_inicio`, `fk_tipoAtend_id`, `fk_user_id`, `fk_perfil_id`, `fk_login_id`, `situacao`, `fk_produto_id`, `fk_categ_id`, `descricao`, `solucao`, `dataHora_fim`) VALUES (?,?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
    public List<Atendimento> findAll() {
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement pstm = null;
        ResultSet rs = null;
        
        List<Atendimento> atendimentos = new ArrayList<>();
        try {
            
        
            pstm = conn.prepareStatement(SQL_FIND_ALL);
            rs = pstm.executeQuery();
            while (rs.next()) {

                Atendimento a = new Atendimento();
//      
                a.setDescAtendimento(rs.getString("descricao"));
                a.setDtHoraFimAtendimento(rs.getTimestamp("dataHora_fim"));
                a.setDtHoraInicioAtendimento(rs.getTimestamp("dataHora_inicio"));
                a.setIdAtendimento(rs.getInt("atendimento_id"));
                a.setIdTipoAtendimento(rs.getInt("fk_tipoAtend_id"));
                a.setIdUsuAtendimento(rs.getInt("fk_user_id"));
                a.setIdPerfilUsuAtendimento(rs.getInt("fk_perfil_id"));
                a.setIdLoginUsuAtendimento(rs.getInt("fk_login_id"));
                a.setSituacaoAtendimento(rs.getString("situacao"));
                a.setIdProdAtendimento(rs.getInt("fk_produto_id"));
                a.setIdCategoriaAtendimento(rs.getInt("fk_categ_id"));
                a.setDescAtendimento(rs.getString("descricao"));
                a.setSolucaoAtendimento(rs.getString("solucao"));
                
                atendimentos.add(a);
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
    
    public int save(Atendimento a) {
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement pstm = null;
        int result = 0;
        try {
            pstm = conn.prepareStatement(SQL_INSERT);

            pstm.setString(1, "0");
            
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            pstm.setTimestamp(2, timestamp);
            
            pstm.setInt(3, a.getIdAtendimento());
            pstm.setInt(4, a.getIdUsuAtendimento());
            pstm.setInt(5, a.getIdPerfilUsuAtendimento());
            pstm.setInt(6, a.getIdLoginUsuAtendimento());
            pstm.setString(7, a.getSituacaoAtendimento());
            pstm.setInt(8, a.getIdProdAtendimento());
            pstm.setInt(9, a.getIdCategoriaAtendimento());
            pstm.setString(10, a.getDescAtendimento());
            pstm.setString(11, a.getSolucaoAtendimento());
            pstm.setString(12, a.getSituacaoAtendimento());
            pstm.setTimestamp(13, timestamp);

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
}
