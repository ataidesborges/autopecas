/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Funcionário;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.sql.ResultSet;
import java.util.ArrayList;


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
    public Funcionário recuperaFuncionario(int id) throws SQLException{
        Funcionário func = new Funcionário();
        sql = "select * from funcionario where id=?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, id);
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            func.setIdFuncionario(rs.getInt("id_funcionario"));
            func.setNomeFunc(rs.getString("nome_func"));
            func.setCpf(rs.getString("cpf"));
            func.setCidade(rs.getString("cidade"));
            func.setEstado(rs.getString("estado"));
            func.setCelular(rs.getInt("celular"));
            func.setTelefone(rs.getInt("telefone"));
            func.setEndereco(rs.getString("endereco"));
            func.setUsuario(rs.getString("usuario"));
            func.setSenha(rs.getString("senha"));
            func.setEmail(rs.getString("email"));
            func.setBairro(rs.getString("bairro"));
            func.setDatanascimento(rs.getString("data_nasc"));
            func.setComplemento(rs.getString("complemento"));
            
        }
        pst.close();
        return func;
    
    }
    public List<Funcionário> ListaFuncionario(int id_funcionario) throws SQLException{
    List<Funcionário> listafuncionario;
    listafuncionario = new ArrayList<>();
    sql = "select * from cliente order by nome";
    pst = Conexao.getInstance().prepareStatement(sql);
    pst.setInt(1, id_funcionario);
    ResultSet rs = pst.executeQuery();
    
    while(rs.next()) {
        listafuncionario.add(new Funcionário(rs.getInt("id_funcionario"),rs.getString("nome_func"),
        rs.getString("email"),rs.getString("cpf"),rs.getInt("celular"), rs.getString("cidade"), rs.getString("estado"), 
        rs.getInt("telefone"),rs.getString("data_nasc"), rs.getString("endereco"),  rs.getString("bairro"),
         rs.getString("complemento")));
    }
    pst.close();
    return listafuncionario;
        
    }
    }



