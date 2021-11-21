package com.amali.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Repasse implements Serializable{
	private static final long serialVersionUID = 1L;
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long    id;
		private int    ano;
		private String municipio;
		private String esferaGoverno;
		private String modalidadeEnsino;
		private double valorTotalEscolas;
		
		public Repasse() {
		}

		public Repasse(Long id, int ano, String municipio, String esferaGoverno, String modalidadeEnsino,
				double valorTotalEscolas) {
			this.id = id;
			this.ano = ano;
			this.municipio = municipio;
			this.esferaGoverno = esferaGoverno;
			this.modalidadeEnsino = modalidadeEnsino;
			this.valorTotalEscolas = valorTotalEscolas;
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

		public String getModalidadeEnsino() {
			return modalidadeEnsino;
		}

		public void setModalidadeEnsino(String modalidadeEnsino) {
			this.modalidadeEnsino = modalidadeEnsino;
		}

		public double getValorTotalEscolas() {
			return valorTotalEscolas;
		}

		public void setValorTotalEscolas(double valorTotalEscolas) {
			this.valorTotalEscolas = valorTotalEscolas;
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
			Repasse other = (Repasse) obj;
			return Objects.equals(id, other.id);
		}
}
