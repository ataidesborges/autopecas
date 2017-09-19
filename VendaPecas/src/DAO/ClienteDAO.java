/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Model.Cliente;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Larissa
 */
public class ClienteDAO {
    PreparedStatement pst;
    String sql;
    
    public void salvar (Cliente cliente) throws SQLException{
        sql = "insert into cliente values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, 0);
        pst.setString(2, cliente.getNomeCliente());
        pst.setString(3, cliente.getDataNascimento());
        pst.setString(4, cliente.getEndereco());
        pst.setInt(5, cliente.getNumero());
        pst.setString(6, cliente.getBairro());
        pst.setString(7, cliente.getCidade());
        pst.setString(8, cliente.getEstado());
        pst.setString(9, cliente.getEmail());
        pst.setString(10, cliente.getCpf());
        pst.setString(11, cliente.getRg());
        pst.setInt(12, cliente.getTelefoneComercial());
        pst.setInt(13, cliente.getTelefone());
        pst.setInt(14, cliente.getCelular());
        pst.execute();
        pst.close();
    }
    
    public void excluir (Cliente cliente) throws SQLException {
        
        sql = "delete from cliente where codigo=?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, cliente.getIdCliente());
        pst.execute();
        pst.close();
        
    }
    
    public void alterar(Cliente cliente) throws SQLException{
    
        sql = "update cliente set nome_cliente=?, data_nasc=?, endereco=?, numero=?, bairro=?, cidade=?, estado=?, email=?, cpf=?, rg=?, telefone_comercial=?, telefone=?, celular=? where id_cliente=?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, cliente.getNomeCliente());
        pst.setString(2, cliente.getDataNascimento());
        pst.setString(3, cliente.getEndereco());
        pst.setInt(4, cliente.getNumero());
        pst.setString(5, cliente.getBairro());
        pst.setString(6, cliente.getCidade());
        pst.setString(7, cliente.getEstado());
        pst.setString(8, cliente.getEmail());
        pst.setString(9, cliente.getCpf());
        pst.setString(10, cliente.getRg());
        pst.setInt(11, cliente.getTelefoneComercial());
        pst.setInt(12, cliente.getTelefone());
        pst.setInt(13, cliente.getCelular());
        pst.execute();
        pst.close();
    
    }
}
