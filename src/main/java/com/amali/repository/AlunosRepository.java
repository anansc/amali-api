package com.amali.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amali.model.Alunos;

@Repository
public interface AlunosRepository extends JpaRepository<Alunos, Long> {

}