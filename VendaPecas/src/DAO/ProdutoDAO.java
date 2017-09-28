/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Produto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
    
     public Produto recuperaProduto(int id) throws SQLException{
        
        Produto pro = new Produto();
        sql = "select * from produto where id=?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, id);
        ResultSet rs = pst.executeQuery();
        
        while(rs.next()){
            pro.setIdProduto(rs.getInt("idProduto"));
            pro.setNomeproduto(rs.getString("nomeproduto"));
            pro.setCodigobarras(rs.getString("codigobarras"));
            pro.setMarca(rs.getString("marca"));
            pro.setQuantidade(rs.getInt("quantidade"));
            pro.setUnidade(rs.getString("unidade"));
            pro.setValorcusto(rs.getDouble("valorcusto"));
            pro.setValorvenda(rs.getDouble("valorvenda"));
            pro.setData(rs.getString("data"));
            pro.setForneprod(rs.getString("forneprod"));  
            
       
        }
        pst.close();
        return pro;
    }       
   
    
     public List<Produto> ListaProduto(int idProduto) throws SQLException{
    List<Produto> listaProdutos;
    listaProdutos = new ArrayList<>();
    sql = "select * from produto order by nome";
    pst = Conexao.getInstance().prepareStatement(sql);
    pst.setInt(1, idProduto);
    ResultSet rs = pst.executeQuery();
    
    while(rs.next()) {
        listaProdutos.add(new Produto(rs.getInt("idProduto"), rs.getString("nomeproduto"),
                                      rs.getString("codigobarras"), rs.getString("marca"), rs.getInt("quantidade"), rs.getString("unidade"),
                                      rs.getDouble("valorcusto"), rs.getDouble("valorvenda"), rs.getString("data"), rs.getString("forneprod")));
                                      
                                    
    }
    pst.close();
    return listaProdutos;
    }
}


