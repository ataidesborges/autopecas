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
}
