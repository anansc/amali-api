package com.amali.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EscolasAtendidas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String ano;
	private String municipio;
	private String esferaGoverno;
	private int qtEscolasAtendidas;
	
	
	public EscolasAtendidas() {}
	
	public EscolasAtendidas(Long id, String ano, String municipio, String esferaGoverno, int qtEscolasAtendidas) {
		super();
		this.id = id;
		this.ano = ano;
		this.municipio = municipio;
		this.esferaGoverno = esferaGoverno;
		this.qtEscolasAtendidas = qtEscolasAtendidas;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getEsferaGoverno() {
		return esferaGoverno;
	}
	public void setEsferaGoverno(String esferaGoverno) {
		this.esferaGoverno = esferaGoverno;
	}
	public int getQtEscolasAtendidas() {
		return qtEscolasAtendidas;
	}
	public void setQtEscolasAtendidas(int qtEscolasAtendidas) {
		this.qtEscolasAtendidas = qtEscolasAtendidas;
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
		EscolasAtendidas other = (EscolasAtendidas) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
