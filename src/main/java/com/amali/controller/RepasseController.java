package com.amali.controller;

import java.util.List;
import org.springframework.web.bind.annotation.RestController;

import com.amali.model.Repasse;
import com.amali.repository.RepasseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping(value = "/repasse")
public class RepasseController {
	
	@Autowired
	private RepasseRepository repasseRepository;
	
	@GetMapping
	public ResponseEntity<List<Repasse>> findAll() {
	    List<Repasse> result = repasseRepository.findAll();
	    return ResponseEntity.ok(result);
	}
	@GetMapping(value ="/page")
	public ResponseEntity<Page<Repasse>> findAll(Pageable pageable) {
	    Page<Repasse> result = repasseRepository.findAll(pageable);
	    return ResponseEntity.ok(result);
	}
	/*
	@GetMapping(value = "/lchart")
	public ResponseEntity<Page<Repasse>> searchByMunicipio(
			@RequestParam(defaultValue = "") String municipio,
			@RequestParam(defaultValue = "") String esferaGoverno,
			Pageable pageable)
	{
		Page<Repasse> result =  repasseRepository.searchMunicipio(municipio, esferaGoverno, pageable);
		return (ResponseEntity<Page<Repasse>>) ResponseEntity.ok(result);
	}
	*/
	
	@GetMapping(value ="/pMunicipio")
	public ResponseEntity<List<Repasse>> findOrderByMunicipioEsfera(
			@RequestParam(defaultValue = "") String municipio,
			@RequestParam(defaultValue = "") String esferaGoverno,
			Sort sort
			) {
	    List<Repasse> result = repasseRepository.searchMunicipioEsfera(municipio, esferaGoverno,(Sort.by(Sort.Direction.ASC,"municipio")));
	    return ResponseEntity.ok(result);
	}
	@GetMapping(value ="/lchart/municipio")
	public ResponseEntity<List<Repasse>> findOrderByNomeMunicipio(
			@RequestParam(defaultValue = "") String municipio,
			Sort sort
			) {
	    List<Repasse> result = repasseRepository.searchMunicipio(municipio,(Sort.by(Sort.Direction.ASC,"municipio")));
	    return ResponseEntity.ok(result);
	}
	
	@GetMapping(value ="/lchart/ano")
	public ResponseEntity<List<Repasse>> findOrderByAno(
			@RequestParam(defaultValue = "") String ano,
			Sort sort) {
	    List<Repasse> result = repasseRepository.searchAno(ano,(Sort.by(Sort.Direction.ASC,"ano")));
	    return ResponseEntity.ok(result);
	}
	
	@GetMapping(value ="/lchart/modal")
	public ResponseEntity<List<Repasse>> findOrderByModalidade(
			@RequestParam(defaultValue = "") String modalidadeEnsino,
			Sort sort){
		List<Repasse> result = repasseRepository.searchModal(modalidadeEnsino,(Sort.by(Sort.Direction.ASC,"modalidadeEnsino")));
	    return ResponseEntity.ok(result);
	}
	

	@GetMapping(value ="/lchart/esfera")
	public ResponseEntity<List<Repasse>> findOrderByEsfera(
			@RequestParam(defaultValue = "") String esferaGoverno,
			Sort sort){
		List<Repasse> result = repasseRepository.searchEsfera(esferaGoverno,(Sort.by(Sort.Direction.ASC,"esferaGoverno")));
	    return ResponseEntity.ok(result);
	}
	

}
