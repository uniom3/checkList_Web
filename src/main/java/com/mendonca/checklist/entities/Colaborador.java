package com.mendonca.checklist.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table(name = "TB_COLABORADOR")
public class Colaborador implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String telefone;
	private String celular1;
	private String celular2;
	private String cpf;
	private String nacionalidade;
	private String naturalidade;
	private String sexo;
	@PastOrPresent(message = "{PastOrPresent.colaborador.dataNascimento}")
	@DateTimeFormat(iso = ISO.DATE, pattern = "")
	@Column(name = "dataNascimento", columnDefinition = "DATE")
	private LocalDate dataNascimento;
	private String estadoCivil;
	private String rg;
	private String orgaoEmissor;
	@DateTimeFormat(iso = ISO.DATE, pattern = "")
	private LocalDate dataEmissao;
	private String tituloEleitor;
	private String cdi;
	private String cnh;
	private String conjuge;
	private String dependente1;
	private String dependente2;
	private String dependente3;
	@DateTimeFormat(iso = ISO.DATE, pattern = "")
	private LocalDate admissao;
	private String grau;
	private String curso;
	private String conlusao;
	private String grau1;
	private String curso1;
	private String conclusao1;
	@DateTimeFormat(iso = ISO.DATE, pattern = "")
	private LocalDate afastamento;
	private String motivoAfastamento;
	private String retorno;
	private String vencimentoContrato;
	private String prorrogacaoContrato;
	private String formaPagamento;
	private String demissao;
	private String tipoConta;
	private String banco;
	private String agencia;
	private String conta;
	private String digito;
	private Long id_documento_pk;
	 @NotBlank
	 @Size(min = 3, max = 255)
	 @Column(nullable = false)
	private String logradouro;

	 @NotBlank
	 @Size(min = 3, max = 255)
	 @Column(nullable = false)
	private String bairro;

	 @NotBlank
	 @Size(min = 3, max = 255)
	 @Column(nullable = false)
	private String cidade;

	 @NotNull(message = "{NotNull.uf}")
	 @Column(nullable = false, length = 2)
	@Enumerated(EnumType.STRING)
	private UF uf;

	 @NotBlank
	 @Size(min = 9, max = 9, message = "{Size.endereco.cep}")
	 @Column(nullable = false, length = 9)
	private String cep;

	 @NotNull(message = "{NotNull.endereco.numero}")
	 @Digits(integer = 5, fraction = 0)
	 @Column(nullable = false, length = 5)
	private Integer numero;

	 @Size(max = 255)
	private String complemento;
	private String pais;
	private Boolean ativo;
	private String pathImagem;
	@Lob
	private byte[] imagem;

	@NotNull(message = "{NotNull.colaborador.cargo}")
	@ManyToOne
	@JoinColumn(name = "cargo_id_fk")
	private Cargo cargo;

	public Colaborador() {

	}


	
	public Colaborador(Integer id, String nome, String telefone, String celular1, String celular2, String cpf,
			String nacionalidade, String naturalidade, String sexo,
			@PastOrPresent(message = "{PastOrPresent.colaborador.dataNascimento}") LocalDate dataNascimento,
			String estadoCivil, String rg, String orgaoEmissor, LocalDate dataEmissao, String tituloEleitor, String cdi,
			String cnh, String conjuge, String dependente1, String dependente2, String dependente3, LocalDate admissao,
			String grau, String curso, String conlusao, String grau1, String curso1, String conclusao1,
			LocalDate afastamento, String motivoAfastamento, String retorno, String vencimentoContrato,
			String prorrogacaoContrato, String formaPagamento, String demissao, String tipoConta, String banco,
			String agencia, String conta, String digito, Long id_documento_pk, String logradouro, String bairro,
			String cidade, UF uf, String cep, Integer numero, String complemento, String pais, Boolean ativo,
			String pathImagem, byte[] imagem, Cargo cargo) {
		super();
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.celular1 = celular1;
		this.celular2 = celular2;
		this.cpf = cpf;
		this.nacionalidade = nacionalidade;
		this.naturalidade = naturalidade;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
		this.estadoCivil = estadoCivil;
		this.rg = rg;
		this.orgaoEmissor = orgaoEmissor;
		this.dataEmissao = dataEmissao;
		this.tituloEleitor = tituloEleitor;
		this.cdi = cdi;
		this.cnh = cnh;
		this.conjuge = conjuge;
		this.dependente1 = dependente1;
		this.dependente2 = dependente2;
		this.dependente3 = dependente3;
		this.admissao = admissao;
		this.grau = grau;
		this.curso = curso;
		this.conlusao = conlusao;
		this.grau1 = grau1;
		this.curso1 = curso1;
		this.conclusao1 = conclusao1;
		this.afastamento = afastamento;
		this.motivoAfastamento = motivoAfastamento;
		this.retorno = retorno;
		this.vencimentoContrato = vencimentoContrato;
		this.prorrogacaoContrato = prorrogacaoContrato;
		this.formaPagamento = formaPagamento;
		this.demissao = demissao;
		this.tipoConta = tipoConta;
		this.banco = banco;
		this.agencia = agencia;
		this.conta = conta;
		this.digito = digito;
		this.id_documento_pk = id_documento_pk;
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.cep = cep;
		this.numero = numero;
		this.complemento = complemento;
		this.pais = pais;
		this.ativo = ativo;
		this.pathImagem = pathImagem;
		this.imagem = imagem;
		this.cargo = cargo;
	}



	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public byte[] getImagem() {
		return imagem;
	}

	public void setImagem(byte[] imagem) {
		this.imagem = imagem;
	}


	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular1() {
		return celular1;
	}

	public void setCelular1(String celular1) {
		this.celular1 = celular1;
	}

	public String getCelular2() {
		return celular2;
	}

	public void setCelular2(String celular2) {
		this.celular2 = celular2;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getOrgaoEmissor() {
		return orgaoEmissor;
	}

	public void setOrgaoEmissor(String orgaoEmissor) {
		this.orgaoEmissor = orgaoEmissor;
	}

	public LocalDate getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(LocalDate dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public String getTituloEleitor() {
		return tituloEleitor;
	}

	public void setTituloEleitor(String tituloEleitor) {
		this.tituloEleitor = tituloEleitor;
	}

	public String getCdi() {
		return cdi;
	}

	public void setCdi(String cdi) {
		this.cdi = cdi;
	}

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}

	public String getConjuge() {
		return conjuge;
	}

	public void setConjuge(String conjuge) {
		this.conjuge = conjuge;
	}

	public String getDependente1() {
		return dependente1;
	}

	public void setDependente1(String dependente1) {
		this.dependente1 = dependente1;
	}

	public String getDependente2() {
		return dependente2;
	}

	public void setDependente2(String dependente2) {
		this.dependente2 = dependente2;
	}

	public String getDependente3() {
		return dependente3;
	}

	public void setDependente3(String dependente3) {
		this.dependente3 = dependente3;
	}

	public LocalDate getAdmissao() {
		return admissao;
	}

	public void setAdmissao(LocalDate admissao) {
		this.admissao = admissao;
	}

	public String getGrau() {
		return grau;
	}

	public void setGrau(String grau) {
		this.grau = grau;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getConlusao() {
		return conlusao;
	}

	public void setConlusao(String conlusao) {
		this.conlusao = conlusao;
	}

	public String getGrau1() {
		return grau1;
	}

	public void setGrau1(String grau1) {
		this.grau1 = grau1;
	}

	public String getCurso1() {
		return curso1;
	}

	public void setCurso1(String curso1) {
		this.curso1 = curso1;
	}

	public String getConclusao1() {
		return conclusao1;
	}

	public void setConclusao1(String conclusao1) {
		this.conclusao1 = conclusao1;
	}

	public LocalDate getAfastamento() {
		return afastamento;
	}

	public void setAfastamento(LocalDate afastamento) {
		this.afastamento = afastamento;
	}

	public String getMotivoAfastamento() {
		return motivoAfastamento;
	}

	public void setMotivoAfastamento(String motivoAfastamento) {
		this.motivoAfastamento = motivoAfastamento;
	}

	public String getRetorno() {
		return retorno;
	}

	public void setRetorno(String retorno) {
		this.retorno = retorno;
	}

	public String getVencimentoContrato() {
		return vencimentoContrato;
	}

	public void setVencimentoContrato(String vencimentoContrato) {
		this.vencimentoContrato = vencimentoContrato;
	}

	public String getProrrogacaoContrato() {
		return prorrogacaoContrato;
	}

	public void setProrrogacaoContrato(String prorrogacaoContrato) {
		this.prorrogacaoContrato = prorrogacaoContrato;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public String getDemissao() {
		return demissao;
	}

	public void setDemissao(String demissao) {
		this.demissao = demissao;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public String getDigito() {
		return digito;
	}

	public void setDigito(String digito) {
		this.digito = digito;
	}

	public Long getId_documento_pk() {
		return id_documento_pk;
	}

	public void setId_documento_pk(Long id_documento_pk) {
		this.id_documento_pk = id_documento_pk;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public UF getUf() {
		return uf;
	}

	public void setUf(UF uf) {
		this.uf = uf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Colaborador other = (Colaborador) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public String getPathImagem() {
		return pathImagem;
	}

	public void setPathImagem(String pathImagem) {
		this.pathImagem = pathImagem;
	}


	public Boolean getAtivo() {
		return ativo;
	}


	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

}