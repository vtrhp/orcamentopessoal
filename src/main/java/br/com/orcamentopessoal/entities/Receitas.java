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
@Table(name = "receitas")
public class Receitas {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idReceitas;
	private BigDecimal aluguel;
	private BigDecimal pensao;
	private BigDecimal horasExtras;
	private BigDecimal DecimoTerceiroSalario;
	private BigDecimal ferias;
	private BigDecimal outros;
	private LocalDate dtLancamento;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_cliente", nullable = false)
	private Clientes clientes;

	public Clientes getClientes() {
		return clientes;
	}

	public void setClientes(Clientes clientes) {
		this.clientes = clientes;
	}

	@Column(name = "id_receitas")
	public Long getIdReceitas() {
		return idReceitas;
	}

	public void setIdReceitas(Long idReceitas) {
		this.idReceitas = idReceitas;
	}

	@Column(name = "aluguel")
	public BigDecimal getAluguel() {
		return aluguel;
	}

	public void setAluguel(BigDecimal aluguel) {
		this.aluguel = aluguel;
	}

	@Column(name = "pensao")
	public BigDecimal getPensao() {
		return pensao;
	}

	public void setPensao(BigDecimal pensao) {
		this.pensao = pensao;
	}

	@Column(name = "horas_extras")
	public BigDecimal getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(BigDecimal horasExtras) {
		this.horasExtras = horasExtras;
	}

	@Column(name = "decimo_terceiro_salario")
	public BigDecimal getDecimoTerceiroSalario() {
		return DecimoTerceiroSalario;
	}

	public void setDecimoTerceiroSalario(BigDecimal decimoTerceiroSalario) {
		DecimoTerceiroSalario = decimoTerceiroSalario;
	}

	@Column(name = "ferias")
	public BigDecimal getFerias() {
		return ferias;
	}

	public void setFerias(BigDecimal ferias) {
		this.ferias = ferias;
	}

	@Column(name = "outros")
	public BigDecimal getOutros() {
		return outros;
	}

	public void setOutros(BigDecimal outros) {
		this.outros = outros;
	}

	@Column(name = "dt_lancamento")
	public LocalDate getDtLancamento() {
		return dtLancamento;
	}

	public void setDtLancamento(LocalDate dtLancamento) {
		this.dtLancamento = dtLancamento;
	}
}