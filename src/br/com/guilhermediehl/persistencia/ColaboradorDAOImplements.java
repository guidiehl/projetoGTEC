
package br.com.guilhermediehl.persistencia;

import br.com.guilhermediehl.modelo.Colaborador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ColaboradorDAOImplements {
    
    
    private static final String INSERT = "insert into colaborador (nome, login, senha, cpf, rg, id_endereco, telefone, email, salario, conta) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
    private static final String LIST = "select * from colaborador,endereco where colaborador.endereco_id = endereco.codigo;";
    private static final String REMOVE = "delete from colaborador where codigo = ?;";
    private static final String UPDATE = "update colaborador set nome = ?, login = ?, senha = ?, cpf = ?, rg = ?,  telefone = ? where codigo = ?;";
    private static final String LISTBYID = "select * from colaborador where codigo = ?;";
    private static final String LISTBYNOME = "select * from colaborador where nome like ?;";
    
    
    public int salve(Colaborador u) {
        if (u.getCodigo() == 0){
            return insert(u);
        } else {
            return update(u);
        }
    }
    
    private int insert(Colaborador u){
        Connection con = null;
        PreparedStatement pstm = null;
        int retorno = -1;
        try{
            con = ConnectionFactory.getConnection();
            pstm = con.prepareStatement(INSERT,
                    Statement.RETURN_GENERATED_KEYS);
            pstm.setString(1, u.getNome());
            pstm.setString(2, u.getLogin());
            pstm.setString(3, u.getSenha());
            pstm.setString(4, u.getCpf());
            pstm.setString(5, u.getRg());
            pstm.setInt(6, u.getEndereco().getCodigo()); 
            pstm.setString(7, u.getTelefone()); 
            pstm.setString(8, u.getEmail()); 
            pstm.setDouble(9, u.getSalario());
            pstm.setString(10, u.getConta());             
            
            pstm.execute();
            
            try(ResultSet rs = 
                    pstm.getGeneratedKeys()){
               if (rs.next()){
                   retorno = rs.getInt(1);
               } 
            }
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, 
                    "Erro ao inserir: " + e);
        }finally{
            try {
                ConnectionFactory.closeConnection
                        (con, pstm);
            } catch (SQLException ex) {
                
            }
            return retorno;
        }
    }
    

    
    public boolean remove(int codigo) {
        
        boolean status = false;
        Connection con = null;
        PreparedStatement pstm = null;
        
        try{
            con = ConnectionFactory.getConnection();
            pstm = con.prepareStatement(REMOVE);
            pstm.setInt(1, codigo);
            pstm.execute();
            status = true;
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao excluir usuário: " +e.getMessage());
        } finally {
            try{
                ConnectionFactory.closeConnection(con, pstm);
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão: " +e.getMessage());
            }
        }
        return status;
    }

    
    public List<Colaborador> listAll() {
        
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        List<Colaborador> colaboradores = new ArrayList<>();
        
        try{
            con = ConnectionFactory.getConnection();
            pstm = con.prepareStatement(LIST);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                Colaborador u = new Colaborador();
                
                u.setCodigo(rs.getInt("codigo"));
                u.setNome(rs.getString("nome"));
                u.setLogin(rs.getString("login"));
                u.setEmail(rs.getString("email")); 
                colaboradores.add(u);
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao listar as pessoas: " +e.getMessage());
        } finally{
            try{
                ConnectionFactory.closeConnection(con, pstm, rs);
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão: " +e.getMessage());
            }
        }
        return colaboradores;
    }

    
    public Colaborador listById(int codigo) {
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        Colaborador u = new Colaborador();
        
        try{
            con = ConnectionFactory.getConnection();
            pstm = con.prepareStatement(LISTBYID);
            pstm.setInt(1, codigo);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                u.setCodigo(rs.getInt("codigo"));
                u.setNome(rs.getString("nome"));
                u.setLogin(rs.getString("login"));
                u.setSenha(rs.getString("email"));
                                
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao listar usuário: " +e.getMessage());
        } finally {
            try{
                ConnectionFactory.closeConnection(con, pstm, rs);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão: " +e.getMessage());
            }
        }
        
        return u;
    }

    private int update(Colaborador u) {
        Connection con = null;
        PreparedStatement pstm = null;
        int retorno = -1;
        try{
            con = ConnectionFactory.getConnection();
            pstm = con.prepareStatement(UPDATE);
            pstm.setString(1, u.getNome());
            pstm.setString(2, u.getLogin());
            pstm.setString(3, u.getSenha());
            pstm.setString(4, u.getCpf());
            pstm.setString(5, u.getTelefone());
            pstm.setInt(8, u.getCodigo());
            
            pstm.execute();
            
            retorno = u.getCodigo();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao editar os dados: " +e.getMessage());
        }finally{
            try{
                ConnectionFactory.closeConnection(con, pstm);
            } catch(Exception e){
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão: " +e.getMessage());
            }
        }
        return retorno;
    }

    
    public List<Colaborador> listByNome(String nome) {
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        List<Colaborador> colaboradores = new ArrayList<>();
        
        try {
            con = ConnectionFactory.getConnection();
            pstm = con.prepareStatement(LISTBYNOME);
            pstm.setString(1, "%"+ nome +"%");
            rs = pstm.executeQuery();
            
            while(rs.next()){
                Colaborador u = new Colaborador();
                
                u.setCodigo(rs.getInt("codigo"));
                u.setNome(rs.getString("nome"));
                u.setCpf(rs.getString("cpf"));                
                u.setLogin(rs.getString("login"));
                u.setSenha(rs.getString("senha"));
                u.setTelefone(rs.getString("telefone"));  
                colaboradores.add(u);
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar usuário" +e.getMessage());
        } finally {
            try{
                ConnectionFactory.closeConnection(con, pstm, rs);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão" +e.getMessage());
            }
        }
        return colaboradores;
    }
    
}
