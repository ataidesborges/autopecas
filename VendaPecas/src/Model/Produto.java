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
    private int idMarca;
    private String nomeProduto;
    private int quantidade;
    private String unidade;
    private double valorCusto;
    private double valorVenda;
    private String data;

    public Produto() {
    }

    public Produto(int idProduto, String codigo_barras, int idMarca, String nomeProduto, int quantidade, String unidade, double valorCusto, double valorVenda, String data) {
        this.idProduto = idProduto;
        this.codigo_barras = codigo_barras;
        this.idMarca = idMarca;
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
        this.unidade = unidade;
        this.valorCusto = valorCusto;
        this.valorVenda = valorVenda;
        this.data = data;
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

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
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

