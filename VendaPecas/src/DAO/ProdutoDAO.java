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
        pst.setString(2, produto.getNomeProduto());
        pst.setInt(3, produto.getQuantidade());
        pst.setString(4, produto.getMarca());
        pst.setString(5, produto.getCodigo_barras());
        pst.setString(6, produto.getUnidade());
        pst.setDouble(7, produto.getValorCusto());
        pst.setDouble(8, produto.getValorVenda());
        pst.setString(9, produto.getData());                
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
}
