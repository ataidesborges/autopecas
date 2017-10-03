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

    public void salvar(Funcionário funcionario) throws SQLException {
        sql = "insert into funcionario values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, 0);
        pst.setString(2, funcionario.getNomeFunc());
        pst.setString(3, funcionario.getEmail());
        pst.setString(4, funcionario.getCpf());
        pst.setInt(5, funcionario.getCelular());
        pst.setString(6, funcionario.getUsuario());
        pst.setString(7, funcionario.getSenha());
        pst.setString(8, funcionario.getCidade());
        pst.setString(9, funcionario.getEstado());
        pst.setInt(10, funcionario.getTelefone());
        pst.setString(11, funcionario.getDatanascimento());
        pst.setString(12, funcionario.getEndereco());
        pst.setString(13, funcionario.getBairro());
        pst.setString(14, funcionario.getComplemento());
        pst.setInt(15, funcionario.getNumero());
        pst.execute();
        pst.close();
    }

    public void excluir(Funcionário funcionario) throws SQLException {

        sql = "delete from funcionario where id_funcionario=?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, funcionario.getIdFuncionario());
        pst.execute();
        pst.close();

    }

    public void alterar(Funcionário funcionario) throws SQLException {
        sql = "update funcionario set nome_func=?, cpf=?, celular=?, email=?, usuario=?, senha=?, cidade=?, estado=?, telefone=?, data_nasc=?, endereco=?, bairro=?, complemento=?, numero=? where id_funcionario=?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, funcionario.getNomeFunc());
        pst.setString(2, funcionario.getEmail());
        pst.setString(3, funcionario.getCpf());
        pst.setInt(4, funcionario.getCelular());
        pst.setString(5, funcionario.getUsuario());
        pst.setString(6, funcionario.getSenha());
        pst.setString(7, funcionario.getCidade());
        pst.setString(8, funcionario.getEstado());
        pst.setInt(9, funcionario.getTelefone());
        pst.setString(10, funcionario.getDatanascimento());
        pst.setString(11, funcionario.getEndereco());
        pst.setString(12, funcionario.getBairro());
        pst.setString(13, funcionario.getComplemento());
        pst.setInt(14, funcionario.getNumero());
        pst.setInt(15, funcionario.getIdFuncionario());
        pst.execute();
        pst.close();

    }

    public Funcionário recuperaFuncionario(int id_funcionario) throws SQLException {
        Funcionário func = new Funcionário();
        sql = "select * from funcionario where id_funcionario=?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, id_funcionario);
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

    public List<Funcionário> ListaFuncionario() throws SQLException {
        List<Funcionário> listaFuncionarios;
        listaFuncionarios = new ArrayList<>();
        sql = "select id_funcionario, nome_func,cpf,telefone from funcionario";
        pst = Conexao.getInstance().prepareStatement(sql);
        //pst.setInt(1, id_funcionario);
        ResultSet rs = pst.executeQuery();

        while (rs.next()) {
            listaFuncionarios.add(new Funcionário(rs.getInt("id_funcionario"), rs.getString("nome_func"),
                    rs.getString("cpf"), rs.getInt("telefone")));
        }
        pst.close();
        return listaFuncionarios;
    }
}
