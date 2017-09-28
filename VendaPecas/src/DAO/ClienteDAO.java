/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Model.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Larissa
 */
public class ClienteDAO {
    PreparedStatement pst;
    String sql;
    
    public void salvar (Cliente cliente) throws SQLException{
        sql = "insert into cliente values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
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
        pst.setString(15, cliente.getComplemento());
        pst.execute();
        pst.close();
    }
    
    public void excluir (Cliente cliente) throws SQLException {
        
        sql = "delete from cliente where id_cliente=?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, cliente.getIdCliente());
        pst.execute();
        pst.close();
        
    }
    
    public void alterar(Cliente cliente) throws SQLException{
    
        sql = "update cliente set nome_cliente=?, data_nasc=?, endereco=?, numero=?, bairro=?, cidade=?, estado=?, email=?, cpf=?, rg=?, telefone_comercial=?, telefone=?, celular=?, complemento=? where id_cliente=?";
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
        pst.setString(14, cliente.getComplemento());
        pst.setInt(15, cliente.getIdCliente());
        pst.execute();
        pst.close();
    
    }
    public Cliente recuperaCliente(int id) throws SQLException{
        
        Cliente cli = new Cliente();
        sql = "select * from cliente where id_cliente=?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, id);
        ResultSet rs = pst.executeQuery();
        
        while(rs.next()){
            cli.setIdCliente(rs.getInt("idCliente"));
            cli.setNomeCliente(rs.getString("nomeCliente"));
            cli.setDataNascimento(rs.getString("dataNascimento"));
            cli.setCpf(rs.getString("cpf"));
            cli.setRg(rs.getString("rg"));
            cli.setCidade(rs.getString("cidade"));
            cli.setEstado(rs.getString("estado"));
            cli.setEndereco(rs.getString("endereco"));
            cli.setBairro(rs.getString("bairro"));
            cli.setNumero(rs.getInt("numero"));  
            cli.setComplemento(rs.getString("complemento"));
            cli.setTelefone(rs.getInt("telefone"));
            cli.setTelefoneComercial(rs.getInt("telefonecomercial"));
            cli.setCelular(rs.getInt("celular"));
            cli.setEmail(rs.getString("email"));
       
        }
        pst.close();
        return cli;
    }       
   
    public List<Cliente> ListaCliente(int idCliente) throws SQLException{
    List<Cliente> listaClientes;
    listaClientes = new ArrayList<>();
    sql = "select * from cliente order by nome";
    pst = Conexao.getInstance().prepareStatement(sql);
    pst.setInt(1, idCliente);
    ResultSet rs = pst.executeQuery();
    
    while(rs.next()) {
        listaClientes.add(new Cliente(rs.getInt("idCliente"), rs.getString("nomeCliente"),
                                                 rs.getString("cpf"), rs.getInt("telefone")));
    }
    pst.close();
    return listaClientes;
    }
}
