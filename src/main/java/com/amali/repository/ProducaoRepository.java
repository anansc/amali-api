package com.amali.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amali.model.Producao;

@Repository
public interface ProducaoRepository extends JpaRepository<Producao, Long> {

}