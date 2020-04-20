
create table if not exists clientes(
	id_cliente integer auto_increment primary key,
	nome varchar(255),
	sobrenome varchar(255),
	cpf varchar(255),
	data_nascimento date,
	sexo char(2),
	dt_cadastro date,
	email varchar(255),
	celular varchar(255)
)engine = innodb;

create table if not exists receitas(
	id_receitas integer auto_increment primary key,
	id_cliente integer,
	aluguel double,
	pensao double,
	horas_extras double,
	decimo_terceiro_salario double,
	ferias double,
	outros double,
	dt_lancamento date
)engine = innodb;

create table if not exists investimentos(
	id_investimentos integer auto_increment primary key,
	id_cliente integer,
	acoes double,
	tesouro_direto double,
	renda_fixa double,
	previdencia_privada double,
	outros double,	
	dt_lancamento date
)engine = innodb;

alter table receitas add constraint fk_cliente_receita foreign key (id_cliente) references clientes (id_cliente);
alter table investimentos add constraint fk_cliente_investimento foreign key (id_cliente) references clientes (id_cliente);