package com.amali.controller;

import java.util.List;
import org.springframework.web.bind.annotation.RestController;

import com.amali.model.Produtos;
import com.amali.repository.ProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/produtos")

public class ProdutosController {

	@Autowired
	private ProdutosRepository produtosRepository;

	@GetMapping
	public ResponseEntity<List<Produtos>> findAll() {
		List<Produtos> result = produtosRepository.findAll();
		return ResponseEntity.ok(result);
	}

	@GetMapping(value = "/page")
	public ResponseEntity<Page<Produtos>> findAll(Pageable pageable) {
		Page<Produtos> result = produtosRepository.findAll(pageable);
		return ResponseEntity.ok(result);
	}

	@PostMapping
	public Produtos adicionar(@RequestBody Produtos produtos) {
		return produtosRepository.save(produtos);
	}

}