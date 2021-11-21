package com.amali.controller;

import java.util.List;
import org.springframework.web.bind.annotation.RestController;

import com.amali.model.Repasse;
import com.amali.repository.RepasseRepository;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	@GetMapping(value = "/lchart")
	public ResponseEntity<List<Repasse>> searchByMunicipio(
			@RequestParam(defaultValue = "") String municipio)
	{
		List<Repasse> result =  repasseRepository.searchMunicipio(municipio);
		return ResponseEntity.ok(result);
	}


}
