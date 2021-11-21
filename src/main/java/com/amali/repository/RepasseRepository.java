package com.amali.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.amali.model.Repasse;

@Repository
public interface RepasseRepository extends JpaRepository<Repasse, Long> {

	@Query("SELECT obj FROM Repasse obj WHERE LOWER(obj.municipio) LIKE LOWER(:municipio)")
	List<Repasse> searchMunicipio(@Param("municipio") String municipio);

}