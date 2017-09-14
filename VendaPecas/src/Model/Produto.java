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
    private String codigo_barras;
    private String Marca;
    private String nomeProduto;
    private int quantidade;
    private String unidade;
    private double valorCusto;
    private double valorVenda;
    private String data;
    private String forneprod;

    public Produto(int idProduto, String codigo_barras, String Marca, String nomeProduto, int quantidade, String unidade, double valorCusto, double valorVenda, String data, String forneprod) {
        this.idProduto = idProduto;
        this.codigo_barras = codigo_barras;
        this.Marca = Marca;
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
        this.unidade = unidade;
        this.valorCusto = valorCusto;
        this.valorVenda = valorVenda;
        this.data = data;
        this.forneprod = forneprod;
    }

    public Produto() {
    }
    

    public String getForneprod() {
        return forneprod;
    }

    public void setForneprod(String forneprod) {
        this.forneprod = forneprod;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getCodigo_barras() {
        return codigo_barras;
    }

    public void setCodigo_barras(String codigo_barras) {
        this.codigo_barras = codigo_barras;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public double getValorCusto() {
        return valorCusto;
    }

    public void setValorCusto(double valorCusto) {
        this.valorCusto = valorCusto;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
