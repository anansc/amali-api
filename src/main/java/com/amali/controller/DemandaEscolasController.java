package com.amali.controller;

import java.util.List;
import org.springframework.web.bind.annotation.RestController;

import com.amali.model.DemandaEscolas;
import com.amali.repository.DemandaEscolasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/demandaEscolas")

public class DemandaEscolasController {

	@Autowired
	private DemandaEscolasRepository demandaEscolasRepository;

	@GetMapping
	public ResponseEntity<List<DemandaEscolas>> findAll() {
		List<DemandaEscolas> result = demandaEscolasRepository.findAll();
		return ResponseEntity.ok(result);
	}

	@GetMapping(value = "/page")
	public ResponseEntity<Page<DemandaEscolas>> findAll(Pageable pageable) {
		Page<DemandaEscolas> result = demandaEscolasRepository.findAll(pageable);
		return ResponseEntity.ok(result);
	}

	@PostMapping
	public DemandaEscolas adicionar(@RequestBody DemandaEscolas demandaEscolas) {
		return demandaEscolasRepository.save(demandaEscolas);
	}

}
