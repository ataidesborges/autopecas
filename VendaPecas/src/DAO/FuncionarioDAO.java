/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Funcionário;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/**
 *
 * @author User
 */
public class FuncionarioDAO {
    PreparedStatement pst;
    String sql;
    
    public void salvar (Funcionário funcionario) throws SQLException{
        sql = "insert into cliente values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, 0);
        pst.setString(2, funcionario.getNomeFunc());
        pst.setString(3, funcionario.getEmail());
        pst.setString(4, funcionario.getCpf());
        pst.setInt(5, funcionario.getCelular());
        pst.setString(6, funcionario.getSenha());
        pst.setString(7, funcionario.getUsuario());
        pst.execute();
        pst.close();
    }
    
    public void excluir (Funcionário funcionario) throws SQLException {
        
        sql = "delete from cliente where codigo=?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, funcionario.getIdFuncionario());
        pst.execute();
        pst.close();
        
    }
    
    public void alterar (Funcionário funcionario) throws SQLException {
        sql = "update funcionario set nome=?, cpf=?, celular=?, email=?, login=?, senha=? where idfunc=?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, funcionario.getNomeFunc());
        pst.setString(2, funcionario.getCpf());
        pst.setInt(3, funcionario.getCelular());
        pst.setString(4, funcionario.getEmail());
        pst.setString(5, funcionario.getUsuario());
        pst.setString(6, funcionario.getSenha());
        pst.setInt(7, funcionario.getIdFuncionario());
        pst.execute();
        pst.close();      
        
    }
    
}
