/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Larissa
 */
public class Produto {

    private int idProduto;
    private String codigobarras;
    private String marca;
    private String nomeproduto;
    private int quantidade;
    private String unidade;
    private double valorcusto;
    private double valorvenda;
    private String data;
    private String forneprod;

    public Produto() {
    }

    
    public Produto(int idProduto, String codigobarras, String marca, String nomeproduto, int quantidade, String unidade, double valorcusto, double valorvenda, String data, String forneprod) {
        this.idProduto = idProduto;
        this.codigobarras = codigobarras;
        this.marca = marca;
        this.nomeproduto = nomeproduto;
        this.quantidade = quantidade;
        this.unidade = unidade;
        this.valorcusto = valorcusto;
        this.valorvenda = valorvenda;
        this.data = data;
        this.forneprod = forneprod;
    }

    
    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public void setCodigobarras(String codigobarras) {
        this.codigobarras = codigobarras;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setNomeproduto(String nomeproduto) {
        this.nomeproduto = nomeproduto;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public void setValorcusto(double valorcusto) {
        this.valorcusto = valorcusto;
    }

    public void setValorvenda(double valorvenda) {
        this.valorvenda = valorvenda;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setForneprod(String forneprod) {
        this.forneprod = forneprod;
    }

    
    public int getIdProduto() {
        return idProduto;
    }

    public String getCodigobarras() {
        return codigobarras;
    }

    public String getMarca() {
        return marca;
    }

    public String getNomeproduto() {
        return nomeproduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getUnidade() {
        return unidade;
    }

    public double getValorcusto() {
        return valorcusto;
    }

    public double getValorvenda() {
        return valorvenda;
    }

    public String getData() {
        return data;
    }

    public String getForneprod() {
        return forneprod;
    }
    
    
  
}
