/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  chydoory teste
 * Created: 10/09/2017
 */

CREATE TABLE CLIENTE(
id_cliente int primary key not null auto_increment,
nome_cliente varchar (45),
data_nasc date,
endereco varchar (45),
numero int,
bairro varchar (45),
cidade varchar (45),
estado varchar (2),
email varchar (45),
cpf varchar (10),
rg varchar (10),
telefone_comercial int,
telefone int,
celular int
);

CREATE TABLE produto(
id_produto int primary key not null auto_increment,
codigo_barras varchar (45),
id_marca int,
nome_produto varchar (45),
quantidade int,
unidade varchar (45),
valor_custo double,
valor_venda double,
data date
);
CREATE TABLE funcionario(
id_funcionario int primary key not null auto_increment,
nome_func varchar (45),
email varchar (45),
cpf varchar (10),
celular int,
usuario varchar(45),
senha varchar(45)
);