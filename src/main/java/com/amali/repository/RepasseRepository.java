package com.amali.repository;


import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.amali.model.Repasse;

@Repository
public interface RepasseRepository extends JpaRepository<Repasse, Long> {

	
    @Query("SELECT obj FROM Repasse obj WHERE LOWER(obj.municipio) LIKE LOWER(:municipio) AND LOWER(obj.esferaGoverno) LIKE LOWER(:esferaGoverno)")
	List<Repasse> searchMunicipioEsfera(@Param("municipio") String municipio,
			@Param("esferaGoverno") String esferaGoverno, Sort sort);
	
    
    @Query("SELECT obj FROM Repasse obj WHERE LOWER(obj.municipio) LIKE LOWER(:municipio)")
	List<Repasse> searchMunicipio(@Param("municipio") String municipio, Sort sort);

    
    @Query("SELECT obj FROM Repasse obj WHERE LOWER(obj.ano) LIKE LOWER(:ano)")
	List<Repasse> searchAno(@Param("ano") String ano, Sort sort);

    
    @Query("SELECT obj FROM Repasse obj WHERE LOWER(obj.modalidadeEnsino) LIKE LOWER(:modalidadeEnsino)")
	List<Repasse> searchModal(@Param("modalidadeEnsino") String modalidadeEnsino, Sort sort);
    
    
    @Query("SELECT obj FROM Repasse obj WHERE LOWER(obj.esferaGoverno) LIKE LOWER(:esferaGoverno)")
	List<Repasse> searchEsfera(@Param("esferaGoverno") String esferaGoverno, Sort sort);
    
    
    
}