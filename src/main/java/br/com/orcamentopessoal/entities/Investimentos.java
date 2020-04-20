package br.com.orcamentopessoal.entities;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "investimentos")
public class Investimentos {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idInvestimentos;
	private BigDecimal acoes;
	private BigDecimal tesouroDireto;
	private BigDecimal Rendafixa;
	private BigDecimal PrevidenciaPrivada;
	private BigDecimal outros;
	private LocalDate dtLancamento;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_cliente", nullable = false)
	private Clientes clientes;

	@Column(name = "id_investimentos")
	public Integer getIdInvestimentos() {
		return idInvestimentos;
	}

	@Column(name = "acoes")
	public BigDecimal getAcoes() {
		return acoes;
	}

	@Column(name = "tesouro_direto")
	public BigDecimal getTesouroDireto() {
		return tesouroDireto;
	}

	@Column(name = "renda_fixa")
	public BigDecimal getRendafixa() {
		return Rendafixa;
	}

	@Column(name = "previdencia_privada")
	public BigDecimal getPrevidenciaPrivada() {
		return PrevidenciaPrivada;
	}

	@Column(name = "outros")
	public BigDecimal getOutros() {
		return outros;
	}

	@Column(name = "dt_lancamento")
	public LocalDate getDtLancamento() {
		return dtLancamento;
	}

	public Clientes getClientes() {
		return clientes;
	}

	public void setIdInvestimentos(Integer idInvestimentos) {
		this.idInvestimentos = idInvestimentos;
	}

	public void setAcoes(BigDecimal acoes) {
		this.acoes = acoes;
	}

	public void setTesouroDireto(BigDecimal tesouroDireto) {
		this.tesouroDireto = tesouroDireto;
	}

	public void setRendafixa(BigDecimal rendafixa) {
		Rendafixa = rendafixa;
	}

	public void setPrevidenciaPrivada(BigDecimal previdenciaPrivada) {
		PrevidenciaPrivada = previdenciaPrivada;
	}

	public void setOutros(BigDecimal outros) {
		this.outros = outros;
	}

	public void setDtLancamento(LocalDate dtLancamento) {
		this.dtLancamento = dtLancamento;
	}

	public void setClientes(Clientes clientes) {
		this.clientes = clientes;
	}

}
