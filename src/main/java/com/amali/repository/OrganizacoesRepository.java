package com.amali.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amali.model.Organizacoes;

@Repository
public interface OrganizacoesRepository extends JpaRepository<Organizacoes, Long> {

}