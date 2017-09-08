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

    public Funcionário() {
    }

    public Funcionário(int idFuncionario, String nomeFunc, String email, String cpf, int celular, String usuario, String senha) {
        this.idFuncionario = idFuncionario;
        this.nomeFunc = nomeFunc;
        this.email = email;
        this.cpf = cpf;
        this.celular = celular;
        this.usuario = usuario;
        this.senha = senha;
    }



    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getNomeFunc() {
        return nomeFunc;
    }

    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


}
