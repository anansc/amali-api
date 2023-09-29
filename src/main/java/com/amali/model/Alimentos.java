package com.amali.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Alimentos implements Serializable {

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

}
