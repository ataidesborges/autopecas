/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Produto;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author Ataides
 */
public class ProdutoDAO {
    PreparedStatement pst;
    String sql;
    
    public void salvar (Produto produto) throws SQLException{
        sql = "insert into cliente values(?,?,?,?,?,?,?,?,?,)";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, 0);
        pst.setString(2, produto.getNomeproduto());
        pst.setInt(3, produto.getQuantidade());
        pst.setString(4, produto.getMarca());
        pst.setString(5, produto.getCodigobarras());
        pst.setString(6, produto.getUnidade());
        pst.setDouble(7, produto.getValorcusto());
        pst.setDouble(8, produto.getValorvenda());
        pst.setString(9, produto.getData()); 
        pst.setString(10, produto.getForneprod());
        pst.execute();
        pst.close();
    }
    
    public void excluir (Produto produto) throws SQLException {
        
        sql = "delete from cliente where codigo=?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, produto.getIdProduto());
        pst.execute();
        pst.close();    
}
    public void alterar(Produto produto) throws SQLException{
    
        sql = "update produto set codigo_barras=?, id_marca=?, nome_produto=?, quantidade=?, unidade=?, valor_custo=?, valor_venda=?, data=?, forneprod=? where id_produto=?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, produto.getCodigobarras());
        pst.setString(2, produto.getMarca());
        pst.setString(3, produto.getNomeproduto());
        pst.setInt(4, produto.getQuantidade());
        pst.setString(5, produto.getUnidade());
        pst.setDouble(6, produto.getValorcusto());
        pst.setDouble(7, produto.getValorvenda());
        pst.setString(8, produto.getData());
        pst.setString(9, produto.getForneprod());
        pst.setInt(10, produto.getIdProduto());
        pst.execute();
        pst.close();
    
    }
}
