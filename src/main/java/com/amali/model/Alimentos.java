package com.amali.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Alimentos implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int ano;
	private String estado;
	private String municipio;
	private String entidadeExecutora;
	private String agriculturaFamiliar;
	private String organico;
	private String nomeProduto;
	private String documentoDespesa;
	private String unidadeMedida;
	private double qtComprada;
	private double valorUnitario;
	private double valorTotal;
	
	public Alimentos() {
	}

	public Alimentos(Long id, int ano, String estado, String municipio, String entidadeExecutora,
			String agriculturaFamiliar, String organico, String nomeProduto, String documentoDespesa,
			String unidadeMedida, double qtComprada, double valorUnitario, double valorTotal) {
		super();
		this.id = id;
		this.ano = ano;
		this.estado = estado;
		this.municipio = municipio;
		this.entidadeExecutora = entidadeExecutora;
		this.agriculturaFamiliar = agriculturaFamiliar;
		this.organico = organico;
		this.nomeProduto = nomeProduto;
		this.documentoDespesa = documentoDespesa;
		this.unidadeMedida = unidadeMedida;
		this.qtComprada = qtComprada;
		this.valorUnitario = valorUnitario;
		this.valorTotal = valorTotal;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getEntidadeExecutora() {
		return entidadeExecutora;
	}

	public void setEntidadeExecutora(String entidadeExecutora) {
		this.entidadeExecutora = entidadeExecutora;
	}

	public String getAgriculturaFamiliar() {
		return agriculturaFamiliar;
	}

	public void setAgriculturaFamiliar(String agriculturaFamiliar) {
		this.agriculturaFamiliar = agriculturaFamiliar;
	}

	public String getOrganico() {
		return organico;
	}

	public void setOrganico(String organico) {
		this.organico = organico;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getDocumentoDespesa() {
		return documentoDespesa;
	}

	public void setDocumentoDespesa(String documentoDespesa) {
		this.documentoDespesa = documentoDespesa;
	}

	public String getUnidadeMedida() {
		return unidadeMedida;
	}

	public void setUnidadeMedida(String unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}

	public double getQtComprada() {
		return qtComprada;
	}

	public void setQtComprada(double qtComprada) {
		this.qtComprada = qtComprada;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alimentos other = (Alimentos) obj;
		return Objects.equals(id, other.id);
	}
	
	

}
