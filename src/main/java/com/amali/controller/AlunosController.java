package com.amali.controller;

import java.util.List;
import org.springframework.web.bind.annotation.RestController;

import com.amali.model.Alunos;
import com.amali.model.Repasse;
import com.amali.repository.AlunosRepository;
import com.amali.repository.RepasseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

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
	
	/*@Autowired
	private AlunosRepository alunosRepository;
	
	@GetMapping
	public List<Alunos> listar() {
		return alunosRepository.findAll();
	}
	*/
	@PostMapping
	public Alunos adicionar (@RequestBody Alunos alunos) {
		return alunosRepository.save(alunos);
	}

}
