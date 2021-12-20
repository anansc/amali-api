package com.amali.controller;

import java.util.List;
import org.springframework.web.bind.annotation.RestController;

import com.amali.model.Alunos;
import com.amali.repository.AlunosRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/alunos")

public class AlunosController {
	
	@Autowired
	private AlunosRepository alunosRepository;
	
	@GetMapping
	public ResponseEntity<List<Alunos>> findAll() {
	    List<Alunos> result = alunosRepository.findAll();
	    return ResponseEntity.ok(result);
	}
	
	@GetMapping(value ="/page")
	public ResponseEntity<Page<Alunos>> findAll(Pageable pageable) {
	    Page<Alunos> result = alunosRepository.findAll(pageable);
	    return ResponseEntity.ok(result);
	}
	@GetMapping(value ="/pMunicipio")
	public ResponseEntity<List<Alunos>> findOrderByMunicipioEsfera(
			@RequestParam(defaultValue = "") String municipio,
			@RequestParam(defaultValue = "") String esferaGoverno,
			Sort sort
			) {
	    List<Alunos> result = alunosRepository.searchMunicipioEsfera(municipio, esferaGoverno,(Sort.by(Sort.Direction.ASC,"municipio")));
	    return ResponseEntity.ok(result);
	}
	@GetMapping(value ="/pModalidade")
	public ResponseEntity<List<Alunos>> findOrderByMunicipioEsferaModalidade(
			@RequestParam(defaultValue = "") String municipio,
			@RequestParam(defaultValue = "") String esferaGoverno,
			@RequestParam(defaultValue = "") String etapaEnsino,
			Sort sort
			) {
	    List<Alunos> result = alunosRepository.searchMunicipioEsferaModalidade(municipio, esferaGoverno,etapaEnsino, (Sort.by(Sort.Direction.ASC,"municipio")));
	    return ResponseEntity.ok(result);
	}
	
	
	
	@PostMapping
	public Alunos adicionar (@RequestBody Alunos alunos) {
		return alunosRepository.save(alunos);
	}

}
