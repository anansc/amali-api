package com.amali.controller;

import java.util.List;
import org.springframework.web.bind.annotation.RestController;

import com.amali.model.Organizacoes;
import com.amali.repository.OrganizacoesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/organizacoes")

public class OrganizacoesController {

	@Autowired
	private OrganizacoesRepository organizacoesRepository;

	@GetMapping
	public ResponseEntity<List<Organizacoes>> findAll() {
		List<Organizacoes> result = organizacoesRepository.findAll();
		return ResponseEntity.ok(result);
	}

	@GetMapping(value = "/page")
	public ResponseEntity<Page<Organizacoes>> findAll(Pageable pageable) {
		Page<Organizacoes> result = organizacoesRepository.findAll(pageable);
		return ResponseEntity.ok(result);
	}

	@PostMapping
	public Organizacoes adicionar(@RequestBody Organizacoes organizacoes) {
		return organizacoesRepository.save(organizacoes);
	}

}
