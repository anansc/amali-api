package com.amali.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amali.model.Alimentos;
import com.amali.model.Repasse;
import com.amali.repository.AlimentosRepository;
import com.amali.repository.RepasseRepository;


@RestController
@RequestMapping("/alimentos")
public class AlimentosController {
	
	@Autowired
	private AlimentosRepository alimentosRepository;
	
	@GetMapping
	public ResponseEntity<List<Alimentos>> findAll() {
	    List<Alimentos> result = alimentosRepository.findAll();
	    return ResponseEntity.ok(result);
	}
	
	@GetMapping(value ="/page")
	public ResponseEntity<Page<Alimentos>> findAll(Pageable pageable) {
	    Page<Alimentos> result = alimentosRepository.findAll(pageable);
	    return ResponseEntity.ok(result);
	}
	
	/*
	@Autowired
	private AlimentosRepository repasseRepository;
	
	@GetMapping
	public List<Alimentos> listar() {
		return repasseRepository.findAll();
	}
	*/

}