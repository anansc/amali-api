package com.amali.controller;

import java.util.List;
import org.springframework.web.bind.annotation.RestController;

import com.amali.model.EscolasAtendidas;
import com.amali.repository.EscolasAtendidasRepository;

import org.springframework.data.domain.Sort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/escolas_atendidas")
public class EscolasAtendidasController {

	@Autowired
	private EscolasAtendidasRepository escolasAtendidasRepository;
	
	@GetMapping
	public ResponseEntity<List<EscolasAtendidas>> findAll() {
	    List<EscolasAtendidas> result = escolasAtendidasRepository.findAll();
	    return ResponseEntity.ok(result);
	}
	
	@GetMapping(value ="/page")
	public ResponseEntity<Page<EscolasAtendidas>> findAll(Pageable pageable) {
	    Page<EscolasAtendidas> result = escolasAtendidasRepository.findAll(pageable);
	    return ResponseEntity.ok(result);
	}
	
	@GetMapping(value ="/pMunicipio")
	public ResponseEntity<List<EscolasAtendidas>> findOrderByMunicipioEsfera(
			@RequestParam(defaultValue = "") String municipio,
			@RequestParam(defaultValue = "") String esferaGoverno,
			Sort sort
			) {
	    List<EscolasAtendidas> result = escolasAtendidasRepository.searchMunicipioEsfera(municipio, esferaGoverno,(Sort.by(Sort.Direction.ASC,"municipio")));
	    return ResponseEntity.ok(result);
	}
	
	
	
	
}
