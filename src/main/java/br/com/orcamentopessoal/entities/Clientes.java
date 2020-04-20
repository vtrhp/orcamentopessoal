package br.com.orcamentopessoal.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class Clientes {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idClientes;
	private String nome;
	private String sobrenome;
	private String cpf;
	private LocalDate dataNascimento;
	private String sexo;
	private LocalDate dtCadastro;
	private String email;
	private String celular;

	@OneToMany(mappedBy = "clientes", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Receitas> receitas;

	@OneToMany(mappedBy = "clientes", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Investimentos> investimentos;

	public List<Receitas> getReceitas() {
		return receitas;
	}

	public void setReceitas(List<Receitas> receitas) {
		this.receitas = receitas;
	}

	@Column(name = "id_cliente")
	public Long getIdClientes() {
		return idClientes;
	}

	public void setIdClientes(Long idClientes) {
		this.idClientes = idClientes;
	}

	@Column(name = "nome")
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Column(name = "sobrenome")
	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	@Column(name = "cpf")
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Column(name = "data_nascimento")
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Column(name = "sexo")
	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Column(name = "dt_cadastro")
	public LocalDate getDtCadastro() {
		return dtCadastro;
	}

	public void setDtCadastro(LocalDate dtCadastro) {
		this.dtCadastro = dtCadastro;
	}

	@Column(name = "email")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "celular")
	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public List<Investimentos> getInvestimentos() {
		return investimentos;
	}

	public void setInvestimentos(List<Investimentos> investimentos) {
		this.investimentos = investimentos;
	}
}