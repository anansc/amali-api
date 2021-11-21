package com.amali.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amali.model.Escolas;

@Repository
public interface EscolasRepository extends JpaRepository<Escolas, Long> {

}