
create table if not exists clientes(
	id_cliente integer auto_increment primary key,
	nome varchar(255),
	sobrenome varchar(255),
	cpf varchar(255),
	data_nascimento date,
	sexo char(2)
)engine = innodb;

create table if not exists receitas(
	id_receitas integer auto_increment primary key,
	id_cliente integer,
	aluguel double,
	pensao double,
	horas_extras double,
	decimo_terceiro_salario double,
	ferias double,
	outros double
)engine = innodb;

alter table receitas add constraint fk_cliente_receita foreign key (id_cliente) references clientes (id_cliente);