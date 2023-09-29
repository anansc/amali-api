package com.amali.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.amali.model.Alunos;

@Repository
public interface AlunosRepository extends JpaRepository<Alunos, Long> {

	@Query("SELECT obj FROM Alunos obj WHERE LOWER(obj.municipio) LIKE LOWER(:municipio) AND LOWER(obj.esferaGoverno) LIKE LOWER(:esferaGoverno)")
	List<Alunos> searchMunicipioEsfera(@Param("municipio") String municipio,
			@Param("esferaGoverno") String esferaGoverno, Sort sort);

	@Query("SELECT obj FROM Alunos obj WHERE LOWER(obj.municipio) LIKE LOWER(:municipio) AND LOWER(obj.esferaGoverno) LIKE LOWER(:esferaGoverno) AND LOWER(obj.etapaEnsino) LIKE LOWER(:etapaEnsino)")
	List<Alunos> searchMunicipioEsferaModalidade(@Param("municipio") String municipio,
			@Param("esferaGoverno") String esferaGoverno, @Param("etapaEnsino") String etapaEnsino, Sort sort);

}