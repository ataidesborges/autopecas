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
        sql = "insert into cliente values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
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
        sql = "update funcionario set nome_func=?, cpf=?, celular=?, email=?, login=?, senha=?, cidade=?, estado=?, telefone=?, datanascimento=?, endereco=?, bairro=?, complemento=?, numero=? where id_funcionario=?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, funcionario.getNomeFunc());
        pst.setString(2, funcionario.getCpf());
        pst.setInt(3, funcionario.getCelular());
        pst.setString(4, funcionario.getEmail());
        pst.setString(5, funcionario.getUsuario());
        pst.setString(6, funcionario.getCidade());
        pst.setString(7, funcionario.getEstado());
        pst.setInt(8, funcionario.getTelefone());
        pst.setString(9, funcionario.getDatanascimento());
        pst.setString(10, funcionario.getEndereco());
        pst.setString(11, funcionario.getBairro());
        pst.setString(12, funcionario.getComplemento());
        pst.setInt(13, funcionario.getNumero());
        pst.setInt(14, funcionario.getIdFuncionario());
        pst.execute();
        pst.close();      
        
    }

}
