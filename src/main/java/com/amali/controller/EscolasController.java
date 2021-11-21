package com.amali.controller;

import java.util.List;
import org.springframework.web.bind.annotation.RestController;

import com.amali.model.Escolas;
import com.amali.repository.EscolasRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/escolas")

public class EscolasController {
	
	@Autowired
	private EscolasRepository escolasRepository;
	
	@GetMapping
	public ResponseEntity<List<Escolas>> findAll() {
	    List<Escolas> result = escolasRepository.findAll();
	    return ResponseEntity.ok(result);
	}
	
	@GetMapping(value ="/page")
	public ResponseEntity<Page<Escolas>> findAll(Pageable pageable) {
	    Page<Escolas> result = escolasRepository.findAll(pageable);
	    return ResponseEntity.ok(result);
	}
	
	/*@Autowired
	private EscolasRepository escolasRepository;
	
	@GetMapping
	public List<Escolas> listar() {
		return escolasRepository.findAll();
	}
	*/
	@PostMapping
	public Escolas adicionar (@RequestBody Escolas escolas) {
		return escolasRepository.save(escolas);
	}

}
