package com.amali.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.amali.model.EscolasAtendidas;

@Repository
public interface EscolasAtendidasRepository extends JpaRepository<EscolasAtendidas, Long> {

	@Query("SELECT obj FROM EscolasAtendidas obj WHERE LOWER(obj.municipio) LIKE LOWER(:municipio) AND LOWER(obj.esferaGoverno) LIKE LOWER(:esferaGoverno)")
	List<EscolasAtendidas> searchMunicipioEsfera(@Param("municipio") String municipio,
			@Param("esferaGoverno") String esferaGoverno, Sort sort);
}