package com.amali.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amali.model.EscolasAtendidas;

@Repository
public interface EscolasAtendidasRepository extends JpaRepository<EscolasAtendidas, Long> {

}