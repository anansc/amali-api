package com.amali.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amali.model.DemandaEscolas;

@Repository
public interface DemandaEscolasRepository extends JpaRepository<DemandaEscolas, Long> {

}