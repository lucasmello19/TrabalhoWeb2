package DataAccessObject;

   
import Beans.Usuario;
import Connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class UsuarioDao {
    
    private static final String SQL_INSERT = "INSERT INTO tb_usuario (nome_completo, cpf, email, rua, numero, bairro, cep, complemento, telefone, senha, fk_perfil_id, fk_) VALUES (?,?,?,?,?,?,?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE tb_usuario SET nome_completo=?, cpf=?, email=?, rua=?, numero=?, barrio=?, complemento=?, telefone=?, senha=? WHERE user_id=?";
    private static final String SQL_REMOVE = "DELETE FROM tb_usuario WHERE user_id=?";
    private static final String SQL_FIND_ALL = "SELECT * FROM tb_usuario";
    private static final String SQL_FIND_FILTER = "SELECT * FROM tb_usuario WHERE nome_completo LIKE ? OR cpf LIKE ? OR email LIKE ? OR rua LIKE ? OR numero LIKE ? OR bairro LIKE ? OR cep LIKE ? OR complemento LIKE ? OR telefone LIKE ?";

    //salvar usuario 
    public int save(Usuario usuario) {
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement pstm = null;
        int result = 0;
        try {
            pstm = conn.prepareStatement(SQL_INSERT);

            //setar os parâmetros referentes aos (?,?,?)
            pstm.setString(1, usuario.getNomePessoa());
            pstm.setString(2, usuario.getCpfPessoa());
            pstm.setString(3, usuario.getEmailPessoa());
            pstm.setString(4, usuario.getRuaPessoa());
            pstm.setInt(5, usuario.getNrPessoa());
            pstm.setString(6, usuario.getBairroPessoa());
            pstm.setString(7, usuario.getCepPessoa());
            pstm.setString(8, usuario.getComplementoPessoa());
            pstm.setString(9, usuario.getTelefonePessoa());
            pstm.setString(10, usuario.getSenhaLoginPessoa());
                       

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

    //atualizar usuario 
    public int update(Usuario usuario) {
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement pstm = null;
        int result = 0;

        try {
            pstm = conn.prepareStatement(SQL_UPDATE);

            //setar os parâmetros referentes aos (?,?,?)
//            pstm.setString(1, usuario.getNome());
//            pstm.setString(2, usuario.getSobrenome());
//            pstm.setString(3, usuario.getTelefone());
//            pstm.setLong(4, usuario.getUserId());

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
    //remover usuario 
    public int remove(int user_id) {
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement pstm = null;
        int result = 0;

        try {
            pstm = conn.prepareStatement(SQL_REMOVE);

            pstm.setInt(1, user_id);

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

    //Pesquisar todos usuarios 
    public List<Usuario> findAll() {
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement pstm = null;
        ResultSet rs = null;
        
        //criei um lista do tipo usuario
        List<Usuario> usuarios = new ArrayList<Usuario>();
        try {
            pstm = conn.prepareStatement(SQL_FIND_ALL);
            rs = pstm.executeQuery();
            while (rs.next()) {
                Usuario usu = new Usuario();//para cada posição do resultset cria um novo usuario
       
//                usu.setUserId(rs.getLong("user_id"));//nome coluna bd
//                usu.setNome(rs.getString("nome_completo")); //nome coluna bd
//                usu.setTelefone(rs.getString("telefone")); //nome coluna bd
//
//                usuarios.add(usu);
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
        return usuarios;

    }

    //Pesquisar (filtro) usuario
    public List<Usuario> findByFilter(String filter) {
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement pstm = null;
        ResultSet rs = null;
        
        //criei um lista do tipo usuario
        List<Usuario> usuarios = new ArrayList<Usuario>();
        try {
            pstm = conn.prepareStatement(SQL_FIND_FILTER);
          
            pstm.setString(1, '%' + filter + '%');
            pstm.setString(2, '%' + filter + '%');
            pstm.setString(3, '%' + filter + '%');


            rs = pstm.executeQuery();
            while (rs.next()) {
                Usuario usu = new Usuario(); //para cada posição do resultset cria um novo usuario
//                usu.setUserId(rs.getLong("user_id"));//nome coluna bd
//                usu.setNome(rs.getString("nome_completo")); //nome coluna bd
//                usu.setTelefone(rs.getString("telefone")); //nome coluna bd

                usuarios.add(usu);
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
        return usuarios;

    }

}

    

