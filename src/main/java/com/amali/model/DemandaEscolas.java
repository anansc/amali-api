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
public class DemandaEscolas implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;

	private int janeiro;

	private int fevereiro;

	private int marco;

	private int abril;

	private int maio;

	private int junho;

	private int julho;

	private int agosto;

	private int setembro;

	private int outubro;

	private int novembro;

	private int dezembro;

	private String ano;

	private String tipo;

}
