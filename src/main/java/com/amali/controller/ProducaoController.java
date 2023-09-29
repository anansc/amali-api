package com.amali.controller;

import java.util.List;
import org.springframework.web.bind.annotation.RestController;

import com.amali.model.Producao;
import com.amali.repository.ProducaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/producao")

public class ProducaoController {

	@Autowired
	private ProducaoRepository producaoRepository;

	@GetMapping
	public ResponseEntity<List<Producao>> findAll() {
		List<Producao> result = producaoRepository.findAll();
		return ResponseEntity.ok(result);
	}

	@GetMapping(value = "/page")
	public ResponseEntity<Page<Producao>> findAll(Pageable pageable) {
		Page<Producao> result = producaoRepository.findAll(pageable);
		return ResponseEntity.ok(result);
	}

	@PostMapping
	public Producao adicionar(@RequestBody Producao producao) {
		return producaoRepository.save(producao);
	}

}
