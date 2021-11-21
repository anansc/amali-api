package com.amali.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amali.model.Alimentos;

@Repository
public interface AlimentosRepository extends JpaRepository<Alimentos, Long> {

}
