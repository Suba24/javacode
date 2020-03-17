package com.arithmentic.operation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arithmentic.operation.model.DataEntity;

@Repository
public interface CalculationRepository extends JpaRepository<DataEntity, Integer>{
	
}
