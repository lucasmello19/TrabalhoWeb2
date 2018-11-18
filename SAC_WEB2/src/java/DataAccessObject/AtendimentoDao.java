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
    private static final String SQL_INSERT = "INSERT INTO tb_usuario (nome_completo, cpf, email, rua, numero, bairro, cep, complemento, telefone, senha, fk_perfil_id, fk_login_id, fk_cidade_id, fk_estado_id) VALUES (?,?,?,?,?,?,?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE tb_usuario SET nome_completo=?, cpf=?, email=?, rua=?, numero=?, barrio=?, complemento=?, telefone=?, senha=? WHERE user_id=?";
    private static final String SQL_REMOVE = "DELETE FROM tb_usuario WHERE user_id=?";
    private static final String SQL_FIND_ALL = "SELECT * FROM tb_usuario";
    private static final String SQL_FIND_FILTER = "SELECT * FROM tb_usuario WHERE nome_completo LIKE ? OR cpf LIKE ? OR email LIKE ? OR rua LIKE ? OR numero LIKE ? OR bairro LIKE ? OR cep LIKE ? OR complemento LIKE ? OR telefone LIKE ?";

    
}
