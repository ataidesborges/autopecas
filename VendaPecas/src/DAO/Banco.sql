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
data_nasc varchar(15),
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
celular int,
complemento varchar(45)
);

CREATE TABLE produto(
id_produto int primary key not null auto_increment,
codigo_barras varchar (45),
marca varchar(30),
nome_produto varchar (45),
quantidade int,
unidade varchar (45),
valor_custo double,
valor_venda double,
data varchar(15),
fornecedor varchar(30)
);
CREATE TABLE funcionario(
id_funcionario int primary key not null auto_increment,
nome_func varchar (45),
email varchar (45),
cpf varchar (10),
celular int(11),
usuario varchar(45),
senha varchar(45),
cidade varchar(45),
estado varchar(45),
telefone int(11),
data_nasc varchar(14),
endereco varchar(14),
bairro varchar(45),
complemento varchar(45),
numero int(11)
);


