/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author enascimento
 */
public class Cliente {
    private int idCliente;
    private String nomeCliente;
    private String endereco;
    private int numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String email;
    private String cpf;
    private String rg;
    private int telefoneComercial;
    private String dataNascimento;
    private int telefone;
    private int celular;
    private String complemento;

    public Cliente() {
    }

    public Cliente(int idCliente, String nomeCliente, String cpf, int telefone) {
        this.idCliente = idCliente;
        this.nomeCliente = nomeCliente;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    
    public Cliente(int idCliente, String nomeCliente, String endereco, int numero, String bairro, String cidade, String estado, String email, String cpf, String rg, int telefoneComercial, String dataNascimento, int telefone, int celular, String complemento) {
        this.idCliente = idCliente;
        this.nomeCliente = nomeCliente;
        this.endereco = endereco;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.email = email;
        this.cpf = cpf;
        this.rg = rg;
        this.telefoneComercial = telefoneComercial;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.celular = celular;
        this.complemento = complemento;
    }
    
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setTelefoneComercial(int telefoneComercial) {
        this.telefoneComercial = telefoneComercial;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    
    public int getIdCliente() {
        return idCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public int getTelefoneComercial() {
        return telefoneComercial;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public int getTelefone() {
        return telefone;
    }

    public int getCelular() {
        return celular;
    }

    public String getComplemento() {
        return complemento;
    }

   
    
}
