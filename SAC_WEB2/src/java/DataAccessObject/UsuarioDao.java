package DataAccessObject;

   
import Model.Login;
import Model.Perfil;
import Model.Usuario;
import Connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class UsuarioDao {
    
    private static final String SQL_INSERT = "INSERT INTO tb_usuario (nome_completo, cpf, email, rua, numero, bairro, cep, complemento, telefone, senha, fk_perfil_id, fk_cidade_id, fk_estado_id) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE tb_usuario SET nome_completo=?, cpf=?, email=?, rua=?, numero=?, barrio=?, cep=?, complemento=?, telefone=?, senha=? WHERE user_id=?";
    private static final String SQL_REMOVE = "DELETE FROM tb_usuario WHERE user_id=?";
    private static final String SQL_FIND_ALL = "SELECT * FROM tb_usuario";
    private static final String SQL_FIND_FILTER = "SELECT * FROM tb_usuario WHERE nome_completo LIKE ? OR cpf LIKE ? OR email LIKE ? OR telefone LIKE ?";
    private static final String SQL_FIND_LOGIN = "SELECT * FROM tb_usuario WHERE email LIKE ? AND senha LIKE ? AND  ";

//salvar usuario 
    
    public int save(Usuario usuario) {
        Connection conn = ConnectionFactory.getConnection();
        if (conn == null) {
            System.out.println("Erro ao conectar no banco de dados");
            //Se a conexão for nula já faz o retorno pra não executar o resto da função.
            return 0;
        }
        PreparedStatement pstm = null;
        int result = 0;
        try {
            pstm = conn.prepareStatement(SQL_INSERT);
                      
            pstm.setString(1, usuario.getNomeUsuario());
            pstm.setString(2, usuario.getCpfUsuario());
            pstm.setString(3, usuario.getEmailUsuario());
            pstm.setString(4, usuario.getRuaUsuario());
            pstm.setInt(5, usuario.getNrUsuario());
            pstm.setString(6, usuario.getBairroUsuario());
            pstm.setString(7, usuario.getCepUsuario());
            pstm.setString(8, usuario.getComplementoUsuario());
            pstm.setString(9, usuario.getTelefoneUsuario());
            pstm.setString(10, usuario.getSenhaLoginUsuario());
            pstm.setInt(11, usuario.getPerfilUsuario());
            pstm.setInt(12, usuario.getIdCidadeUsuario());
            pstm.setInt(13, usuario.getIdEstadoUsuario());
            

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

    //atualizar usuario 
    public int update(Usuario usuario) {
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement pstm = null;
        int result = 0;

        try {
            pstm = conn.prepareStatement(SQL_UPDATE);
            
            pstm.setString(1, usuario.getNomeUsuario());
            pstm.setString(2, usuario.getCpfUsuario());
            pstm.setString(3, usuario.getEmailUsuario());
            pstm.setString(4, usuario.getRuaUsuario());
            pstm.setInt(5, usuario.getNrUsuario());
            pstm.setString(6, usuario.getBairroUsuario());
            pstm.setString(7, usuario.getCepUsuario());
            pstm.setString(8, usuario.getComplementoUsuario());
            pstm.setString(9, usuario.getTelefoneUsuario());
            pstm.setString(10, usuario.getSenhaLoginUsuario());
            pstm.setInt(11, usuario.getPerfilUsuario());
            pstm.setInt(12, usuario.getIdCidadeUsuario());
            pstm.setInt(13, usuario.getIdEstadoUsuario());
            
    
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
               
                    //nome_completo, cpf, email, rua, numero, bairro, cep, complemento, telefone, senha, 
                   //fk_perfil_id, fk_login_id, fk_cidade_id, fk_estado_id) VALUES (?,?,?,?,?,?,?,?,?,?)";

                  Usuario usuario = new Usuario();//para cada posição do resultset cria um novo usuario   
                  usuario.setNomeUsuario(rs.getString("nome_completo"));
                  usuario.setCpfUsuario(rs.getString("cpf"));
                  usuario.setEmailUsuario(rs.getString("email"));
                  usuario.setRuaUsuario(rs.getString("rua"));
                  usuario.setNrUsuario(rs.getInt("numero"));
                  usuario.setBairroUsuario(rs.getString("bairro"));
                  usuario.setCepUsuario(rs.getString("cep"));
                  usuario.setComplementoUsuario(rs.getString("complemento"));
                  usuario.setTelefoneUsuario(rs.getString("telefone"));
                  usuario.setSenhaLoginUsuario(rs.getString("senha"));
                  
                usuarios.add(usuario);
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
            pstm.setString(4, '%' + filter + '%');
            

            rs = pstm.executeQuery();
            while (rs.next()) {
                
                Usuario usuario = new Usuario(); //para cada posição do resultset cria um novo usuario
                
                usuario.setNomeUsuario(rs.getString("nome_completo"));
                usuario.setCpfUsuario(rs.getString("cpf"));
                usuario.setEmailUsuario(rs.getString("email"));
                usuario.setTelefoneUsuario(rs.getString("telefone"));
               
                usuarios.add(usuario);
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
        return usuarios;
    }
}

    

