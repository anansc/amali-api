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
public class Producao implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;
	protected int janeiro;
	protected int fevereiro;
	protected int marco;
	protected int abril;
	protected int maio;
	protected int junho;
	protected int julho;
	protected int agosto;
	protected int setembro;
	protected int outubro;
	protected int novembro;
	protected int dezembro;
	protected String ano;
	protected String tipo;

}
