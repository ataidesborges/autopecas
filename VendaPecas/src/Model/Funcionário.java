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
public class Funcionário {
private int  idFuncionario;
private String nomeFunc;
private String email;
private String cpf;
private int celular;
private String usuario;
private String senha;
private String cidade;
private String estado;
private int telefone;
private String datanascimento;
private String endereco;
private String bairro;
private String complemento;
private int numero;

    public Funcionário() {
    }

    public Funcionário(int idFuncionario, String nomeFunc, String cpf, int telefone) {
        this.idFuncionario = idFuncionario;
        this.nomeFunc = nomeFunc;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public Funcionário(int idFuncionario, String nomeFunc, String email, String cpf, int celular, String usuario, String senha, String cidade, String estado, int telefone, String datanascimento, String endereco, String bairro, String complemento, int numero) {
        this.idFuncionario = idFuncionario;
        this.nomeFunc = nomeFunc;
        this.email = email;
        this.cpf = cpf;
        this.celular = celular;
        this.usuario = usuario;
        this.senha = senha;
        this.cidade = cidade;
        this.estado = estado;
        this.telefone = telefone;
        this.datanascimento = datanascimento;
        this.endereco = endereco;
        this.bairro = bairro;
        this.complemento = complemento;
        this.numero = numero;
    }

   
    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public void setDatanascimento(String datanascimento) {
        this.datanascimento = datanascimento;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


    public int getIdFuncionario() {
        return idFuncionario;
    }

    public String getNomeFunc() {
        return nomeFunc;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }

    public int getCelular() {
        return celular;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getSenha() {
        return senha;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public int getTelefone() {
        return telefone;
    }

    public String getDatanascimento() {
        return datanascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public int getNumero() {
        return numero;
    }



}